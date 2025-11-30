package dsa.arrays;

/*
 * 
 * 28. Find the Index of the First Occurrence in a String
Example 1:

Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.
Example 2:

Input: haystack = "leetcode", needle = "leeto"
Output: -1
Explanation: "leeto" did not occur in "leetcode", so we return -1.
 */
public class Program28 {

	public static void main(String[] args) {

		String haystack = "hello";
		String needle = "ll";

		int result = strStr(haystack, needle);

		System.out.println(result);

	}

	public static int strStr(String haystack, String needle) {

		int result = 0;
		if (needle.length() > haystack.length()) {
			return result = -1;

		}

		for (int i = 0; i < haystack.length(); i++) {

			if (i + needle.length() > haystack.length()) {
				break;

			}
			String a = haystack.substring(i, i + needle.length());

			if (a.equals(needle)) {
				result = i;
				break;
			} else
				result = -1;

		}

		return result;

	}

}
