package dsa.strings;

import java.math.BigInteger;

/*
 * 
 * 43. Multiply Strings
 * Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2, also represented as a string.

Note: You must not use any built-in BigInteger library or convert the inputs to integer directly.
 */
public class Program43 {
	
	
	
	
	
	public static void main(String[] args) {
		
		String num1 = "2";
		String num2 = "3" ; 
		String result = multiply(num1, num2);
		
		System.out.println(result);
		
	}
	    public static String multiply(String num1, String num2) {

	    BigInteger a = new BigInteger(num1);
	    BigInteger b = new BigInteger(num2);

	    BigInteger c = a.multiply(b);

	    return c.toString();
	}

}
