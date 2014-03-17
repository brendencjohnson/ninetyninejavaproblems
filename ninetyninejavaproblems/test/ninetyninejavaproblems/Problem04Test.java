package ninetyninejavaproblems;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/*
 * P04 (*) Find the number of elements of a list.
 * 
 */

@RunWith(JUnit4.class)
public class Problem04Test {

	@Test
	public void test_how_many_elements_in_empty_list_direct() {
		List<String> list = Collections.emptyList();
		int expectedResult = 0;

		Problem04 problem = new Problem04();
		int result = problem.howManyElementsDirect(list);

		assertEquals(expectedResult, result);
	}

	@Test
	public void test_how_many_elements__in_list_direct() {
		List<String> list = Arrays.asList("A", "B", "C", "D", "E");
		int expectedResult = 5;

		Problem04 problem = new Problem04();
		int result = problem.howManyElementsDirect(list);

		assertEquals(expectedResult, result);
	}

	@Test
	public void test_how_many_elements_in_empty_list_imperative() {
		List<String> list = Collections.emptyList();
		int expectedResult = 0;

		Problem04 problem = new Problem04();
		int result = problem.howManyElementsImperative(list);

		assertEquals(expectedResult, result);
	}

	@Test
	public void test_how_many_elements__in_list_imperative() {
		List<String> list = Arrays.asList("A", "B", "C", "D", "E");
		int expectedResult = 5;

		Problem04 problem = new Problem04();
		int result = problem.howManyElementsImperative(list);

		assertEquals(expectedResult, result);
	}

	@Test
	public void test_how_many_elements_in_empty_list_declarative() {
		List<String> list = Collections.emptyList();
		int expectedResult = 0;

		Problem04 problem = new Problem04();
		int result = problem.howManyElementsDeclarative(list);

		assertEquals(expectedResult, result);
	}

	@Test
	public void test_how_many_elements__in_list_declarative() {
		List<String> list = Arrays.asList("A", "B", "C", "D", "E");
		int expectedResult = 5;

		Problem04 problem = new Problem04();
		int result = problem.howManyElementsDeclarative(list);

		assertEquals(expectedResult, result);
	}

}