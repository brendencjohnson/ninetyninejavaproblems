package ninetyninejavaproblems;

import java.util.Arrays;
import java.util.List;

import org.apache.commons.collections4.CollectionUtils;

/*
 * 
 * P06 (*) Find out whether a list is a palindrome.
 A palindrome can be read forward or backward; e.g. (x a m a x).
 * 
 */
public class Problem06 {

	public <T> boolean isPalindromeDirect(List<T> list) {

		Object[] reversed = list.toArray();
		CollectionUtils.reverseArray(reversed);

		return list.equals(Arrays.asList(reversed));
	}

	public <T> boolean isPalindromeIterative(List<T> list) {
		boolean result = true;

		for (int i = 0, k = list.size() - 1; i <= k; i++, k--) {
			if (!list.get(i).equals(list.get(k))) {
				result = false;
				break;
			}
		}

		return result;
	}

	public <T> boolean isPalindromeDeclarative(List<T> list) {
		if (null == list || list.isEmpty() || list.size() == 1) {
			return true;
		}
		return (list.subList(0, 1).equals(list.subList(list.size() - 1,
				list.size())))
				&& isPalindromeDeclarative(list.subList(1, list.size() - 1));

	}
}
