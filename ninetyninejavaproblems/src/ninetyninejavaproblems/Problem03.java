package ninetyninejavaproblems;

import java.util.List;

public class Problem03 {

	public String getKthElementDirect(List<String> list, int element) {
		String result = null;
		if (null != list && list.size() > 0) {
			result = list.get(element - 1);
		}
		return result;
	}

	public String getKthElementIterative(List<String> list, int element) {
		String result = null;
		if (null != list && list.size() > 0) {
			for (int i = 0; i < element; i++) {
				result = list.get(i);
			}
		}
		return result;

	}

	public String getKthElementDeclarative(List<String> list, int element) {
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
