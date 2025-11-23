package dsa.arrays;

import java.util.*;

/**
 * 
 * Multiple ways to print an array
 * 
 */
public class PrintAnArray {

	public static void main(String[] args) {

		int a[] = new int[10];

		for (int i = 0; i < a.length; i++) {

			a[i] = i;

		}
		for (int j = 0; j < a.length; j++) {

			System.out.print(a[j]);

		}
		for (int res : a) {

			System.out.print(res);

		}

		String li = Arrays.toString(a);

		System.out.print(li);

		Arrays.stream(a).boxed().forEach(System.out::print);

	}

}
