package ninetyninejavaproblems;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/*
 * 
 * P06 (*) Find out whether a list is a palindrome.
 A palindrome can be read forward or backward; e.g. (x a m a x).
 * 
 */

@RunWith(JUnit4.class)
public class Problem06Test {

	@Test
	public void test_palindrome_list_direct() {
		List<Integer> list = Arrays.asList(1, 2, 3, 3, 2, 1);
		boolean expectedResult = true;

		Problem06 problem = new Problem06();
		boolean result = problem.isPalindromeDirect(list);

		assertEquals(expectedResult, result);
	}

	@Test
	public void test_non_palindrome_list_direct() {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 2, 1);
		boolean expectedResult = false;

		Problem06 problem = new Problem06();
		boolean result = problem.isPalindromeDirect(list);

		assertEquals(expectedResult, result);
	}

	@Test
	public void test_even_palindrome_list_iterative() {
		List<Integer> list = Arrays.asList(1, 2, 3, 3, 2, 1);
		boolean expectedResult = true;

		Problem06 problem = new Problem06();
		boolean result = problem.isPalindromeIterative(list);

		assertEquals(expectedResult, result);
	}

	@Test
	public void test_even_non_palindrome_list_iterative() {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 2, 1);
		boolean expectedResult = false;

		Problem06 problem = new Problem06();
		boolean result = problem.isPalindromeIterative(list);

		assertEquals(expectedResult, result);
	}

	@Test
	public void test_odd_palindrome_list_iterative() {
		List<Integer> list = Arrays.asList(1, 2, 3, 2, 1);
		boolean expectedResult = true;

		Problem06 problem = new Problem06();
		boolean result = problem.isPalindromeIterative(list);

		assertEquals(expectedResult, result);
	}

	@Test
	public void test_odd_non_palindrome_list_iterative() {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 1);
		boolean expectedResult = false;

		Problem06 problem = new Problem06();
		boolean result = problem.isPalindromeIterative(list);

		assertEquals(expectedResult, result);
	}

	@Test
	public void test_even_palindrome_list_declarative() {
		List<Integer> list = Arrays.asList(1, 2, 3, 3, 2, 1);
		boolean expectedResult = true;

		Problem06 problem = new Problem06();
		boolean result = problem.isPalindromeDeclarative(list);

		assertEquals(expectedResult, result);
	}

	@Test
	public void test_even_non_palindrome_list_declarative() {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 2, 1);
		boolean expectedResult = false;

		Problem06 problem = new Problem06();
		boolean result = problem.isPalindromeDeclarative(list);

		assertEquals(expectedResult, result);
	}

	@Test
	public void test_odd_palindrome_list_declarative() {
		List<Integer> list = Arrays.asList(1, 2, 3, 2, 1);
		boolean expectedResult = true;

		Problem06 problem = new Problem06();
		boolean result = problem.isPalindromeDeclarative(list);

		assertEquals(expectedResult, result);
	}

	@Test
	public void test_odd_non_palindrome_list_declarative() {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 1);
		boolean expectedResult = false;

		Problem06 problem = new Problem06();
		boolean result = problem.isPalindromeDeclarative(list);

		assertEquals(expectedResult, result);
	}

}
