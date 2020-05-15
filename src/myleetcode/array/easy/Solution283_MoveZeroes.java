package myleetcode.array.easy;

public class Solution283_MoveZeroes {

	public static void main(String[] args) {

	}

}

class Solution283_1 {
	public void moveZeroes(int[] nums) {
		int index = 0;
		// 将非0数字向前排
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] != 0) {
				nums[index++] = nums[i];
			}
		}
		//将剩余的位置都至为0
		for(;index < nums.length; index++) {
			nums[index] = 0;
		}
	}
}