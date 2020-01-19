package controller;

import exceptions.*;
import model.*;
import view.Menu;
import view.viewmodel.*;

import java.util.*;
import java.util.stream.Collectors;

public class Controller {
    private final UMCarroJa model;
    private User user;
    private final Menu menu;
    
    private String erroInvalidNewRegisterException = "Parametros Inválidos";
    private String erroUserExistsException = "Utilizador já existe";
    private String erroNoCarAvaliableException = "No cars availables";
    private String erroInvalidNewRentalException = "Novo Rental inválido";
    private String erroInvalidTimeIntervalException = "Intervalo Inválido";
    private String erroInvalidParameters = "Invalid parameters";
    
    public Controller(UMCarroJa model) {
        this.menu = new Menu();
        this.model = model;
    }

    public void run(){
        String error = "";
        while(this.menu.getRun()) {
            switch (menu.getMenu()) {
                case LOGIN:
                	error = login(error);
                    break;
                    
                case REGISTERCLIENT:
                	error = registerClient(error);
                    break;
                    
                case REGISTEROWNER:
                	error = registerOwner(error);
                    break;
                    
                case CLOSEST:
                	error = caracteristic(error, "MaisPerto");
                    break;
                    
                case CHEAPEST:
                	error = caracteristic(error, "MaisBarato");
                    break;
                    
                case REVIEWRENTAL:
                	error = reviewRental(error);
                    break;

                case CHEAPESTNEAR:
                	error = cheapestNear(error);
                    break;

                case AUTONOMY:
                	error = autonomy(error);
                    break;

                case SPECIFIC:
                	error = specific(error);
                    break;

                case ADDCAR:
                	error = addCar(error);
                    break;

                case NUSES:
                	error = nUses(error);
                    break;

                case DISTANCE:
                	error = distance(error);
                    break;

                case CAROVERVIEW:
                	error = carOverview(error);
                    break;

                case PENDING:
                	error = pending(error);
                    break;

                case HISTORYOWNER:
                	error = historyOwner(error);
                    break;

                case HISTORYCLIENT:
                	error = historyClient(error);
                    break;

                default:
                    this.menu.parser();
                    break;
            }
        }
    }
    
    private String login(String error) {
        try {
            NewLogin r = menu.newLogin(error);
            user = model.logIn(r.getUser(), r.getPassword());
            menu.selectOption((user instanceof Client) ? Menu.MenuInd.CLIENT : Menu.MenuInd.OWNER);
            error = "";
        } catch (InvalidUserException e) {
            error = "Invalid Username";
        } catch (WrongPasswordExecption e) {
            error = "Invalid Password";
        }
        return error;
    }

    private String registerClient(String error) {
        try {
            RegisterUser registerUserCli = menu.newRegisterUser(error);
            Client client = new Client(
                    registerUserCli.getPos(),
                    registerUserCli.getEmail(),
                    registerUserCli.getPasswd(),
                    registerUserCli.getName(),
                    registerUserCli.getAddress(),
                    registerUserCli.getNif()
            );
            this.model.addUser(client);
            menu.back();
            error = "";
        } catch (InvalidNewRegisterException e) {
            error = erroInvalidNewRegisterException;
        } catch (UserExistsException e) {
            error = erroUserExistsException;
        }
        return error;
    }

    private String registerOwner(String error) {
        try {
            RegisterUser registerUserProp = menu.newRegisterUser(error);
            Owner owner = new Owner(
                    registerUserProp.getEmail(),
                    registerUserProp.getName(),
                    registerUserProp.getAddress(),
                    registerUserProp.getNif(),
                    registerUserProp.getPasswd()
            );
            this.model.addUser(owner);
            menu.back();
            error = "";
        } catch (InvalidNewRegisterException e) {
            error = erroInvalidNewRegisterException;
        } catch (UserExistsException e) {
            error = erroUserExistsException;
        }
        return error;
    }

