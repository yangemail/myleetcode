package myleetcode.sort.medium;

import java.util.Arrays;

public class Solution324_WiggleSortII {

	public static void main(String[] args) {

	}

}

// TODO:	
//O(n) space
/**
 * 方法一： 对数组进行排序，然后将前半段倒序填入奇数下标，将后半段倒序填入偶数下标，
 * 其原理是如果题目有解，则对于排好序的数组，间隔超过n/2的两个元素必不相等。 时间复杂度O(nlogn)，空间复杂度O(n)。
 */
class Solution324_1 {
	public void wiggleSort(int[] nums) {
		int[] sorted = nums.clone();
		Arrays.sort(sorted);
		int mid = (nums.length - 1) / 2;

		for (int i = 0, j = mid, k = nums.length - 1; i < nums.length; i += 2, j--, k--) {
			nums[i] = sorted[j];
			if (i + 1 < nums.length)
				nums[i + 1] = sorted[k];
		}
	}
}
