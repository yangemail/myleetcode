package myleetcode.string.easy;

import java.util.HashMap;
import java.util.Map;

public class Solution13_RomanToInteger {

	public static void main(String[] args) {

	}

}

class Solution13_1 {
	public int romanToInt(String s) {
		final Map<Character, Integer> romans = new HashMap<Character, Integer>() {
			{
				put('I', 1);
				put('V', 5);
				put('X', 10);
				put('L', 50);
				put('C', 100);
				put('D', 500);
				put('M', 1000);
			}
		};
		int result = 0;

		for (int i = 0; i < s.length(); i++) {
			char c1 = s.charAt(i);
			if (i < s.length() - 1) {
				char c2 = s.charAt(i + 1);
				if (romans.get(c1) - romans.get(c2) < 0) {
					result += (romans.get(c2) - romans.get(c1));
					i++;
					continue;
				}
			}

			result += romans.get(c1);
		}

		return result;
	}
}