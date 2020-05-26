package myleetcode.array.easy;

import java.util.ArrayList;
import java.util.List;

public class Solution989_AddToArrayFormOfInteger {

	public static void main(String[] args) {
//		int[] A = new int[] { 9, 9, 9, 9, 9, 9, 9, 9, 9, 9 };
//		int K = 1;
//		int[] A = new int[] { 0 };
//		int K = 0;
		int[] A = new int[] { 1, 2, 6, 3, 0, 7, 1, 7, 1, 9, 7, 5, 6, 6, 4, 4, 0, 0, 6, 3 };
		int K = 516;
		List<Integer> result = new Solution989_1().addToArrayForm(A, K);
		System.out.println("Result => " + result);
	}

}

class Solution989_1 {
	public List<Integer> addToArrayForm(int[] A, int K) {
		char[] kArray = String.valueOf(K).toCharArray();
		int carry = 0;
		int i = A.length - 1;
		int j = kArray.length - 1;
		List<Integer> result = new ArrayList<>();

		while (i >= 0 || j >= 0) {
			int sum = carry;
			if (i >= 0) {
				sum += A[i--];
			}
			if (j >= 0) {
				sum += kArray[j--] - '0';
			}
			result.add(0, sum % 10);
			carry = sum / 10;
		}

		if (carry > 0) {
			result.add(0, carry);
		}

		return result;
	}
}