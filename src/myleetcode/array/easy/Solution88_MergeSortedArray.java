package myleetcode.array.easy;

public class Solution88_MergeSortedArray {

	public static void main(String[] args) {

	}

}

class Solution88_1 {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		if (nums1 == null || nums1.length == 0 || nums2 == null || nums2.length == 0) {
			return;
		}
		int end = m + n - 1;
		m--;
		n--;
		for (int i = end; i >= 0; i--) {
			if (m >= 0 && n >= 0) {
				if (nums1[m] >= nums2[n]) {
					nums1[i] = nums1[m];
					m--;
				} else {
					nums1[i] = nums2[n];
					n--;
				}
			} else {
				if (m >= 0) {
					nums1[i] = nums1[m];
					m--;
				} else {
					nums1[i] = nums2[n];
					n--;
				}
			}
		}
	}
}

class Solution88_2 {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int i = m - 1;
		int j = n - 1;
		int index = m + n - 1;

		while (i >= 0 && j >= 0) {
			if (nums1[i] > nums2[j]) {
				nums1[index--] = nums1[i--];
			} else {
				nums1[index--] = nums2[j--];
			}
		}

		while (i >= 0) {
			nums1[index--] = nums1[i--];
		}

		while (j >= 0) {
			nums1[index--] = nums2[j--];
		}
	}
}

class Solution88_3 {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int index = m + n - 1;
		while (m > 0 && n > 0) {
			if (nums1[m - 1] > nums2[n - 1]) {
				nums1[index--] = nums1[--m];
			} else {
				nums1[index--] = nums2[--n];
			}
		}

		while (n > 0) {
			nums1[index--] = nums2[--n];
		}
	}
}