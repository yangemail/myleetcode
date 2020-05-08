package myleetcode.math.easy;

public class Solution231_PowerOfTwo {

	public static void main(String[] args) {
		

	}

}

/**
 * 解法:
 * 比较奇妙了，充分利用到了一个数的二进制数中只有1个1，其余位都为0这个性质。
 * 就是一个数x和x-1的所有位，做按位与会为0。
 * 比如x=8时，为100，与&011，结果为：000 最后只有1行代码。
 */
class Solution231_1 {
	public boolean isPowerOfTwo(int n) {
		if (n <= 0) {
			return false;
		}

		return (n & (n - 1)) == 0;
	}
}
