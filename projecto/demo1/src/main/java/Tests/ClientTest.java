package Tests;

import model.Car;
import model.Client;
import model.Owner;
import model.Rental;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import utils.Point;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {
    Owner owner =  new Owner("teste@teste.pt", "teste", "teste", 123456789, "teste");
    Point dest = new Point(100.00,100.00);
    Point pos = new Point(0.0,0.0);
    Client client = new Client(pos, "k@k.pt", "k", "k", "k", 123456789);
    Car car = new Car("123456789", owner, Car.CarType.gas, 50.00, 10.00, 100.00, 5, pos, "KIA");
    Rental rent = new Rental(car, client, dest);

    @Test
    void rate() {
        client.addPendingRental(rent);
        client.rate(rent, 1,1);
        Assert.assertEquals(client.getPendingRates(), (new ArrayList<Rental>()));
    }

    @Test
    void addPendingRental() {
        client.addPendingRental(rent);
        Assert.assertEquals(client.getPendingRates().contains(rent), true);
    }

    @Test
    void getPendingRates() {
        Assert.assertEquals(client.getPendingRates(), (new ArrayList<Rental>()));
    }
}