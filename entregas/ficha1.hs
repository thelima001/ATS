import Parser
import Prelude hiding ((<*>),(<$>))


data Exp = AddExp Exp Exp
        | MulExp Exp Exp
        | SubExp Exp Exp
        | GThen Exp Exp
        | LThen Exp Exp
        | OneExp Exp
        | Var String
        | Const Int

instance Show Exp where 
    show = showExp

showExp (AddExp e1 e2) = showExp e1 ++ "+" ++ showExp e2
showExp (SubExp e1 e2) = showExp e1 ++ "-" ++ showExp e2
showExp (MulExp e1 e2) = showExp e1 ++ "*" ++ showExp e2
showExp (GThen e1 e2) = showExp e1 ++ ">" ++ showExp e2
showExp (OneExp e) = "(" ++ showExp e ++ ")"
showExp (Const i) = show i
showExp (Var a) = a

isDigit x = x `elem` ['0'..'9']
isChar x = x `elem` (['a'..'z']++['A'..'Z'])

ident = f <$> satisfy isChar
    <|> g <$> satisfy isChar <*> ident
    where f a = [a]
          g a b = a:b

number = f <$> satisfy isDigit
    <|> g <$> satisfy isDigit <*> number
    where f a = [a]
          g a b = a:b

pexp = f <$> pterm
    <|> g <$> pterm <*> symbol '+' <*> pexp
    <|> h <$> pterm <*> symbol '-' <*> pexp
    where f a = a
          g a b c = AddExp a c
          h a b c = SubExp a c

pterm = f <$> pfactor
    <|> g <$> pfactor <*> symbol '*' <*> pterm
    where f a = a
          g a b c = MulExp a c
    
pfactor :: Parser Char Exp
pfactor = f <$> number
        <|> g <$> ident
        <|> h <$> symbol '(' <*> pexp <*> symbol ')'
        where f a = Const (read a)
              g a = Var a
              h a e f = OneExp e

data Stat = While Exp Stats
          | IfThenElse Exp Stats Stats
          | Assign String Exp

data Stats = Stats [Stat]

data Prog = Prog Stats

instance Show Prog where
    show = showProg

showProg (Prog sts) = showStats sts

instance Show Stats where
    show = showStats

showStats (Stats l) = showStatsList l

showStatsList [] = ""
showStatsList (st:[]) = showStat st
showStatsList (st:sts) = showStat st ++ ";\n " ++ (showStatsList sts)

instance Show Stat where
    show = showStat

showStat (Assign n e) = n ++ " = " ++ showExp e
showStat (While e sts) = "while (" ++ showExp e ++ ")\n " ++ "{ " ++ showStats sts ++ "}"

pProg :: Parser Char Prog
pProg = f <$> pStats
        where f a = Prog a

pStats = g <$> oneOrMore pStat
        where g a = Stats a

pStat = f <$> pexp <*> pStats
        <|> g <$> pexp <*> pStats <*> pStats
        <|> h <$> ident <*> pexp
        where f a b = While a b
              g a b c = IfThenElse a b c
              h a b = Assign a b