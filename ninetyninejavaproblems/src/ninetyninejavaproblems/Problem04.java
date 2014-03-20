package ninetyninejavaproblems;

import java.util.List;

/*
 * P04 (*) Find the number of elements of a list.
 * 
 */

public class Problem04 {

	public <T> int howManyElementsDirect(List<T> list) {
		return list.size();
	}

	public <T> int howManyElementsImperative(List<T> list) {
		int result = 0;
		for (T element : list) {
			result++;
		}
		return result;
	}

	public <T> int howManyElementsDeclarative(List<T> list) {
		if (list.isEmpty()) {
			return 0;
		} else {
			return 1 + howManyElementsDeclarative(list.subList(1, list.size()));
		}
	}

}
