package myleetcode.binarysearch.easy;

public class Solution35_SearchInsertPosition {

	public static void main(String[] args) {

	}

}

/**
 * 当然，我们还可以用二分搜索法来优化时间复杂度，而且个人认为这种方法应该是面试官们想要考察的算法吧， 属于博主之前的总结帖 LeetCode Binary
 * Search Summary 二分搜索法小结 中第二类 - 查找不小于目标值的数， 参见代码如下：
 *
 */
class Solution35_1 {
	public int searchInsert(int[] nums, int target) {
		if (nums[nums.length - 1] < target)
			return nums.length;

		int left = 0, right = nums.length;
		while (left < right) {
			int mid = left + (right - left) / 2;
			if (nums[mid] < target)
				left = mid + 1;
			else /* target < nums[mid] */
				right = mid;
		}
		return right;
	}
}

class Solution35_2 {
	public int searchInsert(int[] nums, int target) {
		if (nums == null || nums.length == 0) {
			return 0;
		}

		int start = 0;
		int end = nums.length - 1;
		while (start + 1 < end) {
			int mid = start + (end - start) / 2;
			if (nums[mid] == target) {
				return mid;
			} else if (nums[mid] < target) {
				start = mid;
			} else {
				end = mid;
			}
		}

		if (target <= nums[start]) {
			return start;
		} else if (target <= nums[end]) {
			return end;
		} else {
			return end + 1;
		}
	}
}
