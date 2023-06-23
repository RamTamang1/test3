package ai.takeo.bootcamp.customermgmt;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {
	private Calculator calculator;

	@BeforeClass
	public static void beforeClass() {
		System.out.println("marks a method to be run once before any test methods are run");
	}

	@Before
	public void before() {
		System.out.println("Marks a method to be run before each test method");
		calculator = new Calculator();
	}

	@After
	public void after() {
		System.out.println("Marks a method to be run after each test method");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("marks a method to be run once after any test methods are run");
	}
	// given two input 
	// when user want to add 
	// then it should return sum of those input
	@Test
	public void testAddMethod() {
		// expected value
		// actual value
		int add = calculator.add(2, 2);
		assertEquals("add method is not working", 4, add);
	}

	@Test
	public void subtract() {
		int subtract = calculator.subtract(5, 2);
		assertEquals("subtract method is not working", 3, subtract);
	}
	@Test
	public void multiply() {
		int multiply = calculator.multiply(5, 2);
		assertEquals("multiply method is not working", 10, multiply);
	}
	@Test
	public void divison() {
		int division = calculator.division(6, 2);
		assertEquals("division method is not working", 3, division);
	}
}
