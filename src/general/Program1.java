package general;

import java.util.Arrays;

public class Program1 {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4 };

		int count = 1;
		int res[] = new int[4];

		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a.length; j++) {

				if (i != j) {
					count = count * a[i];
				}

			}
			res[i] = count;
			count = 1;

		}

		System.out.println(Arrays.toString(res));

	}

}