    private String caracteristic(String error, String caracteristica) {
        try {
            RentCarSimple rent = menu.simpleCarRent(error);
            Rental rental = model.rental(
                    (Client) user,
                    rent.getPoint(),
                    caracteristica,
                    rent.getCarType());
            menu.showString(rental.toString());
            menu.back();
            error = "";
            
        } 
        catch (UnknownCompareTypeException ignored) {}
        catch (NoCarAvaliableException e) { error = erroNoCarAvaliableException; }
        catch (InvalidNewRentalException e){ error = erroInvalidNewRentalException; }
        
        return error;
    }

    private String reviewRental(String error) {
        Owner owner = (Owner) this.user;
        List<Rental> lR = owner.getPending();
        if (lR.isEmpty()) {
            this.menu.back();
        }
        else {
            String v = menu.reviewRentShow(
                    error,
                    owner.getRates(),
                    lR.stream()
                            .map(Rental::toParsableUserString)
                            .map(x -> Arrays.asList(x.split("\n")))
                            .collect(Collectors.toList()));

            try {
                switch (v.charAt(0)) {
                    case 'a':
                        this.model.rent(lR.get(Integer.parseInt(v.substring(1)) - 1));
                        this.model.rate(
                                owner,
                                lR.get(Integer.parseInt(v.substring(1)) - 1),
                                this.menu.showRentalRate(
                                        lR.get(Integer.parseInt(v.substring(1)) - 1).toFinalString()));
                        break;
                    case 'r':
                        this.model.refuse(owner, lR.get(Integer.parseInt(v.substring(1)) - 1));
                        break;
                    case 'b':
                        this.menu.back();
                        break;
                    default:
                        break;
                }
                error = "";
            } catch (NumberFormatException | IndexOutOfBoundsException e) {
                error = "Input Inválido";
            }
        }
        return error;
    }

    private String cheapestNear(String error) {
        try {
            CheapestNearCar walkCar = menu.walkingDistanceRent(error);

            Rental rental = model.rental(
                    (Client) user,
                    walkCar.getPoint(),
                    walkCar.getWalkDistance(),
                    walkCar.getType()
            );

            this.menu.showString(rental.toString());
            this.menu.back();
            error = "";
        } catch (InvalidNewRentalException e) {
            error = erroInvalidNewRentalException;
        } catch (NoCarAvaliableException e) {
            error = erroNoCarAvaliableException;
        }
        return error;
    }

    private String autonomy(String error) {
        try {
            AutonomyCar autoCar = menu.autonomyCarRent(error);

            Rental rental = model.rental(
                    autoCar.getPoint(),
                    autoCar.getAutonomy(),
                    autoCar.getType(),
                    (Client) user);

            menu.showString(rental.toString());
            this.menu.back();
            error = "";
        } catch (InvalidNewRentalException e) {
            error = erroInvalidNewRentalException;
        } catch (NoCarAvaliableException e) {
            error = erroNoCarAvaliableException;
        }
        return error;
    }

    private String specific(String error) {
        try {
            SpecificCar sc = this.menu.specificCarRent(error);
            Rental rental = this.model.rental(sc.getPoint(), sc.getNumberPlate(), (Client) user);
            this.menu.showString(rental.toString());
            this.menu.back();
            error = "";
        } catch (NoCarAvaliableException e) {
            error = "Carro não está disponível";
        } catch (InvalidCarException e) {
            error = "Carro não existe";
        } catch (InvalidNewRentalException e) {
            error = erroInvalidParameters;
        }
        return error;
    }

    private String addCar(String error) {
        try {
            RegisterCar registerCar = menu.newRegisterCar(error);
            Owner ownerCar = (Owner) this.user;
            model.addCar(
                    ownerCar,
                    registerCar.getNumberPlate(),
                    registerCar.getType(),
                    registerCar.getAvgSpeed(),
                    registerCar.getBasePrice(),
                    registerCar.getGasMileage(),
                    registerCar.getRange(),
                    registerCar.getPos(),
                    registerCar.getBrand()
            );
            menu.back();
            error = "";
        } catch (InvalidNewRegisterException e) {
            error = erroInvalidNewRegisterException;
        } catch (CarExistsException e) {
            error = "Carro já existe";
        } catch (InvalidUserException ignored) {}
        return error;
    }

