package ninetyninejavaproblems;

import java.util.List;

/*
 * P01 (*) Find the last box of a list.
 Example:
 * (my-last '(a b c d))
 (D)
 * 
 */
public class Problem01 {

	public <T> T getLastElementDirect(List<T> list) {
		T result = null;
		if (null != list && list.size() > 0) {
			result = list.get(list.size() - 1);
		}
		return result;
	}

	public <T> T getLastElementIterative(List<T> list) {
		T result = null;
		if (null != list && list.size() > 0) {
			for (T element : list) {
				result = element;
			}
		}
		return result;
	}

	public <T> T getLastElementDeclarative(List<T> list) {
		if (null == list || list.size() == 0) {
			return null;
		}

		if (list.size() > 1) {
			return getLastElementDeclarative(list.subList(1, list.size()));
		} else {
			return list.get(0);
		}
	}

}
