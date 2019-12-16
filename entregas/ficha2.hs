import Test.QuickCheck
import System.IO
import Data.List (nub)

--NovoProp: nome, nif, email,morada
--NovoCliente:nome,nif,email,morada,X,Y
--NovoCarro:tipo,marca,matricula,nif,velocidade media,preço por km, consumo por km, autonomia, X, Y
--Aluguer: nif cliente, X destino, Y destino, tipoCombustivel , preferencia
--Classificar: matricula ou nif (cliente ou prop) , nota (0-100)

firstNames = ["Maria","Leonor","Matilde","Beatriz","Ana","Mariana","Madalena","Catarina","Carolina","Francisca","Joao","Santiago","Martim","Rodrigo","Afonso","Francisco","Tiago","Diogo","Miguel","Tomas"]

lastNames = ["Silva","Santos","Ferreira","Pereira","Oliveira","Costa","Rodrigues","Martins","Jesus","Sousa","Fernandes","Goncalves","Gomes","Lopes","Marques","Alves","Almeida","Ribeiro","Pinto","Carvalho","Teixeira","Moreira","Correia","Mendes","Nunes"]

listaMoradas = ["Miranda do Douro","Fundao","Castelo de Vide","Cuba","Gouveia","Chamusca","Matosinhos","Freixo de Espada a Cinta","Borba","Sabrosa","Sines","Mascoutim","Cascais","Marco de Canaveses","Grandola","Castro Verde","Penalva do Castelo","Portel","Pacos de Ferreira","Cadaval","Estremoz","Grandola","Sernancelhe","Penamacor","Oliveira do Hospital","Vila de Rei","Ribeira de Pena","Sobral de Monte Agraço","Crato","Almodovar","Coimbra","Viana do Castelo","Santa Marta de Penaguiao","Batalha","Viseu","Elvas","Avis","Monchique","Anadia","Tomar","Benavente","Murtosa","Faro","Cancelos","Chamusca"]

listaMarcas = ["Audi", "Alfa Romeu","Abarth", "BMW","Chevrolet", "Citroen", "Dacia", "Ferrari", "Ford", "Honda", "Hiunday", "KIA", "Mazda", "Mercedes", "Mistubishi","Nissan", "Opel", "Peugeot", "Porsche", "Renaut", "Seat", "Suzuki", "Tesla", "Toyota", "Volvo", "VW"]

data NovoCarro = NovoCarro Tipo Marca Matricula NIF Vmedia PKM CPKm Autonomia X Y
          deriving Show

data NovoCliente = NovoCliente Nome NIF Email Morada X Y
          deriving Show

data NovoProp = NovoProp Nome NIF Email Morada
          deriving Show

data Aluguer = Aluguer NIF X Y TipoComb Preferencia
          deriving Show

data Classificar = Classificar NIF Nota
          deriving Show

data Tipo = Combustão
          | Eletrico
          | Hibrido
          deriving Show

data TipoComb = Gasolina
              | Gasoleo
              | Eletricidade
              deriving Show

type Nota = Word
type Marca = String
type Matricula = String
type NIF = String
type PKM = Float -- preço por KM
type Vmedia = Float -- Velocidade media
type CPKm =  Float-- Consumo por Km
type Autonomia = Int
type X = Double
type Y = Double
type Preferencia = String
type Email = String
type Nome = String
type Morada = String

genNome :: Gen Nome
genNome = do fn <- elements firstNames
             ln <- elements lastNames
             return (fn++" "++ln)

genMorada:: Gen Morada
genMorada = elements listaMoradas

genTipoCombustivel:: Gen TipoComb
genTipoCombustivel = frequency [(55, return Gasolina), (40, return Gasoleo), (5, return Eletricidade)]

genPreferencia :: Gen Preferencia
genPreferencia = frequency [(60, return "MaisPerto"), (40, return "MaisBarato")]

genNota:: Gen Word
genNota = choose(0,100)

genVMedia:: Gen Vmedia
genVMedia = choose(20,200)

genX:: Gen X
genX  = choose(-1000.0,1000.0)

genY:: Gen Y
genY  = choose(-1000.0,1000.0)

genPKM:: Gen Float
genPKM = choose(0,1000)

genMarca :: Gen String
genMarca = elements listaMarcas

genTipo :: Gen Tipo
genTipo = frequency [(75, return Combustão), (25, return Hibrido), (5, return Eletrico)]

genCPKm :: Gen CPKm
genCPKm = choose(1, 12)

genAutonomia :: Gen Autonomia
genAutonomia = choose(0,1000)

genMultMat::Int -> Gen [Matricula]
genMultMat n = genMultMataux n []

genMultMataux 0 l = return l
genMultMataux n l = do mat<- genMatricula
                       if (mat `elem` l) then genMultMataux n l else genMultMataux (n-1) (mat:l)

