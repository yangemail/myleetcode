package myleetcode.array.easy;

import java.util.HashMap;
import java.util.Map;

public class Solution167_TwoSum2InputArrayIsSorted {

	public static void main(String[] args) {
//		int[] numbers = {2,7,11,15}; 
//		int target = 9;
		
		int[] numbers = {-1, 0}; 
		int target = -1;
		
		int[] result = new Solution167_1().twoSum(numbers, target);
		System.out.println("Result => " + result[0] + ", " + result[1]);
	}

}

class Solution167_1 {
    public int[] twoSum(int[] numbers, int target) {
    	int[] result = new int[2];
        
    	if(numbers == null || numbers.length <= 1) {
        	return result;
        }
        
    	Map<Integer /* value -> after minus */, Integer /* index */> map = new HashMap<>();
        for(int i = 0; i < numbers.length; i++) {
        	int current = numbers[i];
        	
        	// 注意：target可以是负数
        	// int[] numbers = {-1, 0}; int target = -1;
        	if(target <= 0 || current <= target) {
        		if(map.get(current) != null) {
        			return new int[] {map.get(current) + 1, i + 1};
        		}
        		map.put(target-current, i);
        	} else {
        		return result;
        	}
        }
        
        return result;
    }
}
