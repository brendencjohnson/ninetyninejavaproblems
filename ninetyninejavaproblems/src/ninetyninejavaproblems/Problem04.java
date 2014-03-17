package ninetyninejavaproblems;

import java.util.List;

/*
 * P04 (*) Find the number of elements of a list.
 * 
 */

public class Problem04 {

	public int howManyElementsDirect(List<String> list) {
		return list.size();
	}

	public int howManyElementsImperative(List<String> list) {
		int result = 0;
		for (String element : list) {
			result++;
		}
		return result;
	}

	public int howManyElementsDeclarative(List<String> list) {
		if (list.isEmpty()) {
			return 0;
		} else {
			return 1 + howManyElementsDeclarative(list.subList(1, list.size()));
		}
	}

}
