package myleetcode.math.easy;

public class Solution292_NimGame {

	public static void main(String[] args) {

	}

}

/**
 * Input: 4 Output: false Explanation: If there are 4 stones in the heap, then
 * you will never win the game; No matter 1, 2, or 3 stones you remove, the last
 * stone will always be removed by your friend.
 * 
 * 算法为除去肯定会输的那个 n % 4 != 0;
 * 
 * n = 4
 * 你取走1，对手取走3，对手赢
 * 你取走2，对手取走2，对手赢
 * 你取走3，对手取走1，对手赢
 * 所以，n=4，是一种必输的策略。
 * 
 * 如果n存在一种方式，一步达到必输的状态：
 * 存在x,f[n-x]=必输，其中1 <= x <= 3，那么f[n]则是必胜
 * 不存在这种X就是必输状态，就是怎么走别人都必胜。
 * 初始状态
 * f[0]=必输 f[1]f[2]f[3]=必胜
 * f[4]=必输 f[5]f[6]f[7]=必胜
 *
 */
class Solution292_1 {
	public boolean canWinNim(int n) {
		return n % 4 != 0;
	}
}