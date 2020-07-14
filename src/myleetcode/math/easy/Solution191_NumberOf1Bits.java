package myleetcode.math.easy;

public class Solution191_NumberOf1Bits {

	public static void main(String[] args) {
		System.out.println("Result => " + new Solution191_1().hammingWeight(31));
	}

}

/**
 * int n = 7 -> 0000 0111 n-1 -> 6 -> 0000 0110 n = n & (n-1) -> 0000 0110,
 * count++ -> 1
 * 
 * n = 6, (n - 1) = 5, 0000 0110 & 0000 0101 -> 0000 0100 -> 4, count++ -> 2
 * 
 * n = 4, (n-1) = 3, 0000 0100 & 0000 0011, count++ -> 3 end loop
 * 
 */
class Solution191_1 {
	// you need to treat n as an unsigned value
	public int hammingWeight(int n) {
		if(n == 0) {
			return 0;
		}
		
		int count = 1;

		while ((n & (n-1)) != 0) {
			n = n & (n - 1);
			count++;
		}

		return count;
	}
}
