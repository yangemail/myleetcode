package test;

public class BinarySearchTest {

	public static int binarySearchDefault(int[] nums, int target) {
		int left = 0;
		int right = nums.length;
		while (left < right) {
			int mid = left + (right - left) / 2;
			if (nums[mid] == target)
				return mid;
			else if (nums[mid] < target)
				left = mid + 1;
			else
				right = mid;
		}
		return -1;
	}

	/**
	 * 第二类： 查找第一个不小于目标值的数，可变形为查找最后一个小于目标值的数
	 * 
	 * @param nums
	 * @param target
	 * @return
	 */
	public static int find(int[] nums, int target) {
		int left = 0;
		int right = nums.length;
		while (left < right) {
			int mid = left + (right - left) / 2;
			if (nums[mid] < target)
				left = mid + 1;
			else
				right = mid;
		}
		return right - 1;
	}

	public static int find2(int[] nums, int target) {
		int left = 0;
		int right = nums.length;
		while (left < right) {
			int mid = left + (right - left) / 2;
			if (nums[mid] < target) {
				left = mid + 1;
			} else {
				right = mid;
			}
		}
		return right;
	}

	public static void main(String[] args) {
		int[] intArr = { 2, 4, 5, 6, 9 };
		int index = binarySearchDefault(intArr, 2);
		System.out.println("Result -> " + index);
		index = binarySearchDefault(intArr, 6);
		System.out.println("Result -> " + index);
		index = binarySearchDefault(intArr, 9);
		System.out.println("Result -> " + index);
		System.out.println("-----------------------");
		int index2 = find2(new int[] { 2, 4, 5, 6, 9 }, 3);
		System.out.println("Result2 -> " + index2);
		index2 = find2(new int[] {0, 1,1,1}, 1);
		System.out.println("Result2 -> " + index2);
	}

}
