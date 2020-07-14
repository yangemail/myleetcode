package myleetcode.binarysearch.easy;

public class Solution374_GuessNumberHigherOrLower {

	public static void main(String[] args) {
//		int n = 10;
		int n = 10;
		int result = new Solution374_1(6).guessNumber(n);
		System.out.println("Result => " + result);
	}

}

/**
 * We are playing the Guess Game. The game is as follows:
 * 
 * I pick a number from 1 to n. You have to guess which number I picked.
 * 
 * Every time you guess wrong, I'll tell you whether the number is higher or
 * lower.
 * 
 * You call a pre-defined API guess(int num) which returns 3 possible results
 * (-1, 1, or 0):
 * 
 * -1 : My number is lower 1 : My number is higher 0 : Congrats! You got it!
 *
 */
class Solution374_1 extends GuessGame {
	public int guessNum;

	public Solution374_1(int guessNum) {
		this.guessNum = guessNum;
	}

	public int guessNumber(int n) {
		int start = 1;
		int end = n;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			int result = guess(mid);
			if (result == -1) {
				end = mid - 1;
			} else if (result == 1) {
				start = mid + 1;
			} else {
				return mid;
			}
		}

		return -1;
	}

	int guess(int num) {
		if (this.guessNum == num) {
			return 0;
		} else if (num < this.guessNum) {
			return -1;
		} else {
			return 1;
		}
	}
}

abstract class GuessGame {
	abstract int guess(int num);
}

/**
 * 这道题是一道典型的猜价格的问题，根据对方说高了还是低了来缩小范围， 最简单快速的方法就是折半搜索法，原理很简单， 参见代码如下：
 *
 */
class Solution374_2 extends GuessGame {
	public int guessNumber(int n) {
		if (guess(n) == 0)
			return n;

		int left = 1;
		int right = n;
		while (left < right) {
			int mid = left + (right - left) / 2;
			int tmp = guess(mid);
			if (tmp == 0)
				return mid;
			else if (tmp == 1)
				left = mid;
			else
				right = mid;
		}
		return left;
	}

	@Override
	int guess(int num) {
		// TODO Auto-generated method stub
		return 0;
	}
}