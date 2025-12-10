package general;

/*
 * 
 70. Climbing Stairs
You are climbing a staircase. It takes n steps to reach the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

 

Example 1:

Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps
Example 2:

Input: n = 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step
 */

public class Program70 {

	public static void main(String[] args) {

		int result = climbStairs(6);

		System.out.println(result);
	}

	public static int climbStairs(int n) {
		// Base cases
		if (n <= 2)
			return n;

		int first = 1; // ways to reach step 1
		int second = 2; // ways to reach step 2
		int total = 0;

		for (int i = 3; i <= n; i++) {
			total = first + second; // previous two sums
			first = second; // move forward
			second = total;
		}
		return total;
	}

}
