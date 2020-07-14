package myleetcode.math.easy;

public class Solution9_PalindromeNumber {

	public static void main(String[] args) {

	}

}

class Solution9_1 {
	public boolean isPalindrome(int x) {
		if (x < 0) {
			return false;
		}
		return x == reverse(x);
	}

	public int reverse(int x) {
		int result = 0;
		while (x != 0) {
			result = result * 10 + x % 10;
			x /= 10;
		}
		return result;
	}
}
