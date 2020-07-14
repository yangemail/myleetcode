package myleetcode.array.easy;

public class Solution121_BestTimeToBuyAndSellStock {

	public static void main(String[] args) {

	}

}

/**
 * 这道题相当简单，感觉达不到Medium的难度，
 * 
 * 只需要遍历一次数组， 用一个变量记录遍历过数中的最小值， 然后每次计算当前值和这个最小值之间的差值最为利润， 然后每次选较大的利润来更新。
 * 
 * 当遍历完成后当前利润即为所求，
 * 
 * 代码如下：
 */
class Solution121_1 {
	public int maxProfit(int[] prices) {
		int result = 0;
		int buy = Integer.MAX_VALUE;
		for (int price : prices) {
			buy = Math.min(buy, price);
			result = Math.max(result, price - buy);
		}
		return result;
	}
}

class Solution121 {
	public int maxProfie(int[] prices) {
		int result = 0;
		int buy = Integer.MAX_VALUE;
		for (int price : prices) {
			buy = Math.min(buy, price);
			result = Math.max(result, price - buy);
		}
		return result;
	}
}