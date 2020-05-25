package myleetcode.array.easy;

public class Solution53_MaximumSubarray {

	public static void main(String[] args) {

	}

}

/**
 * 这道题让求最大子数组之和，并且要用两种方法来解， 分别是 O(n) 的解法， 还有用分治法 Divide and Conquer
 * Approach，这个解法的时间复杂度是 O(nlgn)，
 * 
 * 那就先来看 O(n) 的解法，定义两个变量 res 和 curSum， 其中 res 保存最终要返回的结果，即最大的子数组之和， curSum
 * 初始值为0，
 * 
 * 每遍历一个数字 num，比较 curSum + num 和 num 中的较大值存入 curSum， 然后再把 res 和 curSum 中的较大值存入
 * res， 以此类推直到遍历完整个数组，可得到最大子数组的值存在 res 中，
 * 
 * 代码如下：
 *
 */

class Solution53_1 {
	public int maxSubArray(int[] nums) {
		int result = Integer.MIN_VALUE;
		int curSum = 0;
		for (int num : nums) {
			curSum = Math.max(num, curSum + num);
			result = Math.max(result, curSum);
		}
		return result;
	}
}
