package myleetcode.array.easy;

import java.util.Arrays;

public class Solution977_SquaresOfASortedArray {

	public static void main(String[] args) {

	}

}

class Solution977_1 {
	public int[] sortedSquares(int[] A) {
		if (A == null || A.length == 0)
			return A;

		for (int i = 0; i < A.length; i++) {
			A[i] = Math.abs(A[i]);
		}
		Arrays.sort(A);

		for (int i = 0; i < A.length; i++) {
			A[i] *= A[i];
		}

		return A;
	}
}

class Solution977_2 {
	public int[] sortedSquares(int[] A) {
		int left = 0;
		int right = A.length - 1;
		int[] result = new int[A.length];
		int index = right;
		while (left <= right) {
			int m = A[left] * A[left];
			int n = A[right] * A[right];
			if (m > n) {
				result[index--] = m;
				left++;
			} else {
				result[index--] = n;
				right--;
			}
		}
		return result;
	}
}