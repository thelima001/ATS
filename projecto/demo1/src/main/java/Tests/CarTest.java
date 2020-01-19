package Tests;

import model.Car;
import model.Owner;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import utils.Point;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    Point pos = new Point(0.0,0.0);
    Point dest = new Point(100.00,100.00);
    Owner owner =  new Owner("teste@teste.pt", "teste", "teste", 123456789, "teste");
    Car car = new Car("123456789", owner, Car.CarType.gas, 50.00, 10.00, 100.00, 5, pos, "KIA");


    @Test
    void hasRange() {
        Assert.assertEquals( car.hasRange(dest), false);
    }

}