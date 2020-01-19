package Tests;

import model.*;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import utils.Point;

import static org.junit.jupiter.api.Assertions.*;

class RentalsTest {
    Owner owner =  new Owner("teste@teste.pt", "teste", "teste", 123456789, "teste");
    Point dest = new Point(100.00,100.00);
    Point pos = new Point(0.0,0.0);
    Client client = new Client(pos, "k@k.pt", "k", "k", "k", 123456789);
    Car car = new Car("123456789", owner, Car.CarType.gas, 50.00, 10.00, 100.00, 5, pos, "KIA");
    Rental rent = new Rental(car, client, dest);
    Rentals rents = new Rentals();

    @Test
    void addRental() {
        rents.addRental(rent);
        Assert.assertEquals(rents.rentalBase.contains(rent), true);
    }

    @Test
    void getTotalBilledCar() {
        rents.addRental(rent);
        Assert.assertEquals(rents.getTotalBilledCar(car), 0.00, 0);
    }

    @Test
    void getRentalListClient() {
        rents.addRental(rent);
        Assert.assertEquals(rents.getRentalListClient(client).contains(rent), true);
    }

    @Test
    void getRentalListOwner() {
        rents.addRental(rent);
        Assert.assertEquals(rents.getRentalListOwner(owner).contains(rent), true);
    }

}