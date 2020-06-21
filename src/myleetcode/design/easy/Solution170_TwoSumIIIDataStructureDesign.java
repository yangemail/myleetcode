package myleetcode.design.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Design and implement a TwoSum class. It should support the following
 * operations: add and find.
 * 
 * add - Add the number to an internal data structure. find - Find if there
 * exists any pair of numbers which sum is equal to the value.
 * 
 * Example 1:
 * 
 * add(1); add(3); add(5); find(4) -> true find(7) -> false Example 2:
 * 
 * add(3); add(1); add(2); find(3) -> true find(6) -> false
 */
public class Solution170_TwoSumIIIDataStructureDesign {

	public static void main(String[] args) {

	}

}

/**
 * - Use Map<number, count > to store the inputs - Iterate over map to find the
 * pair - Use Set<int> memo to store the success cases for fast return
 */
class TwoSum {
	private Map<Integer, Integer> map = new HashMap<>();
	Set<Integer> memo = new HashSet<>();

	public TwoSum() {
	}

	public void add(int number) {
		map.putIfAbsent(number, 0);
		map.put(number, map.get(number) + 1);
	}

	public boolean find(int value) {
		if (memo.contains(value))
			return true;
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			int num = entry.getKey();
			int count = entry.getValue();
			int remain = value - num;
			if (map.containsKey(remain)) {
				if (remain == num && count < 2)
					continue;
				memo.add(value);
				return true;
			}
		}
		return false;
	}
}