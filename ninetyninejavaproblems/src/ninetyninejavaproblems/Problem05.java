package ninetyninejavaproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * P05 (*) Reverse a list.
 * 
 */

public class Problem05 {

	public List<String> reverseListIterative(List<String> list) {
		List<String> reversedList = new ArrayList<>();

		for (int i = list.size() - 1; i >= 0; i--) {
			reversedList.add(list.get(i));
		}

		return reversedList;
	}

	public List<String> reverseListDeclarative(List<String> list) {
		if (list == null || list.isEmpty()) {
			return list;
		}
		List<String> testList = Arrays.asList("D", "C", "B", "A");
		List<Object> result = Arrays.asList("E", testList);
		Arrays.
		return Collections.emptyList();
	}
}
