package ninetyninejavaproblems;

import java.util.List;

/*
 * P03 (*) Find the K'th element of a list.
 The first element in the list is number 1.
 Example:
 * (element-at '(a b c d e) 3)
 C
 * 
 */

public class Problem03 {

	public <T> T getKthElementDirect(List<T> list, int element) {
		T result = null;
		if (null != list && list.size() > 0) {
			result = list.get(element - 1);
		}
		return result;
	}

	public <T> T getKthElementIterative(List<T> list, int element) {
		T result = null;
		if (null != list && list.size() > 0) {
			for (int i = 0; i < element; i++) {
				result = list.get(i);
			}
		}
		return result;

	}

	public <T> T getKthElementDeclarative(List<T> list, int element) {
		if (null == list || list.size() == 0) {
			return null;
		}

		if (element == 1) {
			return list.get(0);
		} else {
			return getKthElementDeclarative(list.subList(1, list.size()),
					element - 1);
		}

	}
}
