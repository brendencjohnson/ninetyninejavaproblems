package ninetyninejavaproblems;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class Problem03Test {

	@Test
	public void testWithListDirect() {
		List<String> list = Arrays.asList("A", "B", "C", "D", "E");
		int element = 3;
		String expectedResult = "C";

		Problem03 problem = new Problem03();
		String result = problem.getKthElementDirect(list, element);

		assertEquals(expectedResult, result);
	}

	@Test
	public void testWithListIterative() {
		List<String> list = Arrays.asList("A", "B", "C", "D", "E");
		int element = 3;
		String expectedResult = "C";

		Problem03 problem = new Problem03();
		String result = problem.getKthElementIterative(list, element);

		assertEquals(expectedResult, result);
	}

	@Test
	public void testWithListDeclarative() {
		List<String> list = Arrays.asList("A", "B", "C", "D", "E");
		int element = 3;
		String expectedResult = "C";

		Problem03 problem = new Problem03();
		String result = problem.getKthElementDeclarative(list, element);

		assertEquals(expectedResult, result);
	}
}
