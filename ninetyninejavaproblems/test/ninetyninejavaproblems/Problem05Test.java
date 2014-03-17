package ninetyninejavaproblems;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/*
 * P05 (*) Reverse a list.
 * 
 */

@RunWith(JUnit4.class)
public class Problem05Test {

	@Test
	public void test_reverse_empty_list_iterative() {
		List<String> list = Collections.emptyList();
		List<String> expectedResult = Collections.emptyList();

		Problem05 problem = new Problem05();
		List<String> result = problem.reverseListIterative(list);

		assertEquals(expectedResult, result);
	}

	@Test
	public void test_reverse_list_iterative() {
		List<String> list = Arrays.asList("A", "B", "C", "D", "E");
		List<String> expectedResult = Arrays.asList("E", "D", "C", "B", "A");

		Problem05 problem = new Problem05();
		List<String> result = problem.reverseListIterative(list);

		assertEquals(expectedResult, result);
	}

	@Test
	public void test_reverse_empty_list_declarative() {
		List<String> list = Collections.emptyList();
		List<String> expectedResult = Collections.emptyList();

		Problem05 problem = new Problem05();
		List<String> result = problem.reverseListDeclarative(list);

		assertEquals(expectedResult, result);
	}

	@Test
	public void test_reverse_list_declarative() {
		List<String> list = Arrays.asList("A", "B", "C", "D", "E");
		List<String> expectedResult = Arrays.asList("E", "D", "C", "B", "A");

		Problem05 problem = new Problem05();
		List<String> result = problem.reverseListDeclarative(list);

		assertEquals(expectedResult, result);
	}

}
