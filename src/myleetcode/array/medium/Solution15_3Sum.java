package myleetcode.array.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Solution15_3Sum {

	public static void main(String[] args) {

	}

}

class Solution15_1 {
	public List<List<Integer>> threeSum(int[] nums) {
		if(nums == null || nums.length < 3) {
			return new LinkedList<List<Integer>>();
		}
		
		Arrays.sort(nums);
		
		int target = 0;
		Set<List<Integer>> triplets = new HashSet<>();

		for (int i = 0; i < nums.length; i++) {
			int index1 = i + 1; // from i + 1, forward
			int index2 = nums.length - 1; // from length - 1, backward
			
			while(index1 < index2) {
				int current = nums[i] + nums[index1] + nums[index2];
				// start to validate 3 sum
				if(current < target) {
					index1++;
				} else if(current > target) {
					index2--;
				} else {
					List<Integer> triplet = new ArrayList<>();
					triplet.add(nums[i]);
					triplet.add(nums[index1]);
					triplet.add(nums[index2]);
					
					triplets.add(triplet);
					
					index1++;
					index2--;
				}
			}
		}
		
		return new LinkedList<List<Integer>>(triplets);
	}
}