package myleetcode.binarysearch.easy;

/**
 * 35. Search Insert Position Given a sorted array and a target value, return
 * the index if the target is found. If not, return the index where it would be
 * if it were inserted in order. You may assume no duplicates in the array.
 *
 */
public class Solution35_SearchInsertPosition {

	public static void main(String[] args) {
		Solution35_2 obj = new Solution35_2();
		int[] nums = new int[] { 1, 3, 5, 6 };
		int result = obj.searchInsert(nums, 5);
		System.out.println("Result -> " + result);
		result = obj.searchInsert(nums, 2);
		System.out.println("Result -> " + result);
		result = obj.searchInsert(nums, 7);
		System.out.println("Result -> " + result);
		result = obj.searchInsert(nums, 0);
		System.out.println("Result -> " + result);
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
		if (nums == null || nums.length == 0)
			return -1;
		int left = 0, right = nums.length;
		while (left < right) {
			int mid = left + (right - left) / 2;
			if (nums[mid] < target) {
				left = mid + 1;
			} else {
				right = mid;
			}
		}
		return right;
	}
}