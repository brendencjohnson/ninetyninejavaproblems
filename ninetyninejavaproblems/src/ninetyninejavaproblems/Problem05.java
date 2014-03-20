package ninetyninejavaproblems;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections4.ListUtils;

/*
 * P05 (*) Reverse a list.
 * 
 */

public class Problem05 {

	public <T> List<T> reverseListIterative(List<T> list) {
		List<T> reversedList = new ArrayList<>();

		for (int i = list.size() - 1; i >= 0; i--) {
			reversedList.add(list.get(i));
		}

		return reversedList;
	}

	public <T> List<T> reverseListDeclarative(List<T> list) {
		if (list == null || list.isEmpty()) {
			return list;
		}
		return ListUtils.sum(
				reverseListDeclarative(list.subList(1, list.size())),
				list.subList(0, 1));
	}
}
