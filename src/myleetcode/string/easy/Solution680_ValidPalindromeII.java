package myleetcode.string.easy;

public class Solution680_ValidPalindromeII {

	public static void main(String[] args) {

	}

}

// TODO:
class Solution680_1 {
	public boolean validPalindrome(String s) {
		if (s == null || s.length() <= 1)
			return true;

		return validate(s, 0, s.length() - 1, true);
	}

	private boolean validate(String s, int start, int end, boolean state) {
		if (start > end)
			return false;
		while (start < end) {
			if (s.charAt(start) == s.charAt(end)) {
				start++;
				end--;
				continue;
			} else if (state) {
				return validate(s, start + 1, end, false) || validate(s, start, end - 1, false);
			}
			return false;
		}
		return true;
	}
	
}