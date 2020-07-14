package myleetcode.binarysearch.easy;

public class Solution367_ValidPerfectSquare {

	public static void main(String[] args) {

	}

}

class Solution {
    public boolean isPerfectSquare(int num) {
        long left = 0;
        long right = num;
        while(left <= right) {
        	long mid = left + (right - left) / 2;
        	long tmp = mid * mid;
        	if(tmp == num)
        		return true;
        	if(tmp < num)
        		left = mid + 1;
        	else
        		right = mid -1;
        }
        return false;
    }
}