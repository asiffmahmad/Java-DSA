package dsa.arrays;

/**
 * 14. Longest Common Prefix
 * 
 * Write a function to find the longest common prefix string amongst an array of
 * strings.
 * 
 * If there is no common prefix, return an empty string "".
 * 
 * Example 1:
 * 
 * Input: strs = ["flower","flow","flight"] Output: "fl"
 * 
 * Example 2:
 * 
 * Input: strs = ["dog","racecar","car"] Output: "" Explanation: There is no
 * common prefix among the input strings.
 * 
 */
public class Program14 {

	public static void main(String[] args) {

		String[] strs = { "dog", "racecar", "car" };
		String[] strs1 = { "flower", "flow", "flight" };

		String result = longestCommonPrefix(strs1);

		System.out.println(result);

	}

	public static String longestCommonPrefix(String[] strs) {
		String result = "";

		if (strs.length == 0)
			return "";

		String s = strs[0];

		for (int j = 0; j < s.length(); j++) {

			String prefix = s.substring(0, j + 1);

			for (int k = 0; k < strs.length; k++) {

				if (!strs[k].startsWith(prefix)) {
					return result;
				}

			}
			result = prefix;

		}

		return result;
	}

}
