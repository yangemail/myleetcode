package myleetcode.dp.easy;

public class Solution70_ClimbingStairs {

	public static void main(String[] args) {

	}

}

/**
 * E tags: DP, Memoization, Sequence DP
 * 
 * 每一步可以走1步或者2步, 求总共多少种方法爬完梯子.
 * 
 * #### DP - 加法原理, 最后一步被前两种走法决定: dp[i] = dp[i - 1] + dp[i - 2] - 基础sequence DP,
 * int[] dp = int[n + 1]; - DP[]存的是以 1-based index的状态 - dp[i]: count # of ways
 * to finish 前i个 台阶 - 需要知道dp[n] 的状态, 但是最大坐标是[n-1], 所以int[n+1] - dp[0]往往是有特殊状态的.
 * 这里, dp[0]: 1种方式可以原地不动 - dp[1]=1, 1种方式到达index=1, - 之后的`dp[2] = dp[0]+dp[1]`:
 * 就是dp[0]的走法 or dp[1]的走法 - O(n) space, time
 * 
 * Thoughts: DP, consider the last step. It can be reached by 2 steps or 1
 * steps. DP[i] represents # ways to reach index i. DP[i] = DP[i - 1] + DP[i -
 * 2].
 * 
 * Create DP = int [n + 1] init: DP[0] = 1; DP[1] = 1;
 * 
 * Return DP[n]
 *
 */
class Solution70_1 {
	public int climbStairs(int n) {
		if (n <= 1)
			return 1;

		int[] dp = new int[n + 1];
		dp[0] = 1;
		dp[1] = 1;
		for(int i = 2; i <= n; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}
		
		return dp[n];
	}
}