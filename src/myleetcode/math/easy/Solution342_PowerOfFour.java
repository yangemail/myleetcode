package myleetcode.math.easy;

public class Solution342_PowerOfFour {

	public static void main(String[] args) {

	}

}

class Solution342_1 {
    public boolean isPowerOfFour(int num) {
    	if(num <= 0) {
    		return false;
    	}
    	
    	while(num%4 == 0) {
    		num /= 4;
    	}
    	
    	return num == 1;
    }
}

/** 
 * 16是4的Power -> 0001 0000, 15是: 0000 1111
 * 16 & 15 -> 0000 0000，所以可以是2的Power
 * 
 * 0x55555555 = 1010101010101010101 0101 0101 0101 (偶数位为0，奇数位为1）
 * For exampel:
 * 1 -> 0001 错误
 * 2 -> 0010 错误
 * 4 -> 0100 正确
 * 8 -> 1000 错误
 * 16 -> 0001 0000 正确
 * 32 -> 0010 0000 错误
 * 64 -> 0100 0000 正确
 * 
 */
class Solution342_2 {
	public boolean isPowerOfFour(int num) {
		if(num <= 0) {
			return false;
		}
		
		return ((num & (num-1)) == 0) && (num & 0x55555555) > 0;
	}
}