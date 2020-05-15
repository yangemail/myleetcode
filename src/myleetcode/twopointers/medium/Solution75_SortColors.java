package myleetcode.twopointers.medium;

import java.util.Arrays;

public class Solution75_SortColors {

	public static void main(String[] args) {
		int[] nums = new int[] { 2, 0, 2, 1, 1, 0 };
		new Solution75_1().sortColors(nums);
		System.out.println(Arrays.toString(nums));
	}

}

/**
 * 题目中还要让只遍历一次数组来求解，那么我需要用双指针来做，分别从原数组的首尾往中心移动。
 * 
 * - 定义red指针指向开头位置，blue指针指向末尾位置。
 * 
 * -
 * 从头开始遍历原数组，如果遇到0，则交换该值和red指针指向的值，并将red指针后移一位。若遇到2，则交换该值和blue指针指向的值，并将blue指针前移一位。若遇到1，则继续遍历。
 *
 */
class Solution75_1 {
	// 0 => red
	// 1 => white
	// 2 => blue
	public void sortColors(int[] nums) {
		int red = 0;
		int blue = nums.length - 1;
		for (int i = 0; i <= blue; i++) {
			if (nums[i] == 0) {
				// swap red
				int tmp = nums[i];
				nums[i] = nums[red];
				nums[red] = tmp;
				red++;
			} else if (nums[i] == 2) {
				// swap blue, i--
				int tmp = nums[i];
				nums[i] = nums[blue];
				nums[blue] = tmp;
				i--;
				blue--;
			}
		}
	}
}

/**
 * 当然我们也可以使用 while 循环的方式来写，那么就需要一个变量 cur 来记录当前遍历到的位置，参见代码如下：
 */
class Solution75_2 {
	// 0 => red
	// 1 => white
	// 2 => blue
	public void sortColors(int[] nums) {
		int red = 0;
		int blue = nums.length - 1;
		int current = 0;

		while (current <= blue) {
			if (nums[current] == 0) {
				// swap red
				int tmp = nums[current];
				nums[current] = nums[red];
				nums[red] = tmp;
				current++;
				red++;
			} else if (nums[current] == 2) {
				// swap blue
				int tmp = nums[current];
				nums[current] = nums[blue];
				nums[blue] = tmp;
				blue--;
			} else {
				current++;
			}
		}
	}

}