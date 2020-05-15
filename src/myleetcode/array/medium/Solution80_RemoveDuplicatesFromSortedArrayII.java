package myleetcode.array.medium;

public class Solution80_RemoveDuplicatesFromSortedArrayII {

	public static void main(String[] args) {

	}

}

class Solution80_1 {
	public int removeDuplicates(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}

		int index = 1;
		for (int i = 2; i < nums.length; i++) {
			if (nums[index] != nums[i] || (nums[index] == nums[i] && nums[index - 1] != nums[i])) {
				nums[++index] = nums[i];
			}
		}

		return index + 1;
	}
}