package myleetcode.math.easy;

public class Solution7_ReverseInteger {

	public static void main(String[] args) {
		int result = new Solution7_1().reverse(-12345);
		System.out.println("result => " + result);
	}

}

class Solution7_1 {
	public int reverse(int x) {
		long result = 0;
		
		while(x != 0) {
			result = result * 10 + x % 10;			
			if(result < Integer.MIN_VALUE || result > Integer.MAX_VALUE) {
				return 0;
			}
			x /= 10;
		}
		
		return (int)result;
	}
}