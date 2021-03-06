/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 19 23:17:17 GMT 2020
 */

package model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.LocalDateTime;
import model.Car;
import model.Client;
import model.Owner;
import model.Rental;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.evosuite.runtime.System;
import org.junit.runner.RunWith;
import utils.Point;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Rental_ESTest extends Rental_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Owner owner0 = new Owner("j72`b,4", "j72`b,4", "j72`b,4", (-2933), "shk^o;;ld|;^9yz");
      Car.CarType car_CarType0 = Car.CarType.HYBRID;
      Double double0 = new Double((-2933));
      Double double1 = new Double(0);
      Point point0 = new Point(double0, double1);
      Car car0 = new Car("shk^o;;ld|;^9yz", owner0, car_CarType0, (-2933), (-2933), (-2933), 0, point0, "j72`b,4");
      car0.setBasePrice(0);
      Client client0 = new Client(point0, "GAS", "shk^o;;ld|;^9yz", "j72`b,4", "N=Lrs) Tq'", (-2933));
      Rental rental0 = new Rental(car0, client0, point0);
      Point point1 = new Point(double0, double0);
      Rental rental1 = new Rental(car0, client0, point1);
      boolean boolean0 = rental0.equals(rental1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Owner owner0 = new Owner("@", "@", "p:S^K2JeY)(Hz3umw,e", (-7), "@");
      Car.CarType car_CarType0 = Car.CarType.ELECTRIC;
      Double double0 = new Double(Double.POSITIVE_INFINITY);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("@", owner0, car_CarType0, (-7), (-7), (-7), (-7), point0, "p:S^K2JeY)(Hz3umw,e");
      Client client0 = new Client(point0, "@", "@", "@", "p:S^K2JeY)(Hz3umw,e", (-7));
      Rental rental0 = new Rental(car0, client0, point0);
      Rental rental1 = new Rental(car0, client0, point0);
      boolean boolean0 = rental0.equals(rental1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Owner owner0 = new Owner("Dono:           ", "Dono:           ", "exceptions.UnknownCarTypeException", (-7), "exceptions.UnknownCarTypeException");
      Car.CarType car_CarType0 = Car.CarType.HYBRID;
      Double double0 = new Double(Double.POSITIVE_INFINITY);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("W}-7-wV?Z~ Uw_", owner0, car_CarType0, (-313.7672920042124), 77.59, 2.0, 17, point0, "Client:        ");
      Client client0 = new Client(point0, "Dono:           ", "\n", "Client:        ", "W}-7-wV?Z~ Uw_", 17);
      Rental rental0 = new Rental(car0, client0, point0);
      String string0 = rental0.toString();
      assertEquals("Client:        Dono:           \nCarro:          W}-7-wV?Z~ Uw_\nDono:           Dono:           \nViagem:         (Infinity, Infinity) -> (Infinity, Infinity)\nTempo a p\u00E9      NaN Horas\nTempo Estimado: NaN Horas\nCusto Estimado: NaN", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Owner owner0 = new Owner(")=y=kp3", ")=y=kp3", ")=y=kp3", 1, "Tempo a p\u00E9      ");
      Car.CarType car_CarType0 = Car.CarType.ELECTRIC;
      Double double0 = new Double(Double.POSITIVE_INFINITY);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car(")=y=kp3", owner0, car_CarType0, 1, (-777134.3470370343), (-1954.97313), 4, point0, "");
      Client client0 = new Client(point0, "", "Tempo a p\u00E9      ", "\u001B[34m", "Tempo a p\u00E9      ", 2);
      Rental rental0 = new Rental(car0, client0, point0);
      String string0 = rental0.toParsableUserString();
      assertEquals("\n)=y=kp3\n(Infinity, Infinity)\n(Infinity, Infinity)\nNaN\nNaN\nNaN\n100", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Owner owner0 = new Owner(")=y=kp3", ")=y=kp3", ")=y=kp3", 1, "Tempo a p\u00E9      ");
      Car.CarType car_CarType0 = Car.CarType.ELECTRIC;
      Double double0 = new Double(Double.POSITIVE_INFINITY);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car(")=y=kp3", owner0, car_CarType0, 1, (-777134.3470370343), (-1954.97313), 4, point0, "");
      Client client0 = new Client(point0, "", "Tempo a p\u00E9      ", "\u001B[34m", "Tempo a p\u00E9      ", 2);
      Rental rental0 = new Rental(car0, client0, point0);
      rental0.rent();
      rental0.hashCode();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Random.setNextRandom(18);
      Owner owner0 = new Owner("2^7_LW", "model.Owner", "P3WCW}K3`_?&jZ,hov", 18, "dvz");
      Car.CarType car_CarType0 = Car.CarType.ELECTRIC;
      Double double0 = new Double(393);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("model.Owner", owner0, car_CarType0, 18, 18, 18, 393, point0, "2^7_LW");
      Client client0 = new Client(point0, (String) null, "P3WCW}K3`_?&jZ,hov", "o", "model.Owner", 0);
      Rental rental0 = new Rental(car0, client0, point0);
      rental0.rent();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Owner owner0 = new Owner(")=y=kp3", ")=y=kp3", ")=y=kp3", 1, "Tempo a p\u00E9      ");
      Car.CarType car_CarType0 = Car.CarType.ELECTRIC;
      Double double0 = new Double(Double.POSITIVE_INFINITY);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car(")=y=kp3", owner0, car_CarType0, 1, (-777134.3470370343), (-1954.97313), 4, point0, "");
      Client client0 = new Client(point0, "", "Tempo a p\u00E9      ", "\u001B[34m", "Tempo a p\u00E9      ", 2);
      Rental rental0 = new Rental(car0, client0, point0);
      rental0.rate(4, 2);
      assertEquals(2, owner0.getRates());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Owner owner0 = new Owner((String) null, "dz&>", "dz&>", 0, "");
      Car.CarType car_CarType0 = Car.CarType.ANY;
      Double double0 = new Double((-1285.117));
      Point point0 = new Point(double0, double0);
      Car car0 = new Car((String) null, owner0, car_CarType0, 0, (-1285.117), (-188.3), 0, point0, "dz&>");
      Client client0 = new Client(point0, (String) null, "Hibrido", "", "model.User", (-973));
      Rental rental0 = new Rental(car0, client0, point0);
      String string0 = rental0.getOwnerID();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Owner owner0 = new Owner(" 3;n?vX%Xs5g'", "", "", 6059, "\n\n");
      Car.CarType car_CarType0 = Car.CarType.HYBRID;
      Double double0 = new Double(0.1);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car(" 3;n?vX%Xs5g'", owner0, car_CarType0, 0.0, 1069.5, 6059, 553, point0, ".");
      Rental rental0 = new Rental(car0, (Client) null, point0);
      String string0 = rental0.getOwnerID();
      assertEquals(" 3;n?vX%Xs5g'", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Owner owner0 = new Owner("", "", (String) null, (-2087), "");
      Car.CarType car_CarType0 = Car.CarType.ANY;
      Double double0 = new Double((-2087));
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("", owner0, car_CarType0, 522.671, (-2169.397856575), (-2087), 1488, point0, (String) null);
      Client client0 = new Client(point0, "", "O=", (String) null, "IW]", 1488);
      Rental rental0 = new Rental(car0, client0, point0);
      String string0 = rental0.getOwnerID();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Owner owner0 = new Owner("\"WY", "\"WY", "\"WY", (-741), "\"WY");
      Double double0 = new Double(174.95);
      Point point0 = new Point(double0, double0);
      Client client0 = new Client(point0, "\"WY", "", "\"WY", "", (-741));
      Car.CarType car_CarType0 = Car.CarType.ANY;
      Double double1 = new Double((-2388.69798));
      Point point1 = new Point(double1, double1);
      Car car0 = new Car("ZRqz6AP$OS!(jK>@30", owner0, car_CarType0, 1.0, 3328, (-1.0), 0, point1, "");
      Rental rental0 = new Rental(car0, client0, point0);
      double double2 = rental0.getDistance();
      assertEquals(3625.5457424663887, double2, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Owner owner0 = new Owner((String) null, "H{K+}/w5WV\"?", "q|o@(5WJzJuR@1^brrv", 11, "@/");
      Car.CarType car_CarType0 = Car.CarType.HYBRID;
      Double double0 = new Double(989.8988664);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car((String) null, owner0, car_CarType0, (-1138.85889011033), (-1138.85889011033), 989.8988664, (-1), point0, "Tempo a p\u00E9      ");
      Client client0 = new Client(point0, (String) null, "H{K+}/w5WV\"?", "mlqAU{<?^Z`}2th ", (String) null, (-1));
      Rental rental0 = new Rental(car0, client0, point0);
      String string0 = rental0.getClientID();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Owner owner0 = new Owner("Custo Estimado: ", "Custo Estimado: ", "Custo Estimado: ", 4187, "Custo Estimado: ");
      Car.CarType car_CarType0 = Car.CarType.ELECTRIC;
      Double double0 = new Double(4187);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("Custo Estimado: ", owner0, car_CarType0, 4187, 4187, 4187, 4187, point0, "Custo Estimado: ");
      Client client0 = new Client(point0, "Custo Estimado: ", "Custo Estimado: ", "Custo Estimado: ", "Custo Estimado: ", 4187);
      Rental rental0 = new Rental(car0, client0, point0);
      String string0 = rental0.getClientID();
      assertEquals("Custo Estimado: ", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Owner owner0 = new Owner(")=y=kp3", ")=y=kp3", ")=y=kp3", 1, "Tempo a p\u00E9      ");
      Car.CarType car_CarType0 = Car.CarType.ELECTRIC;
      Double double0 = new Double(Double.POSITIVE_INFINITY);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car(")=y=kp3", owner0, car_CarType0, 1, (-777134.3470370343), (-1954.97313), 4, point0, "");
      Client client0 = new Client(point0, "", "Tempo a p\u00E9      ", "\u001B[34m", "Tempo a p\u00E9      ", 2);
      Rental rental0 = new Rental(car0, client0, point0);
      String string0 = rental0.getClientID();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Owner owner0 = new Owner((String) null, (String) null, (String) null, 0, "8~");
      Car.CarType car_CarType0 = Car.CarType.GAS;
      Double double0 = new Double((-1.0));
      Point point0 = new Point(double0, double0);
      Car car0 = new Car((String) null, owner0, car_CarType0, 0, 0.5, 0.0, 0, point0, (String) null);
      Client client0 = new Client(point0, "", "J4@P!+/<h\"", "", "", 0);
      Rental rental0 = new Rental(car0, client0, point0);
      String string0 = rental0.getCarID();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Owner owner0 = new Owner("Custo Total: ", "Custo Total: ", "859z", (-494), "859z");
      Car.CarType car_CarType0 = Car.CarType.GAS;
      Double double0 = new Double(1032.4711562385);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("Custo Total: ", owner0, car_CarType0, (-494), 1032.4711562385, 1032.4711562385, (-494), point0, "859z");
      Client client0 = new Client(point0, "859z", "859z", "\n", "859z", 2325);
      Rental rental0 = new Rental(car0, client0, point0);
      String string0 = rental0.getCarID();
      assertEquals("Custo Total: ", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Owner owner0 = new Owner("", "", "|nN8#I?'.L+Us5K", (-1380), "");
      Car.CarType car_CarType0 = Car.CarType.GAS;
      Double double0 = new Double((-1380));
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("", owner0, car_CarType0, 1380.3843801554563, (-1380), 0.0, (-1380), point0, "");
      Client client0 = new Client(point0, "", "|nN8#I?'.L+Us5K", "|nN8#I?'.L+Us5K", "", (-1380));
      Rental rental0 = new Rental(car0, client0, point0);
      String string0 = rental0.getCarID();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Owner owner0 = new Owner("P<B", "P<B", "P<B", 0, "P<B");
      Car.CarType car_CarType0 = Car.CarType.ANY;
      Double double0 = new Double((-977.8573));
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("P<B", owner0, car_CarType0, (-793.4041007705421), 0, (-1199.602637), (-75), point0, "P<B");
      Rental rental0 = new Rental(car0, (Client) null, point0);
      // Undeclared exception!
      try { 
        rental0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("model.Rental", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Owner owner0 = new Owner(" 3;n?vX%Xs5g'", "", "", 6059, "\n\n");
      Car.CarType car_CarType0 = Car.CarType.HYBRID;
      Double double0 = new Double(0.1);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car(" 3;n?vX%Xs5g'", owner0, car_CarType0, 0.0, 1069.5, 6059, 553, point0, ".");
      Rental rental0 = new Rental(car0, (Client) null, point0);
      // Undeclared exception!
      try { 
        rental0.toParsableUserString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("model.Rental", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Car.CarType car_CarType0 = Car.CarType.HYBRID;
      Double double0 = new Double(815.8511);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("", (Owner) null, car_CarType0, (-2857.9263893), (-2857.9263893), (-2857.9263893), 642, point0, "");
      Client client0 = new Client(point0, "", "", "vs+_1=aW~yJ%S#[", "#{,iI?YRllrf/55SYWx", 642);
      Rental rental0 = new Rental(car0, client0, point0);
      // Undeclared exception!
      try { 
        rental0.toParsableUserRentalString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("model.Car", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Owner owner0 = new Owner("", "", "", 0, "n!l`1~hJ!I");
      Car.CarType car_CarType0 = Car.CarType.GAS;
      Double double0 = new Double((-1360.76324));
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("lw'}EnG9", owner0, car_CarType0, 0, 1355.841911255903, 1359.10454416, 2316, point0, "lw'}EnG9");
      Rental rental0 = new Rental(car0, (Client) null, point0);
      // Undeclared exception!
      try { 
        rental0.toParsableOwnerRentalString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("model.Rental", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Owner owner0 = new Owner("]Td:XVe`M.SV", "", (String) null, (-489), "model.Owner");
      Car.CarType car_CarType0 = Car.CarType.ELECTRIC;
      Double double0 = new Double((-489));
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("Custo Estimado: ", owner0, car_CarType0, (-489), (-489), 370.09325, (-489), point0, "");
      Rental rental0 = new Rental(car0, (Client) null, point0);
      // Undeclared exception!
      try { 
        rental0.rent();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("model.Rental", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Owner owner0 = new Owner("Custo Estimado: ", "Custo Estimado: ", "", 4260, "");
      Car.CarType car_CarType0 = Car.CarType.ANY;
      Double double0 = new Double(-0.0);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("Custo Estimado: ", owner0, car_CarType0, -0.0, (-1.0), (-1.0), (-3399), point0, "Custo Estimado: ");
      Client client0 = new Client(point0, "R ~o$Tn=L]n(5.{", "Custo Estimado: ", "I<<y(?neGr", "aFN%i", 31);
      Rental rental0 = new Rental(car0, client0, point0);
      System.setCurrentTimeMillis((-455L));
      // Undeclared exception!
      try { 
        rental0.rent();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 12
         //
         verifyException("model.Weather", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Car.CarType car_CarType0 = Car.CarType.ANY;
      Double double0 = new Double(1423.154);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("Dono:           ", (Owner) null, car_CarType0, 77.59, 77.59, 77.59, 0, point0, "Dono:           ");
      Client client0 = new Client(point0, "Dono:           ", "Dono:           ", "W}-7-wV?Z~ Uw_", "Dono:           ", 0);
      Rental rental0 = new Rental(car0, client0, point0);
      // Undeclared exception!
      try { 
        rental0.rate(1, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("model.Car", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Owner owner0 = new Owner("model.Car", "model.Car", "model.Car", (-1134), "");
      Car.CarType car_CarType0 = Car.CarType.GAS;
      Double double0 = new Double((-2233.2792));
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("model.Car", owner0, car_CarType0, (-1.0), (-2233.2792), (-3067.383), (-51), point0, "");
      Rental rental0 = new Rental(car0, (Client) null, point0);
      // Undeclared exception!
      try { 
        rental0.rate(17);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("model.Rental", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Owner owner0 = new Owner("ZV'y`v1Cg@;i", (String) null, (String) null, (-760), "ZV'y`v1Cg@;i");
      Car.CarType car_CarType0 = Car.CarType.HYBRID;
      Double double0 = new Double((-760));
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("ZV'y`v1Cg@;i", owner0, car_CarType0, (-760), (-760), (-760), (-760), point0, "ZV'y`v1Cg@;i");
      Client client0 = new Client(point0, (String) null, (String) null, (String) null, (String) null, (-760));
      Rental rental0 = new Rental(car0, client0, point0);
      client0.addPendingRental(rental0);
      Client client1 = new Client(point0, (String) null, (String) null, (String) null, (String) null, (-760));
      Rental rental1 = new Rental(car0, client1, point0);
      rental1.rent();
      // Undeclared exception!
      try { 
        rental0.equals(rental1);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Owner owner0 = new Owner("Custo Total: ", "", "Custo Total: ", (-113), (String) null);
      Car.CarType car_CarType0 = Car.CarType.GAS;
      Double double0 = new Double((-113));
      Double double1 = new Double(0);
      Point point0 = new Point(double0, double1);
      Point point1 = new Point(double0, double0);
      Car car0 = new Car("Custo Total: ", owner0, car_CarType0, 0.0, 0.0, 0.0, 0, point1, "");
      Rental rental0 = new Rental(car0, (Client) null, point0);
      Rental rental1 = new Rental(car0, (Client) null, point0);
      // Undeclared exception!
      try { 
        rental0.equals(rental1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("model.Rental", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Owner owner0 = new Owner("", "&n]]Bc\";A+f(yZMy", "&n]]Bc\";A+f(yZMy", 2, "");
      Car.CarType car_CarType0 = Car.CarType.HYBRID;
      Car car0 = new Car("&n]]Bc\";A+f(yZMy", owner0, car_CarType0, (-3148.034596451288), 0.0, 2, (-1522788922), (Point) null, "");
      Double double0 = new Double(4.0);
      Point point0 = new Point(double0, double0);
      Client client0 = new Client(point0, "Ds", "7;?*q*DQf$'=p9F[", "Hibrido", "", 1694);
      Rental rental0 = null;
      try {
        rental0 = new Rental(car0, client0, (Point) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("model.Rental", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Owner owner0 = new Owner("e.nAR#a28<r0Rl", "model.User", "", (-2298), "");
      Car.CarType car_CarType0 = Car.CarType.ANY;
      Double double0 = new Double((-2298));
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("e.nAR#a28<r0Rl", owner0, car_CarType0, (-844.489513604956), (-844.489513604956), (-1229.39), (-2298), point0, "E");
      Client client0 = new Client(point0, "%\"dmQ", "(", "", (String) null, (-2298));
      Point point1 = new Point(point0);
      Rental rental0 = new Rental(car0, client0, point1);
      Rental rental1 = new Rental(car0, client0, point0);
      boolean boolean0 = rental0.equals(rental1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Owner owner0 = new Owner("Custo Total: ", "Custo Total: ", "Custo Total: ", 3, "Custo Total: ");
      Car.CarType car_CarType0 = Car.CarType.GAS;
      Double double0 = new Double(3);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("Custo Total: ", owner0, car_CarType0, 3, 3, 3, 3, point0, "Custo Total: ");
      Client client0 = new Client(point0, "Custo Total: ", "Custo Total: ", "Custo Total: ", "Custo Total: ", 3);
      Rental rental0 = new Rental(car0, client0, point0);
      System.setCurrentTimeMillis(3);
      Rental rental1 = new Rental(car0, client0, point0);
      boolean boolean0 = rental0.equals(rental1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Owner owner0 = new Owner("", "", "", (-741), "");
      Car.CarType car_CarType0 = Car.CarType.ANY;
      Double double0 = new Double((-741));
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("", owner0, car_CarType0, (-741), (-741), (-741), (-741), point0, "");
      Client client0 = new Client(point0, "", "", "", "", (-741));
      Rental rental0 = new Rental(car0, client0, point0);
      Rental rental1 = new Rental(car0, client0, point0);
      boolean boolean0 = rental0.equals(rental1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Owner owner0 = new Owner("Custo Total: ", "Custo Total: ", "Custo Total: ", 3, "Custo Total: ");
      Car.CarType car_CarType0 = Car.CarType.GAS;
      Double double0 = new Double(3);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("Custo Total: ", owner0, car_CarType0, 3, 3, 3, 3, point0, "Custo Total: ");
      Car car1 = car0.copy();
      Client client0 = new Client(point0, "Custo Total: ", "Custo Total: ", "Custo Total: ", "Custo Total: ", 3);
      Rental rental0 = new Rental(car1, client0, point0);
      Rental rental1 = new Rental(car0, client0, point0);
      boolean boolean0 = rental0.equals(rental1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Owner owner0 = new Owner("ZV'y`v1Cg;i", "ZV'y`v1Cg;i", "ZV'y`v1Cg;i", (-736), "ZV'y`v1Cg;i");
      Car.CarType car_CarType0 = Car.CarType.HYBRID;
      Double double0 = new Double((-736));
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("ZV'y`v1Cg;i", owner0, car_CarType0, (-736), (-736), (-736), (-736), point0, "ZV'y`v1Cg;i");
      Client client0 = new Client(point0, "ZV'y`v1Cg;i", "ZV'y`v1Cg;i", "ZV'y`v1Cg;i", "ZV'y`v1Cg;i", (-736));
      Rental rental0 = new Rental(car0, client0, point0);
      Client client1 = client0.makeCopy();
      Rental rental1 = new Rental(car0, client1, point0);
      boolean boolean0 = rental0.equals(rental1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Owner owner0 = new Owner(" -> ", " -> ", " -> ", (-113), " -> ");
      Car.CarType car_CarType0 = Car.CarType.HYBRID;
      Double double0 = new Double((-113));
      Point point0 = new Point(double0, double0);
      Car car0 = new Car(" -> ", owner0, car_CarType0, 0.0, 0.0, 0.0, (-113), point0, " -> ");
      Rental rental0 = new Rental(car0, (Client) null, point0);
      Rental rental1 = new Rental(car0, (Client) null, point0);
      boolean boolean0 = rental0.equals(rental1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Owner owner0 = new Owner("r%|.~M!nitb]01", "r%|.~M!nitb]01", "r%|.~M!nitb]01", (-2929), "r%|.~M!nitb]01");
      Car.CarType car_CarType0 = Car.CarType.GAS;
      Double double0 = new Double((-2929));
      Double double1 = new Double((-2026));
      Point point0 = new Point(double0, double1);
      Car car0 = new Car("r%|.~M!nitb]01", owner0, car_CarType0, (-2929), (-2929), (-2929), (-2026), point0, "r%|.~M!nitb]01");
      Client client0 = new Client(point0, "r%|.~M!nitb]01", "r%|.~M!nitb]01", "r%|.~M!nitb]01", "r%|.~M!nitb]01", (-2929));
      Rental rental0 = new Rental(car0, client0, point0);
      Point point1 = new Point(double0, double0);
      Rental rental1 = new Rental(car0, client0, point1);
      boolean boolean0 = rental0.equals(rental1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Owner owner0 = new Owner("Custo Estimado: ", "Custo Estimado: ", "", 4260, "");
      Car.CarType car_CarType0 = Car.CarType.ANY;
      Double double0 = new Double(-0.0);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("Custo Estimado: ", owner0, car_CarType0, -0.0, (-1.0), (-1.0), (-3399), point0, "Custo Estimado: ");
      Client client0 = new Client(point0, "R ~o$Tn=L]n(5.{", "Custo Estimado: ", "I<<y(?neGr", "aFN%i", 31);
      Rental rental0 = new Rental(car0, client0, point0);
      boolean boolean0 = rental0.equals("Custo Estimado: ");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Owner owner0 = new Owner("", "", "", (-741), "");
      Car.CarType car_CarType0 = Car.CarType.ANY;
      Double double0 = new Double((-741));
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("", owner0, car_CarType0, (-741), (-741), (-741), (-741), point0, "");
      Client client0 = new Client(point0, "", "", "", "", (-741));
      Rental rental0 = new Rental(car0, client0, point0);
      boolean boolean0 = rental0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Owner owner0 = new Owner("", "", "", (-741), "");
      Car.CarType car_CarType0 = Car.CarType.ANY;
      Double double0 = new Double((-741));
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("", owner0, car_CarType0, (-741), (-741), (-741), (-741), point0, "");
      Client client0 = new Client(point0, "", "", "", "", (-741));
      Rental rental0 = new Rental(car0, client0, point0);
      boolean boolean0 = rental0.equals(rental0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Owner owner0 = new Owner("", "", "", (-9), "");
      Car.CarType car_CarType0 = Car.CarType.HYBRID;
      Double double0 = Double.valueOf((double) (-9));
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("", owner0, car_CarType0, (-9), (-9), (-9), (-9), point0, "");
      Client client0 = new Client(point0, "", "", "", "", (-9));
      Rental rental0 = new Rental(car0, client0, point0);
      LocalDateTime localDateTime0 = rental0.getDate();
      assertNotNull(localDateTime0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Owner owner0 = new Owner("", "", "", 0, "n!l`1~hJ!I");
      Car.CarType car_CarType0 = Car.CarType.GAS;
      Double double0 = new Double((-1360.76324));
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("lw'}EnG9", owner0, car_CarType0, 0, 1355.841911255903, 1359.10454416, 2316, point0, "lw'}EnG9");
      Rental rental0 = new Rental(car0, (Client) null, point0);
      String string0 = rental0.toParsableUserRentalString();
      assertEquals("2014-02-14 20:21\nlw'}EnG9\n\n(-1360.76, -1360.76)\n(-1360.76, -1360.76)\n0.00", string0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Owner owner0 = new Owner("", "", "", (-741), "");
      Car.CarType car_CarType0 = Car.CarType.ANY;
      Double double0 = new Double((-741));
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("", owner0, car_CarType0, (-741), (-741), (-741), (-741), point0, "");
      Client client0 = new Client(point0, "", "", "", "", (-741));
      Rental rental0 = new Rental(car0, client0, point0);
      rental0.rate((-741));
      assertEquals((-741), client0.getRates());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Owner owner0 = new Owner("r%|.~M!nitb]01", "r%|.~M!nitb]01", "r%|.~M!nitb]01", (-2929), "r%|.~M!nitb]01");
      Car.CarType car_CarType0 = Car.CarType.GAS;
      Double double0 = new Double((-2929));
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("r%|.~M!nitb]01", owner0, car_CarType0, (-2929), (-2929), (-2929), (-2026), point0, "r%|.~M!nitb]01");
      Client client0 = new Client(point0, "r%|.~M!nitb]01", "r%|.~M!nitb]01", "r%|.~M!nitb]01", "r%|.~M!nitb]01", (-2929));
      Rental rental0 = new Rental(car0, client0, point0);
      double double1 = rental0.getDistance();
      assertEquals(0.0, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Owner owner0 = new Owner("", "", "", (-9), "");
      Car.CarType car_CarType0 = Car.CarType.HYBRID;
      Double double0 = Double.valueOf((double) (-9));
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("", owner0, car_CarType0, (-9), (-9), (-9), (-9), point0, "");
      Client client0 = new Client(point0, "", "", "", "", (-9));
      Rental rental0 = new Rental(car0, client0, point0);
      String string0 = rental0.toParsableOwnerRentalString();
      assertEquals("2014-02-14 20:21\n\n\n(-9.00, -9.00)\n(-9.00, -9.00)\n0.00", string0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Owner owner0 = new Owner("", "", "", (-9), "");
      Car.CarType car_CarType0 = Car.CarType.HYBRID;
      Double double0 = Double.valueOf((double) (-9));
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("", owner0, car_CarType0, (-9), (-9), (-9), (-9), point0, "");
      Client client0 = new Client(point0, "", "", "", "", (-9));
      Rental rental0 = new Rental(car0, client0, point0);
      double double1 = rental0.getPrice();
      assertEquals(0.0, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Car.CarType car_CarType0 = Car.CarType.ANY;
      Double double0 = new Double((-1305));
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("model.Rental", (Owner) null, car_CarType0, (-1316.7), 0.0, 0.0, (-1305), point0, "i");
      Client client0 = new Client(point0, "model.Rental", "", "", "%.2f", (-1305));
      Rental rental0 = new Rental(car0, client0, point0);
      // Undeclared exception!
      try { 
        rental0.getOwnerID();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("model.Car", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Owner owner0 = new Owner("", "", "", 0, "n!l`1~hJ!I");
      Car.CarType car_CarType0 = Car.CarType.GAS;
      Double double0 = new Double((-1360.76324));
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("lw'}EnG9", owner0, car_CarType0, 0, 1355.841911255903, 1359.10454416, 2316, point0, "lw'}EnG9");
      Rental rental0 = new Rental(car0, (Client) null, point0);
      String string0 = rental0.toFinalString();
      assertEquals("Tempo Total: 0.00 Horas\nCusto Total: 0.00\n\n\u001B[4m\u001B[0m", string0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Car.CarType car_CarType0 = Car.CarType.ANY;
      Double double0 = new Double((-1465.1537925791197));
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("S]i>cf@B'E", (Owner) null, car_CarType0, 0.15, (-345.8902958), 0.0, (-841), point0, "S]i>cf@B'E");
      Rental rental0 = new Rental(car0, (Client) null, point0);
      // Undeclared exception!
      try { 
        rental0.getClientID();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("model.Rental", e);
      }
  }
}
