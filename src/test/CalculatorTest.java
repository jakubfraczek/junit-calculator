package test;

import main.Calculator;

import org.junit.Before;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

	private Calculator classUnderTest;

	@Before
	public void setUp() {
		classUnderTest = new Calculator();
	}

	
	@Test
	public void testSum() throws Exception {
		double z1 = 1.6;
		double z2 = 1.8;

		double wynik = classUnderTest.sum(z1, z2);

		Assert.assertEquals(3.4, wynik, 0.1);
	}

	@Test
	public void testSubstruct() throws Exception {
		double z1 = 5.6;
		double z2 = 3.3;

		double wynik = classUnderTest.subtract(z1, z2);

		Assert.assertEquals(2.3, wynik, 0.00000001);
	}

	@Test
	public void testMultiply() throws Exception {
		double z1 = 2.3;
		double z2 = 3.7;

		double wynik = classUnderTest.multiply(z1, z2);

		Assert.assertEquals(8.51, wynik, 0.00000001);
	}

	@Test
	public void testDivide() throws Exception {
		double z1 = 8.51;
		double z2 = 2.3;

		double wynik = classUnderTest.divide(z1, z2);

		Assert.assertEquals(3.7, wynik, 0.00000007);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testDivideEx() throws Exception {
		double z1 = 2.5;
		double z2 = 0;
		
		double wynik = classUnderTest.divide(z1, z2);
		
		
	}

}
