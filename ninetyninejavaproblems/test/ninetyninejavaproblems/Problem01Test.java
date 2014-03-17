package ninetyninejavaproblems;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/*
 *
 * P01 (*) Find the last box of a list.
 Example:
 * (my-last '(a b c d))
 (D)
 * 
 */

@RunWith(JUnit4.class)
public class Problem01Test {

	@Test
	public void test_find_last_with_empty_list_direct() {
		Problem01 problem = new Problem01();
		String result = problem.getLastElementDirect(null);

		assertNull(result);
	}

	@Test
	public void test_find_last_direct() {
		List<String> list = Arrays.asList("A", "B", "C", "D");
		String expectedResult = "D";

		Problem01 problem = new Problem01();
		String result = problem.getLastElementDirect(list);

		assertEquals(expectedResult, result);
	}

	@Test
	public void test_find_last_with_empty_list_iterative() {
		Problem01 problem = new Problem01();
		String result = problem.getLastElementIterative(null);

		assertNull(result);
	}

	@Test
	public void test_find_last_iterative() {
		List<String> list = Arrays.asList("A", "B", "C", "D");
		String expectedResult = "D";

		Problem01 problem = new Problem01();
		String result = problem.getLastElementIterative(list);

		assertEquals(expectedResult, result);
	}

	@Test
	public void test_find_last_with_empty_list_declarative() {
		Problem01 problem = new Problem01();
		String result = problem.getLastElementDeclarative(null);

		assertNull(result);
	}

	@Test
	public void test_find_last_declarative() {
		List<String> list = Arrays.asList("A", "B", "C", "D");
		String expectedResult = "D";

		Problem01 problem = new Problem01();
		String result = problem.getLastElementDeclarative(list);

		assertEquals(expectedResult, result);
	}

}
