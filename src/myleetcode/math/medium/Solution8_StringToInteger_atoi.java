package myleetcode.math.medium;

public class Solution8_StringToInteger_atoi {

	public static void main(String[] args) {
		int outcome = new Solution8_1().myAtoi("42");
//		int outcome = new Solution8_2().myAtoi("4193 with words");
		System.out.println("Outcome => " + outcome);
	}

}

class Solution8_1 {
	public int myAtoi(String str) {
		if (null == str || str.trim().length() == 0) {
			return 0;
		}

		String s = str.trim();
		char operator = ' ';
		int idx = 0;
		int len = s.length();

		// Step 1: parse operator
		if (idx < len && (s.charAt(idx) == '+' || s.charAt(idx) == '-')) {
			operator = s.charAt(idx++);
		}

		// Step 2: parse Zero '0'
		while (idx < len && s.charAt(idx) == '0') {
			idx++;
		}

		// Step 3: get number string
		StringBuffer sb = getNumStr(s, idx);

		// validation1: max length over max integer length
		if (sb.length() > String.valueOf(Integer.MAX_VALUE).length()) {
			return operator == '-' ? Integer.MIN_VALUE : Integer.MAX_VALUE;
		}

		// validation2: exceed min/max value
		long num = Long.parseLong(sb.toString()) * (operator == '-' ? -1 : 1);
		if (num > Integer.MAX_VALUE) {
			return Integer.MAX_VALUE;
		}
		if (num < Integer.MIN_VALUE) {
			return Integer.MIN_VALUE;
		}

		return (int) num;
	}

	private boolean isDigit(char c) {
		return c >= '0' && c <= '9';
	}

	private StringBuffer getNumStr(String s, int idx) {
		StringBuffer sb = new StringBuffer();
		if (idx >= s.length() || !isDigit(s.charAt(idx))) {
			// leading char validation, return 0 if invalid
			sb.append(0);
			return sb;
		}

		while (idx < s.length()) {
			char c = s.charAt(idx++);
			if (!isDigit(c)) {
				break;
			}
			sb.append(c);
		}
		return sb;
	}
}

// TODO: Need to fix "4193 with words"
class Solution8_2 {
	public int myAtoi(String str) {
		if (str == null || str.length() == 0) {
			return 0;
		}
		str = str.replaceAll("\\s", "");
		if (!str.matches("[+-]?(?:\\d+(?:\\.\\d*)?|\\.\\d+)")) {
			return 0;
		}
		double rst = Double.parseDouble(str);
		if (rst > Integer.MAX_VALUE) {
			return Integer.MAX_VALUE;
		} else if (rst < Integer.MIN_VALUE) {
			return Integer.MIN_VALUE;
		} else {
			return (int) rst;
		}
	}
}