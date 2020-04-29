package myleetcode.dichotomy.hard;

public class Solution410_SplitArrayLargestSum {

	public static void main(String[] args) {
		int outcome = new Solution_410_1().splitArray(new int[] {1,2147483646}, 1);
		System.out.println("Outcome => " + outcome);
	}

}

class Solution_410_1 {
	public boolean guess(long mid, int[] nums, int m) {
		long sum = 0;
		for(int i = 0; i < nums.length; i++) {
			if(sum + nums[i] > mid) {
				m--;
				
				sum = nums[i];
				if(nums[i] > mid) {
					return false;
				}
			} else {
				sum += nums[i];
			}
		}
		return m >= 1;
	}
	
    public int splitArray(int[] nums, int m) {
        long start = 0;
        long end = 1;
        for(int i = 0; i < nums.length; i++) {
        	end += nums[i];
        }
        long answer = 0;
        
        while(start < end) {
        	long mid = (start + end)/2;
        	if(guess(mid, nums, m)) {
        		answer = mid;
        		end = mid;
        	} else {
        		start = mid + 1;
        	}
        }
        
        return (int)answer;
    }
}