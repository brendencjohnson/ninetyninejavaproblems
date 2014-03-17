package ninetyninejavaproblems;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/*
 * P03 (*) Find the K'th element of a list.
 The first element in the list is number 1.
 Example:
 * (element-at '(a b c d e) 3)
 C
 * 
 */

@RunWith(JUnit4.class)
public class Problem03Test {

	@Test
	public void test_find_kth_element_direct() {
		List<String> list = Arrays.asList("A", "B", "C", "D", "E");
		int element = 3;
		String expectedResult = "C";

		Problem03 problem = new Problem03();
		String result = problem.getKthElementDirect(list, element);

		assertEquals(expectedResult, result);
	}

	@Test
	public void test_find_kth_element_iterative() {
		List<String> list = Arrays.asList("A", "B", "C", "D", "E");
		int element = 3;
		String expectedResult = "C";

		Problem03 problem = new Problem03();
		String result = problem.getKthElementIterative(list, element);

		assertEquals(expectedResult, result);
	}

	@Test
	public void test_find_kth_element_dec() {
		List<String> list = Arrays.asList("A", "B", "C", "D", "E");
		int element = 3;
		String expectedResult = "C";

		Problem03 problem = new Problem03();
		String result = problem.getKthElementDeclarative(list, element);

		assertEquals(expectedResult, result);
	}
}
