package myleetcode.twopointers.medium;

import java.util.ArrayList;
import java.util.List;

public class Solution986_IntervalListIntersections {

	public static void main(String[] args) {

	}

}

/**
 * #### Method1: Merge Interval - There can be 1 overlapping on any interval,
 * calculate the inner intersection: lo(A[i][0], B[j][0]), hi(A[i][1], B[j][1])
 * - if low <= hi, a valid intersection exist; add - also, if A[i][1] < B[j][1];
 * that is A[i].end < B[j].end, then i++; otherwise j++ - because the
 * further-away `end` has been used, so move on.
 * 
 * #### Method1 Merge Interval - There can be 1 overlapping on any interval:
 * lo(start points) <= hi (end points) - move up which ever interval.end is the
 * left, because that must have been processed - O(n)
 */
class Solution986_1 {
	public int[][] intervalIntersection(int[][] A, int[][] B) {
		List<int[]> list = new ArrayList<>();
		int i = 0;
		int j = 0;
		int m = A.length;
		int n = B.length;
		while (i < m && j < n) {
			int lo = Math.max(A[i][0], B[j][0]);
			int hi = Math.min(A[i][1], B[j][1]);
			if (lo <= hi)
				list.add(new int[] { lo, hi });

			if (A[i][1] < B[j][1])
				i++;
			else
				j++;
		}

		int[][] result = new int[list.size()][2];
		for (int k = 0; k < list.size(); k++) {
			result[k] = list.get(k);
		}

		return result;
	}
	
	// TODO: Need to review
	public int[][] intervalIntersection2(int[][] A, int[][] B) {
		List<int[]> list = new ArrayList<>();
		int i = 0;
		int j = 0;
		while(i < A.length && j < B.length) {
			int lo = Math.max(A[i][0], B[j][0]);
			int hi = Math.min(A[i][1], B[j][1]);
			if(lo <= hi) {
				list.add(new int[] {lo, hi});
			}
			
			if(A[i][1] < B[j][1]) {
				i++;
			} else {
				j++;
			}
		}
		
		int[][] result = new int[list.size()][2];
		for(int k = 0; k < list.size(); k++) {
			result[k] = list.get(k);
		}
		
		return result;
	}
}