    private String nUses(String error) {
        menu.top10ClientsShow(
                this.model.getBestClientsTimes()
                        .stream()
                        .map(x ->
                                Arrays.asList(
                                        x.getKey(),
                                        x.getValue().toString()))
                        .limit(10)
                        .collect(Collectors.toList()),
                "Número de Utilizações");
        this.menu.back();
        return error;
    }

    private String distance(String error) {
        menu.top10ClientsShow(
                this.model.getBestClientsTravel()
                        .stream()
                        .map(x ->
                                Arrays.asList(
                                        x.getKey(),
                                        String.format("%.2f", x.getValue())))
                        .limit(10)
                        .collect(Collectors.toList()),
                "Distância");
        this.menu.back();
        return error;
    }

    private String carOverview(String error) {
        Owner ownerCar = (Owner) this.user;
        String action = this.menu.carOverviewShow(error,
                ownerCar.getCars().stream()
                        .map(x -> Arrays.asList(x.toString().split("\n")))
                        .collect(Collectors.toList()));
        try {
            switch (action.charAt(0)) {
                case ' ':
                    break;
                case 'r':
                    model.refil(ownerCar, Integer.parseInt(action.substring(1)) - 1);
                    break;
                case 'c':
                    String[] s = action.substring(1).split(" ");
                    if (s.length != 2)
                        throw new InvalidNumberOfArgumentsException();
                    model.setBasePrice(ownerCar, Integer.parseInt(s[0]) - 1, Double.parseDouble(s[1]));
                    break;
                case 'd':
                    model.swapState(ownerCar, Integer.parseInt(action.substring(1)) - 1);
                    break;
                case 't':
                    TimeInterval ti = this.menu.getTimeInterval(error);
                    this.menu.showString("Total faturado: " +
                            model.getTotalBilledCar(
                                    ownerCar.getCars().get(Integer.parseInt(action.substring(1)) - 1),
                                    ti.getInicio(),
                                    ti.getFim()));
                    break;
                case 'b':
                    this.menu.back();
                    break;

                default:
                    throw new InvalidNumberOfArgumentsException();
            }
            error = "";
        } catch (IndexOutOfBoundsException e) {
            error = "Valor de carro inválido";
        } catch (NumberFormatException e) {
            error = "Posição inválida";
        } catch (InvalidNumberOfArgumentsException e) {
            error = erroInvalidParameters;
        } catch (InvalidTimeIntervalException e) {
            error = "Formato Inválido de Data";
        }
        return error;
    }

    private String pending(String error) {
        try {
            Client cli = (Client) user;
            List<Rental> pR = cli.getPendingRates();

            if (pR.isEmpty()) {
                this.menu.back();
            }
            else {
                RateOwnerCar r = this.menu.pendingRateShow(error, pR.get(0).toString(), pR.size());

                model.rate(cli, pR.get(0), r.getOwnerRate(), r.getCarRate());

                error = "";
            }
        } catch (InvalidRatingException e) {
            error = erroInvalidNewRegisterException;
        }
        return error;
    }

    private String historyOwner(String error) {
        try {
            TimeInterval ti = this.menu.getTimeInterval(error);

            this.menu.rentalHistoryShow(ti,
                    this.model.getRentalListOwner((Owner) this.user, ti.getInicio(), ti.getFim())
                            .stream()
                            .map(Rental::toParsableOwnerRentalString)
                            .map(x -> Arrays.asList(x.split("\n")))
                            .collect(Collectors.toList()));

            this.menu.back();
            error = "";
        } catch (InvalidTimeIntervalException e) {
            error = erroInvalidTimeIntervalException;
        }
        return error;
    }

    private String historyClient(String error) {
        try {
            TimeInterval ti = this.menu.getTimeInterval(error);

            this.menu.rentalHistoryShow(ti,
                    this.model.getRentalListClient((Client) this.user, ti.getInicio(), ti.getFim())
                            .stream()
                            .map(Rental::toParsableUserRentalString)
                            .map(x -> Arrays.asList(x.split("\n")))
                            .collect(Collectors.toList()));

            this.menu.back();
            error = "";
        } catch (InvalidTimeIntervalException e) {
            error = erroInvalidTimeIntervalException;
        }
        return error;
    }
}

