package dsa.strings;

/*
 * 125. Valid Palindrome
 * Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.
 */
public class Program125 {

	public static void main(String[] args) {

		String s = "0P";
		boolean result = isPalindrome(s);

		System.out.println("Palindrome " + result);

	}

	public static boolean isPalindrome(String s) {

		String inputString = s.replaceAll("[^a-zA-Z0-9]", "");

		StringBuffer s1 = new StringBuffer(inputString);

		String reverseString = s1.reverse().toString();
		
		System.out.println(inputString);
		System.out.println(reverseString);

		if (s1.isEmpty()) {
			return true;
		}

		if (inputString.equalsIgnoreCase(reverseString)) {

			return true;

		} else
			return false;

	}

}
