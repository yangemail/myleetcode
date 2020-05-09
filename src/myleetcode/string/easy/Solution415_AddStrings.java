package myleetcode.string.easy;

public class Solution415_AddStrings {

	public static void main(String[] args) {
//		String num1 = "1";
//		String num2 = "1";
		String num1 = "0";
		String num2 = "0";
		String result = new Solution415_1().addStrings(num1, num2);
		System.out.println("Result => " + result);
	}

}

class Solution415_1 {
	public String addStrings(String num1, String num2) {
		StringBuilder result = new StringBuilder();
		int i = num1.length() - 1;
		int j = num2.length() - 1;
		int carry = 0;

		while (i >= 0 || j >= 0) {
			int sum = carry;
			if (i >= 0) {
				sum += num1.charAt(i--) - '0';
			}
			if (j >= 0) {
				sum += num2.charAt(j--) - '0';
			}
			result.insert(0, sum % 10);
			carry = sum / 10;
		}

		if (carry != 0) {
			result.insert(0, carry);
		}

		return result.toString();
	}
}