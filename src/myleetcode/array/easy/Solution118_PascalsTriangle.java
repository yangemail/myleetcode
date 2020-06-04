package myleetcode.array.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution118_PascalsTriangle {

	public static void main(String[] args) {
		List<List<Integer>> result = new Solution118_1().generate(3);
		System.out.println(result);
	}

}

class Solution118_1 {
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> result = new ArrayList<>();
		if (numRows == 0)
			return result;

		// Adding data for the 1st row.
		result.add(Arrays.asList(1));

		// Adding data for the 2nd row and more.
		for (int i = 1; i < numRows; i++) {
			ArrayList<Integer> tmp = new ArrayList<>();

			// Place holder
			for (int j = 0; j <= i; j++) {
				tmp.add(Integer.MIN_VALUE);
			}

			// Retrieve the previous data
			List<Integer> pre = result.get(i - 1);
			// Set the first index data
			tmp.set(0, 1);
			// Set other data
			for (int j = 1; j < i; j++) {
				// 下一行的数据,等于上一行的前一个数据和当前位置数据相加
				tmp.set(j, pre.get(j - 1) + pre.get(j));
			}
			// Set the last index data
			tmp.set(tmp.size() - 1, 1);

			result.add(tmp);
		}

		return result;
	}
}