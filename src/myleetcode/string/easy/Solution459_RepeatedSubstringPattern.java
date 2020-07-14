package myleetcode.string.easy;

public class Solution459_RepeatedSubstringPattern {

	public static void main(String[] args) {
		String s = "abab";
		boolean result = new Solution459_1().repeatedSubstringPattern(s);
		System.out.println("Result => " + result);
	}

}

class Solution459_1 {
	public boolean repeatedSubstringPattern(String s) {
		if (s == null || s.length() == 0) {
			return false;
		}

		for (int i = 1; i <= s.length(); i++) {
			String subStr = s.substring(0, i);
			int left = i;
			int right = i * 2;
			while (right <= s.length()) {
				if (!s.substring(left, right).equals(subStr)) {
					break;
				}
				if (right == s.length()) {
					return true;
				}
				left += i;
				right += i;
			}
		}

		return false;
	}
}