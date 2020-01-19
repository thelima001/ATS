package model;

import exceptions.CarExistsException;
import exceptions.InvalidCarException;
import exceptions.NoCarAvaliableException;
import exceptions.UnknownCompareTypeException;
import model.*;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import utils.Point;
import model.Car;
import model.Cars;
import model.Owner;
import static org.junit.jupiter.api.Assertions.*;

class CarsTest {
    Cars cars = new Cars();
    Owner owner =  new Owner("teste@teste.pt", "teste", "teste", 123456789, "teste");
    Point dest = new Point(100.00,100.00);
    Point pos = new Point(0.0,0.0);
    Client client = new Client(pos, "k@k.pt", "k", "k", "k", 123456789);
    Car car = new Car("123456789", owner, Car.CarType.GAS, 50.00, 10.00, 100.00, 5, pos, "KIA");
    Rental rent = new Rental(car, client, dest);

    @Test
    void addCar() throws CarExistsException, InvalidCarException {
        cars.addCar(car);
        Assert.assertEquals((cars.searchCar("123456789")), car);
    }

    @Test
    void searchCar() throws CarExistsException, InvalidCarException {
        cars.addCar(car);
        Assert.assertEquals((cars.searchCar("123456789")), car);
    }

}