package dsa.strings;

import java.util.Stack;

/*
 
 20. Valid Parentheses

Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 

Example 1:

Input: s = "()"

Output: true

Example 2:

Input: s = "()[]{}"

Output: true

Example 3:

Input: s = "(]"

Output: false
 
 */

public class Program20 {

	public static void main(String[] args) {

		String s = "()[]{}";

		boolean result = isValid(s);

		System.out.println(result);

	}

	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();

		for (char c : s.toCharArray()) {
			// If it's an opening bracket, stack it up
			if (c == '(' || c == '{' || c == '[') {
				stack.push(c);
			} else {
				// If stack is empty or mismatch — invalid
				if (stack.isEmpty())
					return false;
				char top = stack.pop();

				if (c == ')' && top != '(')
					return false;
				if (c == '}' && top != '{')
					return false;
				if (c == ']' && top != '[')
					return false;
			}
		}

		// All actors must have exited the stage
		return stack.isEmpty();
	}

}
