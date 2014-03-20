package ninetyninejavaproblems;

import java.util.List;

/*
 * 
 * P02 (*) Find the last but one box of a list.
 Example:
 * (my-but-last '(a b c d))
 (C)

 */

public class Problem02 {

	public <T> T getLastButOneElementDirect(List<T> list) {
		T result = null;
		int size = list.size();
		if (null != list && size > 0) {
			result = list.get(size - 2);
		}
		return result;
	}

	public <T> T getLastButOneElementIterative(List<T> list) {
		T result = null;
		T previous = null;
		T current = null;
		if (null != list && list.size() > 0) {
			for (T element : list) {
				previous = current;
				current = element;
			}
			result = previous;
		}

		return result;
	}

	public <T> T getLastButOneElementDeclarative(List<T> list) {
		if (null == list || list.size() == 0) {
			return null;
		}
		if (list.size() == 2) {
			return list.get(0);
		} else {
			return getLastButOneElementDeclarative(list.subList(1, list.size()));
		}

	}
}
