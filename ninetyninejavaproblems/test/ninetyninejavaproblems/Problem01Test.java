package ninetyninejavaproblems;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class Problem01Test {

	@Test
	public void testWithEmptyListDirect() {
		Problem01 problem = new Problem01();
		String result = problem.getLastElementDirect(null);

		assertNull(result);
	}

	@Test
	public void testWithListDirect() {
		List<String> list = Arrays.asList("A", "B", "C", "D");
		String expectedResult = "D";

		Problem01 problem = new Problem01();
		String result = problem.getLastElementDirect(list);

		assertEquals(expectedResult, result);
	}

	@Test
	public void testWithEmptyListIterative() {
		Problem01 problem = new Problem01();
		String result = problem.getLastElementIterative(null);

		assertNull(result);
	}

	@Test
	public void testWithListIterative() {
		List<String> list = Arrays.asList("A", "B", "C", "D");
		String expectedResult = "D";

		Problem01 problem = new Problem01();
		String result = problem.getLastElementIterative(list);

		assertEquals(expectedResult, result);
	}

	@Test
	public void testWithEmptyListDeclarative() {
		Problem01 problem = new Problem01();
		String result = problem.getLastElementDeclarative(null);

		assertNull(result);
	}

	@Test
	public void testWithListDeclarative() {
		List<String> list = Arrays.asList("A", "B", "C", "D");
		String expectedResult = "D";

		Problem01 problem = new Problem01();
		String result = problem.getLastElementDeclarative(list);

		assertEquals(expectedResult, result);
	}

}
