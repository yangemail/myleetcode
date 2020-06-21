package myleetcode.bit.easy;

public class Solution136_SingleNumber {

	public static void main(String[] args) {

	}

}

class Solution136_1 {
	public int singleNumber(int[] nums) {
		if (nums == null || nums.length == 0)
			return 0;
		int result = 0;
		for (int num : nums) {
			result ^= num;
		}
		return result;
	}
}