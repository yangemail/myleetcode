package myleetcode.binarysearch.easy;

public class Solution69_SqrtX {

	public static void main(String[] args) {
		int outcome = new Solution_69_1().mySqrt(4);
		System.out.println("outcome => " + outcome);
	}

}

class Solution_69_1 {
	public int mySqrt(int x) {
		long start = 0;
		long end = (long) x + 1;
		long answer = 0;
		
		while (start < end) {
			long mid = (start + end) / 2;
			if (mid * mid <= x) {
				answer = mid;
				start = mid + 1;
			} else {
				end = mid;
			}
		}
		
		return (int) answer;
	}
}