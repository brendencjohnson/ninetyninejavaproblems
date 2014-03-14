package ninetyninejavaproblems;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class Problem02Test {

	@Test
	public void testWithListDirect() {
		List<String> list = Arrays.asList("A", "B", "C", "D");
		String expectedResult = "C";

		Problem02 problem = new Problem02();
		String result = problem.getLastButOneElementDirect(list);

		assertEquals(expectedResult, result);
	}

	@Test
	public void testWithListIterative() {
		List<String> list = Arrays.asList("A", "B", "C", "D");
		String expectedResult = "C";

		Problem02 problem = new Problem02();
		String result = problem.getLastButOneElementIterative(list);

		assertEquals(expectedResult, result);
	}

	@Test
	public void testWithListDeclarative() {
		List<String> list = Arrays.asList("A", "B", "C", "D");
		String expectedResult = "C";

		Problem02 problem = new Problem02();
		String result = problem.getLastButOneElementDeclarative(list);

		assertEquals(expectedResult, result);
	}
}
