package myleetcode.math.easy;

public class Solution268_MissingNumber {

	public static void main(String[] args) {
		int[] nums = {3,0,1};
		int outcome = new Solution268_1().missingNumber(nums);
		System.out.println("Outcome => " + outcome);
	}

}

class Solution268_1 {
    public int missingNumber(int[] nums) {
        byte[] buffer = new byte[nums.length+1];
        for(int i = 0; i < nums.length; i++) {
        	buffer[nums[i]] = 1;
        }
        for(int i = 0; i < buffer.length;i++) {
        	if(buffer[i] == 0) {
        		return i;
        	}
        }
        return -1;
    }
}