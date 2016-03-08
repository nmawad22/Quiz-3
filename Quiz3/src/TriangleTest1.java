import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTest1 {


	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

	}

	public boolean isequals(double a, double b) {
		if (a == b) {
			return true;
		}
		return false;

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
	public void test() {
		Triangle T1 = new Triangle(7, 8, 9);
		assertTrue(T1.getP() == 24);
		assertTrue(T1.getArea() == Math.sqrt(720));
	}

}
