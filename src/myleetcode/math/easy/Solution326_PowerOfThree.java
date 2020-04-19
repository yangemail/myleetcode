package myleetcode.math.easy;

public class Solution326_PowerOfThree {

	public static void main(String[] args) {
		
	}

}

class Solution326_1 {
	
    public boolean isPowerOfThree(int n) {
    	if(n< 1) {
    		return false;
    	}
    	
    	// Verify if n can be divided by 3 and return mod to 0
    	while(n % 3 == 0) {
    		// Set value to n if n still can be divided by 3
    		n /= 3;
    	}
    	
    	return n == 1;
    }

}