package myleetcode.string.easy;

public class Solution28_ImplementStrStr {

	public static void main(String[] args) {

	}

}

class Solution28_1 {
	public int strStr(String haystack, String needle) {
		if (needle == null || needle.length() == 0) {
			return 0;
		}
		if (haystack == null || haystack.length() == 0 || needle.length() > haystack.length()) {
			return -1;
		}

		for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
			int j = 0;
			
			while(j < needle.length() && haystack.charAt(i+j) == needle.charAt(j)) {
				j++;
			}
			
			if(j == needle.length()) {
				return i;
			}
		}
		
		return -1;
	}
}

