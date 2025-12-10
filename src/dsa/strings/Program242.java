package dsa.strings;

import java.util.Arrays;
import java.util.stream.Collectors;

/*
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.

Example 1:

Input: s = "anagram", t = "nagaram"

Output: true

Example 2:

Input: s = "rat", t = "car"

Output: false
 * 
 * 
 */
public class Program242 {

	public static void main(String[] args) {

		boolean result = isAnagram("anagram", "nagaram");

		System.out.println(result);

	}

	public static boolean isAnagram(String s, String t) {

		boolean result = false;
		if (s.length() != t.length()) {
			return false;
		}

		String str1 = Arrays.asList(s.split("")).stream().sorted().collect(Collectors.joining());
		String str2 = Arrays.asList(t.split("")).stream().sorted().collect(Collectors.joining());

		if (str1.equalsIgnoreCase(str2)) {
			result = true;
		}

		return result;
	}

}
