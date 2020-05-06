package myleetcode.array.easy;

import java.util.HashMap;
import java.util.Map;

public class Solution1_TwoSum {

	public static void main(String[] args) {
		int[] nums = {2, 7, 11, 15};
		int target = 9;
		int[] result = new Solution_1_1().twoSum(nums, target);
		System.out.println("Result = [" + result[0] + "], [" + result[1] + "]");
	}

}

class Solution_1_1 {
    public int[] twoSum(int[] nums, int target) {
    	int[] result = new int[2];
    	if(nums == null || nums.length <=1) 
    		return result;
    	
        Map<Integer /* target - current*/, Integer /* index */> map = new HashMap<>();
        
        // 循环每个数
        for(int i = 0; i < nums.length; i++) {
        	// 取到当前位置的数值
        	int current = nums[i];
        	// 如果当前数值在Map中已经存在（即：已经做过减法的位置）
        	if(map.get(current) != null) {
        		// 返回原纪录减法的的位置，和当前数值的位置
        		return new int[] {map.get(current), i};
        	}
        	
        	// 如果没有存在，将当前数值，减去target,存入map中（key=target-当前值，value=当前值的位置）
        	map.put(target-current, i);
        }
        
        return result;
    }
}