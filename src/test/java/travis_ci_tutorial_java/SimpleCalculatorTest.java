package travis_ci_tutorial_java;

import java.util.*;

import static org.junit.Assert.*;
import org.junit.*;

public class SimpleCalculatorTest {
	@Test
	public void testAdd() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.add(1, 1), 2);
		assertEquals(calc.sub(5, 3), 2);
		assertEquals(calc.mult(5, 2), 10);
		assertEquals(calc.div(10,5),2);
	}
}
