package model;

import model.Car;
import model.Client;
import model.Owner;
import model.Rental;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import utils.Point;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class OwnerTest {
    Owner owner =  new Owner("teste@teste.pt", "teste", "teste", 123456789, "teste");
    Point dest = new Point(100.00,100.00);
    Point pos = new Point(0.0,0.0);
    Client client = new Client(pos, "k@k.pt", "k", "k", "k", 123456789);
    Car car = new Car("123456789", owner, Car.CarType.GAS, 50.00, 10.00, 100.00, 5, pos, "KIA");
    Rental rent = new Rental(car, client, dest);

    @Test
    void getPending() {
        Assert.assertEquals(owner.getPending(), (new ArrayList<Rental>()));
    }

    @Test
    void addPendingRental() {
        owner.addPendingRental(rent);
        Assert.assertEquals(owner.getPending().contains(rent), true);
    }

    @Test
    void refuse() {
        owner.addPendingRental(rent);
        owner.refuse(rent);
        Assert.assertEquals(owner.getPending(), (new ArrayList<Rental>()));
    }

    @Test
    void accept() {
        owner.addPendingRental(rent);
        owner.accept(rent);
        Assert.assertEquals(owner.getPending(), (new ArrayList<Rental>()));
    }

    @Test
    void addCar() {
        owner.addCar(car);
        Assert.assertEquals(owner.getCars().contains(car), true);
    }

    @Test
    void getCars() {
        Assert.assertEquals(owner.getCars(), (new ArrayList<Car>()));
    }
}