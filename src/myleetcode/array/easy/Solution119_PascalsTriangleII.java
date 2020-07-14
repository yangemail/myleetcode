package myleetcode.array.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution119_PascalsTriangleII {

	public static void main(String[] args) {

	}

}

class Solution119_1 {
	public List<Integer> getRow(int rowIndex) {
		List<List<Integer>> result = new ArrayList<>();

		// Because index from 0
		rowIndex += 1;

		result.add(Arrays.asList(1));

		for (int i = 1; i < rowIndex; i++) {
			List<Integer> tmp = new ArrayList<>();

			for (int j = 0; j <= i; j++) {
				tmp.add(Integer.MIN_VALUE);
			}

			List<Integer> pre = result.get(i - 1);
			tmp.set(0, 1);
			for (int j = 1; j < i; j++) {
				tmp.set(j, pre.get(j - 1) + pre.get(j));
			}
			tmp.set(tmp.size() - 1, 1);

			result.add(tmp);
		}

		return result.get(result.size() - 1);
	}
}