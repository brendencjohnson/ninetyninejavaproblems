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

	public String getLastElementDirect(List<String> list) {
		String result = null;
		if (null != list && list.size() > 0) {
			result = list.get(list.size() - 1);
		}
		return result;
	}

	public String getLastElementIterative(List<String> list) {
		String result = null;
		if (null != list && list.size() > 0) {
			for (String element : list) {
				result = element;
			}
		}
		return result;
	}

	public String getLastElementDeclarative(List<String> list) {
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
