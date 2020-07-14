package myleetcode.array.easy;

public class Solution66_PlusOne {

	public static void main(String[] args) {

	}

}

class Solution66_1 {
    public int[] plusOne(int[] digits) {
        if(digits.length == 0)
        	return digits;
        
        int carry = 1;
        int len = digits.length;
        for(int i = digits.length - 1; i >= 0; i--) {
        	if(carry == 0) /* 不需要进位了，退出 */
        		return digits;
        	
        	int sum = digits[i] + carry;
        	digits[i] = sum % 10;
        	carry = sum / 10;
        }
        
        if(carry > 0) {
        	int[] result = new int[len + 1];
        	result[0] = 1;
        	System.arraycopy(digits, 0, result, 1, digits.length);
        	return result;
        }
        
        return digits;
    }
}
