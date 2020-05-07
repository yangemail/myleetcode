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
		// 使用Set为了结果去重，一定注意！！
		Set<List<Integer>> triplets = new HashSet<>();

		int length = nums.length;
		for (int i = 0; i < length; i++) {
			int index1 = i + 1; // from i + 1, forward
			int index2 = length - 1; // from length - 1, backward
			
			while(index1 < index2) {
				int twoSum = nums[i] + nums[index1];
				// start to validate 3 sum
				if(twoSum + nums[index2] < 0) {
					index1++;
				} else if(twoSum + nums[index2] > 0) {
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