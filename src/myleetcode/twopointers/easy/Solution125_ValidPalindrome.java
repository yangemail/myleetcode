package myleetcode.twopointers.easy;

public class Solution125_ValidPalindrome {

	public static void main(String[] args) {
		boolean result = new Solution125_1().isPalindrome(".,");
		System.out.println("Result => " + result);
	}

}

class Solution125_1 {
	public boolean isPalindrome(String s) {
		if (s == null || s.length() == 0)
			return true;
		int start = 0;
		int end = s.length() - 1;
		while (start < end) {
			while (start < s.length() && !isValid(s.charAt(start)))
				start++;
			while (end >= 0 && !isValid(s.charAt(end)))
				end--;
			if (start < end && !compare(s.charAt(start), s.charAt(end)))
				return false;
			start++;
			end--;
		}
		return true;
	}

	private boolean compare(char a, char b) {
		return Character.toLowerCase(a) == Character.toLowerCase(b);
	}

	private boolean isValid(char c) {
		return (c >= '0' && c <= '9') || (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
	}
}