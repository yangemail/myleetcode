package myleetcode.array.medium;

import java.util.HashMap;
import java.util.Map;

public class Solution560_SubarraySumEqualsK {

	public static void main(String[] args) {
		int[] nums = { 1, 1, 1 };
		int k = 2;
		int result = new Solution560_1().subarraySum(nums, k);
		System.out.println("Result => " + result);
	}

}

/**
 * TODO: Need to review.
 * #### Method1: Hash Table to sture presum (like in 2 sum problem)
- Approach#4 of https://leetcode.com/problems/subarray-sum-equals-k/solution/
- Hash Table two sum ˼��, but to save frequency of current sum: `preSumCount<sum, count>`
    - for loop ����ʼ���� `preSumCount<sum, count>`
    - derive `priorSum = sum - k`: ����ǰ���ж��ٴ���sum, `preSumCount.get(priorSum)`
        - `# ways to reach priorSum` gives # of ways for that `priorSum + k = curr Sum`
        - therefore, count += preSumCount.get(priorSum)
- O(n) time, O(n) space
- Note: �����Ҫʵ��index, ���Դ� `Map<Integer, List<Index>>`
 *
 */
class Solution560_1 {
	public int subarraySum(int[] nums, int k) {
		if (nums == null || nums.length == 0)
			return 0;

		Map<Integer /* sum */, Integer /* count */> preSumCount = new HashMap<>();
		int sum = 0;
		int count = 0;

		preSumCount.put(0, 1);
		for (int num : nums) {
			sum += num;
			int priorSum = sum - k;

			if (preSumCount.containsKey(priorSum)) {
				count += preSumCount.get(priorSum);
			}

			preSumCount.put(sum, preSumCount.getOrDefault(sum, 0) + 1);
		}

		return count;
	}
}
