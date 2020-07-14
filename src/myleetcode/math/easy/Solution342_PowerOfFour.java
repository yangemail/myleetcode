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
 * 16��4��Power -> 0001 0000, 15��: 0000 1111
 * 16 & 15 -> 0000 0000�����Կ�����2��Power
 * 
 * 0x55555555 = 1010101010101010101 0101 0101 0101 (ż��λΪ0������λΪ1��
 * For exampel:
 * 1 -> 0001 ����
 * 2 -> 0010 ����
 * 4 -> 0100 ��ȷ
 * 8 -> 1000 ����
 * 16 -> 0001 0000 ��ȷ
 * 32 -> 0010 0000 ����
 * 64 -> 0100 0000 ��ȷ
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