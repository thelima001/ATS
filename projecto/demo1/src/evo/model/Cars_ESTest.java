/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 19 23:07:35 GMT 2020
 */

package model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import model.Car;
import model.Cars;
import model.Owner;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import utils.Point;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Cars_ESTest extends Cars_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Cars cars0 = new Cars();
      Double double0 = new Double((-701.049155915491));
      Point point0 = new Point(double0, double0);
      Point point1 = new Point(point0);
      Car.CarType car_CarType0 = Car.CarType.GAS;
      try { 
        cars0.getCar(point1, point0, (-701.049155915491), car_CarType0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("model.Cars", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Cars cars0 = new Cars();
      Double double0 = new Double(0.0);
      Point point0 = new Point(double0, double0);
      Car.CarType car_CarType0 = Car.CarType.HYBRID;
      try { 
        cars0.getCar("MaisBarato", (Point) null, point0, car_CarType0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("model.Cars", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Cars cars0 = new Cars();
      Double double0 = new Double(0.4);
      Point point0 = new Point(double0, double0);
      Car.CarType car_CarType0 = Car.CarType.GAS;
      Owner owner0 = new Owner("C=fq2", "Mai<PQrto", "Mai<PQrto", 1473122002, "(0.00, 0.00)");
      Car car0 = new Car("C=fq2", owner0, car_CarType0, (-936.0928770342797), 0.4, 1473122002, 1, point0, "");
      cars0.addCar(car0);
      Car car1 = cars0.getCar(point0, point0, 0.4, car_CarType0);
      assertSame(car1, car0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Cars cars0 = new Cars();
      Double double0 = new Double(0.0);
      Point point0 = new Point(double0, double0);
      Car.CarType car_CarType0 = Car.CarType.ELECTRIC;
      Owner owner0 = new Owner("7os!S}y83", "CDxN", "", 3062, "4,?G7'K");
      Car car0 = new Car("CDxN", owner0, car_CarType0, 0.0, 0.4, 0.0, 3062, point0, "7os!S}y83");
      cars0.addCar(car0);
      Car car1 = cars0.getCar(point0, 0.0, car_CarType0);
      assertSame(car1, car0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Cars cars0 = new Cars();
      Owner owner0 = new Owner("!5fn]q", "!5fn]q", "%.2f", 5526, "!5fn]q");
      Car.CarType car_CarType0 = Car.CarType.HYBRID;
      Car car0 = new Car("r$\"ZK", owner0, car_CarType0, 5526, 4328.086964298525, 4328.086964298525, 5526, (Point) null, "r$\"ZK");
      cars0.addCar(car0);
      // Undeclared exception!
      try { 
        cars0.getCar((Point) null, (Point) null, 5526, car_CarType0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("model.Car", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Cars cars0 = new Cars();
      Double double0 = new Double((-1948L));
      Point point0 = new Point(double0, double0);
      Car.CarType car_CarType0 = Car.CarType.GAS;
      Car car0 = new Car("2l0vC3!C>E7f%e91!X", (Owner) null, car_CarType0, 4097.3, (-1948L), 1.0, (-1648889700), (Point) null, "\n\n");
      cars0.addCar(car0);
      // Undeclared exception!
      try { 
        cars0.getCar(point0, (-1948L), car_CarType0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("model.Car", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Cars cars0 = new Cars();
      Double double0 = new Double(0.0);
      Car.CarType car_CarType0 = Car.CarType.ELECTRIC;
      Owner owner0 = new Owner("'V+bZQ~GfQ", (String) null, (String) null, (-3390), (String) null);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("", owner0, car_CarType0, 0.0, (-3390), 88.640560506, (-3390), point0, "'V+bZQ~GfQ");
      cars0.addCar(car0);
      // Undeclared exception!
      try { 
        cars0.getCar("MaisPerto", (Point) null, point0, car_CarType0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("utils.Point", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Cars cars0 = new Cars();
      // Undeclared exception!
      try { 
        cars0.addCar((Car) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("model.Cars", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Cars cars0 = new Cars();
      Cars cars1 = new Cars();
      boolean boolean0 = cars1.equals(cars0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Cars cars0 = new Cars();
      Object object0 = new Object();
      boolean boolean0 = cars0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Cars cars0 = new Cars();
      boolean boolean0 = cars0.equals(cars0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Cars cars0 = new Cars();
      boolean boolean0 = cars0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Cars cars0 = new Cars();
      Car.CarType car_CarType0 = Car.CarType.HYBRID;
      Double double0 = new Double(1213.95783209275);
      Point point0 = new Point(double0, double0);
      try { 
        cars0.getCar("MaisPerto", point0, point0, car_CarType0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("model.Cars", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Cars cars0 = new Cars();
      Car.CarType car_CarType0 = Car.CarType.GAS;
      Double double0 = new Double((-1343.12));
      Point point0 = new Point(double0, double0);
      try { 
        cars0.getCar("w>;dNQx", point0, point0, car_CarType0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("model.Cars", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Cars cars0 = new Cars();
      try { 
        cars0.searchCar("");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("model.Cars", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Cars cars0 = new Cars();
      Double double0 = new Double(0.0);
      Car.CarType car_CarType0 = Car.CarType.ELECTRIC;
      Owner owner0 = new Owner("'V+bZQ~GfQ", (String) null, (String) null, (-3390), (String) null);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("", owner0, car_CarType0, 0.0, (-3390), 88.640560506, (-3390), point0, "'V+bZQ~GfQ");
      cars0.addCar(car0);
      Car car1 = cars0.searchCar("");
      assertSame(car1, car0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Cars cars0 = new Cars();
      Double double0 = new Double(0.0);
      Car.CarType car_CarType0 = Car.CarType.ELECTRIC;
      Owner owner0 = new Owner("'V+bZQ~GfQ", (String) null, (String) null, (-3390), (String) null);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("", owner0, car_CarType0, 0.0, (-3390), 88.640560506, (-3390), point0, "'V+bZQ~GfQ");
      cars0.addCar(car0);
      try { 
        cars0.addCar(car0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("model.Cars", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Cars cars0 = new Cars();
      Owner owner0 = new Owner("MaisPerto", "", "", 1, "");
      Car.CarType car_CarType0 = Car.CarType.GAS;
      Double double0 = new Double((-1343.12));
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("", owner0, car_CarType0, 614.0, 1, (-245.5), 1, point0, "MaisPerto");
      cars0.addCar(car0);
      List<Car> list0 = cars0.listOfCarType(car_CarType0);
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Cars cars0 = new Cars();
      Double double0 = new Double(0.0);
      Point point0 = new Point(double0, double0);
      Car.CarType car_CarType0 = Car.CarType.ELECTRIC;
      try { 
        cars0.getCar(point0, 0.0, car_CarType0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("model.Cars", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Cars cars0 = new Cars();
      Cars cars1 = cars0.copy();
      assertNotSame(cars1, cars0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Cars cars0 = new Cars();
      Car.CarType car_CarType0 = Car.CarType.GAS;
      List<Car> list0 = cars0.listOfCarType(car_CarType0);
      assertTrue(list0.isEmpty());
  }
}
