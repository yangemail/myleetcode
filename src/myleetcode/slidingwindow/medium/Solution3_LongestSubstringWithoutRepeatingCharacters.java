package myleetcode.slidingwindow.medium;

import java.util.HashSet;
import java.util.Set;

public class Solution3_LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
//		String s = "abcabcbb";
//		String s = "bbbbb";
//		String s= "pwwkew";
//		String s = "au";
//		String s = "aab";
		String s = "dvdf";
		int result = new Solution3_2().lengthOfLongestSubstring(s);
		System.out.println("Result => " + result);
	}

}

class Solution3_2 {
	public int lengthOfLongestSubstring(String s) {
		int count = 0;
		Set<Character> set = new HashSet<>();
		int start = 0;
		int end = 0;
		
		while(start < s.length() && end < s.length()) {
			if(set.contains(s.charAt(end))) {
				count = Math.max(count, end - start);
				set.remove(s.charAt(start));
				start++;
			} else {
				set.add(s.charAt(end));
				end++;
			}
		}
		
		return Math.max(count, end - start);
	}

}