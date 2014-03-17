package ninetyninejavaproblems;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/*
 * 
 * P02 (*) Find the last but one box of a list.
 Example:
 * (my-but-last '(a b c d))
 (C)

 */

@RunWith(JUnit4.class)
public class Problem02Test {

	@Test
	public void test_find_last_but_one_direct() {
		List<String> list = Arrays.asList("A", "B", "C", "D");
		String expectedResult = "C";

		Problem02 problem = new Problem02();
		String result = problem.getLastButOneElementDirect(list);

		assertEquals(expectedResult, result);
	}

	@Test
	public void test_find_last_but_one_iterative() {
		List<String> list = Arrays.asList("A", "B", "C", "D");
		String expectedResult = "C";

		Problem02 problem = new Problem02();
		String result = problem.getLastButOneElementIterative(list);

		assertEquals(expectedResult, result);
	}

	@Test
	public void test_find_last_but_one_declarative() {
		List<String> list = Arrays.asList("A", "B", "C", "D");
		String expectedResult = "C";

		Problem02 problem = new Problem02();
		String result = problem.getLastButOneElementDeclarative(list);

		assertEquals(expectedResult, result);
	}
}
