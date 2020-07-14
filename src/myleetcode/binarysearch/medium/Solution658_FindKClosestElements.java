package myleetcode.binarysearch.medium;

import java.util.ArrayList;
import java.util.List;

public class Solution658_FindKClosestElements {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int k = 4;
		int x = 3;
		List<Integer> result = new Solution658_1().findClosestElements(arr, k, x);
		System.out.println("Result => ");
		for (Integer i : result) {
			System.out.print(i + ", ");
		}
	}

}

/**
 * 这道题给我们了一个数组，还有两个变量k和x。 让找数组中离x最近的k个元素，而且说明了数组是有序的，如果两个数字距离x相等的话，取较小的那个。
 * 从给定的例子可以分析出x不一定是数组中的数字，由于数组是有序的，所以最后返回的k个元素也一定是有序的， 那么其实就是返回了原数组的一个长度为k的子数组，
 * 转化一下，实际上相当于在长度为n的数组中去掉 n-k 个数字， 而且去掉的顺序肯定是从两头开始去，因为距离x最远的数字肯定在首尾出现。
 * 那么问题就变的明朗了，每次比较首尾两个数字跟x的距离，将距离大的那个数字删除，直到剩余的数组长度为k为止，
 * 
 * 参见代码如下：
 *
 */
class Solution658_1 {
	public List<Integer> findClosestElements(int[] arr, int k, int x) {
		List<Integer> result = new ArrayList<>();
		for (Integer i : arr) {
			result.add(i);
		}

		// 实际上相当于在长度为n的数组中去掉 n-k 个数字， 而且去掉的顺序肯定是从两头开始去，
		// 因为距离x最远的数字肯定在首尾出现。
		// 每次比较首尾两个数字跟x的距离，将距离大的那个数字删除，直到剩余的数组长度为k为止
		while (result.size() > k) {
			int front = result.get(0);
			int back = result.get(result.size() - 1);
			if (x - front <= back - x) {
				result.remove(result.size() - 1);
			} else {
				result.remove(0);
			}
		}
		return result;
	}
}
