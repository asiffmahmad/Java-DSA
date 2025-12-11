package general;

import java.util.*;

/*
 * 136. Single Number
 * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.
Example 1:

Input: nums = [2,2,1]

Output: 1

Example 2:

Input: nums = [4,1,2,1,2]

Output: 4
 */
public class Program136 {

	public static void main(String[] args) {

		int[] nums = { 4, 1, 2, 1, 2 };
		int result = singleNumber(nums);

		System.out.println(result);

	}

	public static int singleNumber(int[] nums) {

		if (nums.length == 0)
			return 0;

		int result = 0;

		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {

			hm.put((Integer) nums[i], hm.get(nums[i]) == null ? 1 : hm.get(nums[i]) + 1);

		}

		for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
			Integer key = entry.getKey();
			Integer val = entry.getValue();

			//System.out.println("key >>" + key + "val >>>" + val);

			if (val == 1) {
				result = key;
				return result;
			}

		}

		return result;

	}

}
