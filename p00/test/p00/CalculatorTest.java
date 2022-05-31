package p00;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		int a = 1234;
		int b = 8765;
		
		Calculator cal = new Calculator();
		int actual = cal.add(a, b);
		
		int expected = 9999;
		
		assertEquals(expected,actual);
	}
	
	@Test
	public void TestAddZero() {
		int a = 1234;
		int b = 0;
		
		Calculator cal = new Calculator();
		int actual = cal.add(a, b);
		
		int expected = 1234;
		
		assertEquals(expected,actual);
		
	}
	
	@Test
	
	public void TestSubtract() {
		int a = 100;
		int b = 1;
		
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b);
		
		int expected = 99;
		
		assertEquals(expected,actual);
	}
	
	@Test
	public void TestMultiply() {
		int a = 10;
		int b = 10;
		
		Calculator cal = new Calculator();
		int actual = cal.multiply(a, b);
		
		int expected = 100;
		
		assertEquals(expected,actual);
		
	}
	
	@Test
	
	public void TestDivide() {
		int a = 100;
		int b =25;
		
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b);
		
		int expected = 4;
		
		assertEquals(expected,actual);
		
	}

}
