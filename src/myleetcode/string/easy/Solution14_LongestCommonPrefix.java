package myleetcode.string.easy;

import java.util.Arrays;

public class Solution14_LongestCommonPrefix {

	public static void main(String[] args) {

	}

}

class Solution14_1 {
	public String longestCommonPrefix(String[] strs) {
		if (strs == null || strs.length == 0) {
			return "";
		}

		Arrays.sort(strs);
		String first = strs[0];
		String last = strs[strs.length - 1];
		int size = first.length() < last.length() ? first.length() : last.length();

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < size; i++) {
			if(first.charAt(i) != last.charAt(i)) {
				break;
			}
			sb.append(first.charAt(i));
		}
		
		return sb.toString();
	}
}