genMatricula :: Gen Matricula
genMatricula = do l <- vectorOf 2 $ elements ['A'..'Z']
                  n <- vectorOf 2 $ elements ['0'..'9']
                  nn <- vectorOf 2 $ elements ['0'..'9']
                  return (l ++ "-"++n++"-"++nn)

genMultEmail::Int -> Gen [Email]
genMultEmail n = genMultEmailaux n []

genMultEmailaux 0 l = return l
genMultEmailaux n l = do email<- genEmail
                         if (email `elem` l) then genMultEmailaux n l else genMultEmailaux (n-1) (email:l)
    
genEmail :: Gen Email
genEmail = do l <- vectorOf 5 $ elements ['A'..'Z']
              n <- vectorOf 2 $ elements ['0'..'9']
              return (l++n++"@gmail.com")

genNIF :: Gen NIF
genNIF = vectorOf 9 $ elements ['0'..'9']

genMultNIF::Int -> Gen [NIF]
genMultNIF n = genMultNIFaux n []

genMultNIFaux 0 l = return l
genMultNIFaux n l = do nif<- genNIF
                       if (nif `elem` l) then genMultNIFaux n l else genMultNIFaux (n-1) (nif:l)

genNCarro::[NIF]->[Email]-> Gen [NovoCarro]
genNCarro _ [] = return []
genNCarro [] _ = return []
genNCarro (x:xs) (y:ys) = do carro <- genCarro x y
                             resto <- genNCarro xs ys
                             return (carro:resto)

genCarro :: NIF -> Matricula -> Gen NovoCarro
genCarro nif matricula= do tipo <- genTipo 
                           marca <- genMarca
                           cpkm <- genCPKm
                           autonomia <- genAutonomia
                           vmedia <- genVMedia
                           pkm <- genPKM
                           x <- genX
                           y <- genY
                           return (NovoCarro tipo marca matricula nif vmedia pkm cpkm autonomia x y)

genNCliente::[NIF]->[Email]-> Gen [NovoCliente]
genNCliente _ [] = return []
genNCliente [] _ = return []
genNCliente (x:xs) (y:ys) =  do cliente <- genCliente x y
                                resto <- genNCliente xs ys
                                return (cliente:resto)

genCliente:: NIF -> Email ->Gen NovoCliente
genCliente nif email = do nome <- genNome
                          morada <- genMorada
                          x <- genX
                          y <- genY
                          return (NovoCliente nome nif email morada x y)

genNProp::[NIF]->[Email]-> Gen [NovoProp]
genNProp _ [] = return []
genNProp [] _ = return []
genNProp (x:xs) (y:ys) = do prop <- genProp x y
                            resto <- genNProp xs ys
                            return (prop:resto)

genProp:: NIF ->Email -> Gen NovoProp
genProp  nif  email = do nome <- genNome
                         morada <- genMorada
                         return (NovoProp nome nif email morada)

genNAluguer:: [NIF] -> Gen [Aluguer]
genNAluguer [] = return []
genNAluguer (x:xs) = do aluguer <- genAluguer x
                        resto <- genNAluguer xs
                        return (aluguer:resto)

genAluguer:: NIF -> Gen Aluguer
genAluguer nif = do x <- genX
                    y <- genY
                    tcomb <- genTipoCombustivel
                    pref <- genPreferencia
                    return (Aluguer nif x y tcomb pref)

genNClassificar:: [NIF] -> Gen [Classificar]
genNClassificar [] = return []
genNClassificar (x:xs) = do h <- genClassificar x
                            resto <- genNClassificar xs
                            return (h:resto)

genClassificar:: NIF -> Gen Classificar
genClassificar ident = do nota <- genNota
                          return (Classificar ident nota)

generator::IO()
generator = do  handle <- openFile "logs_umcarroja.txt" WriteMode
                propNifs <- generate (genMultNIF 100)
                cliNifs <- generate (genMultNIF 100)
                matriculas <- generate (genMultMat 10)
                propEmails <- generate (genMultEmail 10)
                cliEmails <- generate (genMultEmail 10)
                carros <- generate (genNCarro propNifs matriculas)
                clientes <- generate (genNCliente cliNifs cliEmails)
                prop <- generate (genNProp propNifs propEmails)
                aluguer <- generate (genNAluguer cliNifs)
                classProp <- generate (genNClassificar propNifs)
                classCli <- generate (genNClassificar cliNifs)
                mapM_ (\x -> hPrint handle x) carros
                mapM_ (\x -> hPrint handle x) clientes
                mapM_ (\x -> hPrint handle x) prop
                mapM_ (\x -> hPrint handle x) aluguer
                mapM_ (\x -> hPrint handle x) classProp
                mapM_ (\x -> hPrint handle x) classCli
                hClose handle
