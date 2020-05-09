package myleetcode.bit.easy;

public class Solution371_SumOfTwoIntegers {

	public static void main(String[] args) {

	}

}


class Solution371_1 {
	public int getSum(int a, int b) {
		if (b == 0)
			return a;
		int sum = a ^ b;
		// 最大整数用二进制可以表示为0111 1111 1111 1111 1111 1111 1111 1111
		// 将其改为16进制就 0x 7fffffff
		int carry = (a & b & 0x7fffffff) << 1;
		return getSum(sum, carry);
	}
}

// TODO: Need to review
class Solution371_2 {
	public int getSum(int a, int b) {
		while(b != 0) {
			int c = a ^ b;
			b = (a & b) << 1;
			a = c;
		}
		return a;
	}
}