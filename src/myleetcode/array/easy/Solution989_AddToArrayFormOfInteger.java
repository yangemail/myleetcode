package myleetcode.array.easy;

import java.util.ArrayList;
import java.util.List;

public class Solution989_AddToArrayFormOfInteger {

	public static void main(String[] args) {
//		int[] A = new int[] { 9, 9, 9, 9, 9, 9, 9, 9, 9, 9 };
//		int K = 1;
//		int[] A = new int[] { 0 };
//		int K = 0;
		int[] A = new int[] {1,2,6,3,0,7,1,7,1,9,7,5,6,6,4,4,0,0,6,3};
		int K = 516;
		List<Integer> result = new Solution989_1().addToArrayForm(A, K);
		System.out.println("Result => " + result);
	}

}

class Solution989_1 {
	public List<Integer> addToArrayForm(int[] A, int K) {
		return null;
	}
}