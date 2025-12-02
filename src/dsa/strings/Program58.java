package dsa.strings;

/*
 * 58. Length of Last Word
 * 
 * Example 1:

Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
Example 2:

Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.
 */
public class Program58 {

	public static void main(String[] args) {

		String s = "luffy is still joyboy";
		int result = lengthOfLastWord(s);

		System.out.println(result);

	}

	public static int lengthOfLastWord(String s) {

		String[] word = s.split(" ");

		String result = word[word.length - 1];
		return result.length();

	}

}
