package myleetcode.array.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Solution18_4Sum {

	public static void main(String[] args) {
		

	}

}

class Solution18_1 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        if(nums == null || nums.length < 4) {
        	return new LinkedList<List<Integer>>();
        }
        
        Arrays.sort(nums);
        
        Set<List<Integer>> quadruplets = new HashSet<>();
        
        for(int i = 0; i<nums.length; i++) {
        	for(int j = i+1; j<nums.length; j++) {
        		int index1 = j+1;
        		int index2 = nums.length-1;
        		
        		while(index1 < index2) {
        			int current = nums[i] + nums[j] + nums[index1] + nums[index2];
        			if(current < target) {
        				index1++;
        			} else if(current > target) {
        				index2--;
        			} else {
        				List<Integer> quadruplet = new ArrayList<>();
        				quadruplet.add(nums[i]);
        				quadruplet.add(nums[j]);
        				quadruplet.add(nums[index1]);
        				quadruplet.add(nums[index2]);
        				quadruplets.add(quadruplet);
        				index1++;
        				index2--;
        			}
        		}
        	}
        }
        
        return new LinkedList<List<Integer>>(quadruplets);
    }
}
