package myleetcode.dp.easy;

public class Solution198_HouseRobber {

	public static void main(String[] args) {

	}

}

/**
 * - dp[i]: 前i个房子拿到的max gain
	- 看最后结尾状态的前一个或前两个的情况，再综合考虑当下的
	- 搞清楚当下[i]的和之前[i-x]的情况的关系: 不可以连着house, 那么就直接考虑 dp[i-2]的情况
	- Sequence DP, new dp[n + 1];
	- Rolling Array
    - [i]'只和前两个位子 [i-1], [i - 2]'相关
    - 用%2来标记 [i], [i - 1], [i - 2]三个位置.
    - 其他滚动时惯用curr/prev来表示坐标, 这里%2虽然抽象, 但是更加实用.
 */
class Solution198_1 {
    public int rob(int[] nums) {
        if(nums == null || nums.length == 0)
        	return 0;
        
        int len = nums.length;
        long[] dp = new long[len + 1];
        dp[0] = 0;
        dp[1] = nums[0];
        for(int i = 2; i <= len; i++) {
        	dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i-1]);
        }
        return (int)dp[len];
    }
}

/**
Method2: Status DP
- dp[i] depends on nums[i-1] or nums[i-2] based on the state at (i-1)
    - use dp[n][2] to store dp[i] and stages
    - dp[0][0] = 0; dp[0][1] = nums[0]
- dp[i][0] = max of (dp[i - 1][1], dp[i - 1][0])
- dp[i][1] = dp[i - 1][0] + nums[i]
*/
class Solution198_2 {
    public int rob(int[] nums) {
    	if (nums == null || nums.length == 0) 
    		return 0;
    	
        int n = nums.length;
        int[][] dp = new int[n][2];
        dp[0][1] = nums[0];
        for (int i = 1; i < n; i++) {
            dp[i][0] = Math.max(dp[i - 1][1], dp[i - 1][0]);
            dp[i][1] = dp[i - 1][0] + nums[i];
        }
        
        return Math.max(dp[n - 1][0], dp[n - 1][1]);
    }
}

class Solution198_3 {
	public int rob(int[] nums) {
	    int len = nums.length;
	    int[] result = new int[len];
	
	    if (len == 0) {
	        return 0;
	    }
	    if (len == 1) {
	        return nums[0];
	    }
	
	    result[0] = nums[0];
	    result[1] = Math.max(nums[0], nums[1]);
	
	    for(int i = 2; i < len; i++) {
	        result[i] = Math.max(result[i - 1], (result[i - 2] + nums[i]));
	    }
	
	    return result[len - 1];
	}
}