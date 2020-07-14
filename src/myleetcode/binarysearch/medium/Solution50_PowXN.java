package myleetcode.binarysearch.medium;

public class Solution50_PowXN {

	public static void main(String[] args) {

	}

}

/**
 * 这道题让我们求x的n次方，如果只是简单的用个 for 循环让x乘以自己n次的话，未免也把 LeetCode 上的题想的太简单了。
 * 一句话形容图样图森破啊。OJ 因超时无法通过。
 * 所以需要优化，使其在更有效的算出结果来们可以用递归来折半计算，每次把n缩小一半，这样n最终会缩小到0，任何数的0次方都为1， 这时候再往回乘，
 * 如果此时n是偶数，直接把上次递归得到的值算个平方返回即可， 如果是奇数，则还需要乘上个x的值。
 * 还有一点需要引起注意的是n有可能为负数，对于n是负数的情况，我可以先用其绝对值计算出一个结果再取其倒数即可. 之前是可以的，但是现在 test
 * case中加了个负2的31次方后，这就不行了，因为其绝对值超过了整型最大值，会有溢出错误，
 * 不过可以用另一种写法只用一个函数，在每次递归中处理n的正负，然后做相应的变换即可，
 * 
 * 代码如下：
 *
 */
class Solution50_1 {
	public double myPow(double x, int n) {
		if (n == 0)
			return 1;
		double half = myPow(x, n / 2);
		if (n % 2 == 0)
			return half * half;
		if (n > 0)
			return half * half * x;
		return half * half / x;
	}
}