package myleetcode.string.medium;

public class Solution43_MutiplyStrings {

	public static void main(String[] args) {
//		String num1 = "2";
//		String num2 = "3";
		String num1 = "123";
		String num2 = "456";
		// expect output = 56088
		String result = new Solution43_1().multiply(num1, num2);
		System.out.println("Result => " + result);
	}

}

class Solution43_1 {
	public String multiply(String num1, String num2) {
		if (num1 == null || num2 == null) {
			return "";
		} else if (num1.length() == 0 || num2.length() == 0) {
			return num1.length() == 0 ? num2 : num1;
		} else if (num1.equals("0") || num2.equals("0")) {
			return "0";
		}

		// reverse string, so to calculate from 0 base. easier to calculate.
		num1 = new StringBuffer(num1).reverse().toString();
		num2 = new StringBuffer(num2).reverse().toString();

		// Result array, extra leading space for carriers
		// normally just need num1.length() + num2.length() - 1
		int[] result = new int[num1.length() + num2.length()];

		// Calculate the product normally
		// TODO:
		for (int i = 0; i < num1.length(); i++) {
			int a = num1.charAt(i) - '0';
			for (int j = 0; j < num2.length(); j++) {
				int b = num2.charAt(j) - '0';
				// ?? TODO:
				result[i + j] += a * b;
			}
		}

		// calculate and output
		// remember, now the string is reversed calculated.
		// so everytime, add to index 0. so it will all reverse back;
		// OR, append, and reverse later.
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < result.length; i++) {
			int number = result[i] % 10;
			int carrier = result[i] / 10;
			sb.append(number);
			if(i < result.length-1) {
				result[i+1] += carrier; 
			}
		}
		
		sb.reverse();
		// trim leadding '0's
		while(sb.length() > 0 && sb.charAt(0) == '0') {
			sb.deleteCharAt(0);
		}
		
		return sb.toString();
	}
}
