package ninetyninejavaproblems;

import java.util.List;

public class Problem02 {

	public String getLastButOneElementDirect(List<String> list) {
		String result = null;
		int size = list.size();
		if (null != list && size > 0) {
			result = list.get(size - 2);
		}
		return result;
	}

	public String getLastButOneElementIterative(List<String> list) {
		String result = null;
		String previous = null;
		String current = null;
		if (null != list && list.size() > 0) {
			for (String element : list) {
				previous = current;
				current = element;
			}
			result = previous;
		}

		return result;
	}

	public String getLastButOneElementDeclarative(List<String> list) {
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
