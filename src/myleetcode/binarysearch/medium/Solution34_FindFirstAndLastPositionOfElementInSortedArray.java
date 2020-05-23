package myleetcode.binarysearch.medium;

public class Solution34_FindFirstAndLastPositionOfElementInSortedArray {

	public static void main(String[] args) {

	}

}

/**
 * 这道题让我们在一个有序整数数组中寻找相同目标值的起始和结束位置，而且限定了时间复杂度为 O(logn)，
 * 这是典型的二分查找法的时间复杂度，所以这里也需要用此方法.
 * 
 * 那么下面来看一种真正意义上的 O(logn) 的算法，使用两次二分查找法， 第一次找到左边界，第二次调用找到右边界即可， 具体代码如下：
 *
 */
class Solution34_1 {
	public int[] searchRange(int[] nums, int target) {
		int[] result = new int[] { -1, -1 };
		int left = 0, right = nums.length;
		// Find 1st
		while (left < right) {
			int mid = left + (right - left) / 2;
			if (nums[mid] < target)
				left = mid + 1;
			else
				right = mid;
		}

		if (right == nums.length || nums[right] != target)
			return result;
		else
			result[0] = right;

		// Find 2nd
		right = nums.length;
		while (left < right) {
			int mid = left + (right - left) / 2;
			if (nums[mid] <= target)
				left = mid + 1;
			else
				right = mid;
		}
		result[1] = right - 1;

		return result;
	}
}