package ninetyninejavaproblems;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/*
 * 
 * Flatten a nested list structure.
 Transform a list, possibly holding lists as elements into a `flat' list by replacing each list with its elements (recursively).

 Example:
 * (my-flatten '(a (b (c d) e)))
 (A B C D E)

 Hint: Use the predefined functions list and append.
 * 
 */

@RunWith(JUnit4.class)
public class Problem07Test {

	@Test
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void test_flatten_list_of_lists() {
		List innermostList = new ArrayList();
		innermostList.add(3);
		innermostList.add(4);

		List innerList = new ArrayList();
		innerList.add(2);
		innerList.add(innermostList);

		List testList = new ArrayList();
		testList.add(1);
		testList.add(innerList);
		testList.add(5);

		List expectedResult = new ArrayList();
		expectedResult.add(1);
		expectedResult.add(2);
		expectedResult.add(3);
		expectedResult.add(4);
		expectedResult.add(5);

		Problem07 problem = new Problem07();
		List result = problem.flattenList(testList);

		assertEquals(expectedResult, result);
	}

	@Test
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void test_flatten_normal_list() {
		List list = Arrays.asList(1, 2, 3, 4, 5);
		List expectedResult = Arrays.asList(1, 2, 3, 4, 5);

		Problem07 problem = new Problem07();
		List result = problem.flattenList(list);

		assertEquals(expectedResult, result);
	}
}
