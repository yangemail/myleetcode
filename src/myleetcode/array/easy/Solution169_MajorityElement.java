package myleetcode.array.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * Given an array of size n, find the majority element. The majority element is
 * the element that appears more than ⌊ n/2 ⌋ times.
 * 
 * You may assume that the array is non-empty and the majority element always
 * exist in the array.
 * 
 * Example 1:
 * 
 * Input: [3,2,3] Output: 3
 * 
 * 
 * Example 2:
 * 
 * Input: [2,2,1,1,1,2,2] Output: 2
 * 
 */
public class Solution169_MajorityElement {

	public static void main(String[] args) {

	}

}

class Solution169_1 {
	public int majorityElement(int[] nums) {
		if (nums == null || nums.length == 0)
			return -1;
		Arrays.sort(nums);
		return nums[nums.length / 2];
	}
}

class Solution169_2 {
	public int majorityElement(int[] nums) {
		if (nums == null || nums.length == 0)
			return -1;
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int num: nums) {
			if(!map.containsKey(num)) {
				map.put(num, 0);
			} else {
				map.put(num, map.get(num)+1);
			}
		}
		
		int halfLen = nums.length / 2;
		
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if(entry.getValue() > halfLen) {
				return entry.getKey();
			}
		}
		
		return -1;
	}
}