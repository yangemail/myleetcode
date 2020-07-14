package myleetcode.binarysearch.easy;

public class Solution278_FirstBadVersion {

	public static void main(String[] args) {

	}

}

class Solution278_1 extends VersionControl {
	public int firstBadVersion(int n) {
		int start = 1;
		int end = n;
		while (start + 1 < end) {
			int mid = start + (end - start) / 2;
			if (isBadVersion(mid)) {
				end = mid;
			} else {
				start = mid;
			}
		}
		if (isBadVersion(start)) {
			return start;
		}
		return end;
	}
}

class Solution278_2 extends VersionControl {
	public int firstBadVersion(int n) {
		int left = 1, right = n;
		while (left < right) {
			int mid = left + (right - left) / 2;
			if (isBadVersion(mid))
				right = mid;
			else
				left = mid + 1;
		}
		return left;
	}
}

class VersionControl {
	boolean isBadVersion(int version) {
		return true;
	}
}