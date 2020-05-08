package emi.test;
import java.time.LocalDate;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import emi.Logic.*;

public class test {
   
	LocalDate date=LocalDate.now();
	@Test
   public void testAdd() 
	{
	  Calculation tester=new Calculation();
	  String finalResult="0";
	  assertEquals(finalResult,tester.emiCal(1000,12,12,date)[11][5]);
	  assertEquals(finalResult,tester.emiCal(11000,12,12,date)[11][5]);
	  assertEquals(finalResult,tester.emiCal(81040,12,5,date)[4][5]);
	  assertEquals(finalResult,tester.emiCal(97951,12,9,date.plusMonths(5))[8][5]);
	  assertEquals(finalResult,tester.emiCal(1912400,12,12,date.plusMonths(11))[11][5]);
	  assertEquals(finalResult,tester.emiCal(134790,12,5,date.plusMonths(9))[4][5]);
	  assertEquals(finalResult,tester.emiCal(78931,12,20,date.plusMonths(12))[19][5]);
	  assertEquals(finalResult,tester.emiCal(221080,12,15,date.plusMonths(2))[14][5]);
	  assertEquals(finalResult,tester.emiCal(2123370,12,10,date.plusMonths(8))[9][5]);
	  assertEquals(finalResult,tester.emiCal(3370,12,9,date.plusMonths(8))[8][5]);
	  assertEquals(finalResult,tester.emiCal(670,12,10,date.plusMonths(11))[9][5]);
	  assertEquals(finalResult,tester.emiCal(39240,12,15,date.plusMonths(5))[14][5]);
	  assertEquals(finalResult,tester.emiCal(33217,12,1,date.plusMonths(4))[0][5]);
	  assertEquals(finalResult,tester.emiCal(3370,12,12,date.plusMonths(8))[11][5]);
   }
}