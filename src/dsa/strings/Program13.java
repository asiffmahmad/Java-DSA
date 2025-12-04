package dsa.strings;

import java.util.HashMap;
import java.util.Map;

public class Program13 {

	public static void main(String[] args) {

		int result = romanToInt("III");

		System.out.println(result);
	}

	public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            int curr = map.get(s.charAt(i));

            // Look ahead to next value if it exists
            if (i + 1 < s.length()) {
                int next = map.get(s.charAt(i + 1));

                if (curr < next) {
                    // subtractive case, e.g., IV, IX, CM, etc.
                    result -= curr;
                    continue;
                }
            }

            // normal case: just add
            result += curr;
        }

        return result;
    }

}
