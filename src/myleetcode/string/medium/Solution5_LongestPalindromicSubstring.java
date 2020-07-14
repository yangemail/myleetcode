package myleetcode.string.medium;

public class Solution5_LongestPalindromicSubstring {

	public static void main(String[] args) {
		String s = "babad";
		String result = new Solution5_1().longestPalindrome(s);
		System.out.println("Result => " + result);
	}

}

// TODO: Need to review
/**
 * 这道题让我们求最长回文子串，首先说下什么是回文串，就是正读反读都一样的字符串，
 * 比如 "bob", "level", "noon" 等等。那么最长回文子串就是在一个字符串中的那个最长的回文子串。
 * LeetCode 中关于回文串的题共有五道，除了这道，
 * 其他的四道为 Palindrome Number，Validate Palindrome，Palindrome Partitioning，Palindrome Partitioning II，
 * 我们知道传统的验证回文串的方法就是两个两个的对称验证是否相等，
 * 那么对于找回文字串的问题，就要以每一个字符为中心，像两边扩散来寻找回文串，
 * 这个算法的时间复杂度是 O(n*n)，可以通过 OJ，就是要注意奇偶情况，
 * 由于回文串的长度可奇可偶，比如 "bob" 是奇数形式的回文，"noon" 就是偶数形式的回文，两种形式的回文都要搜索，
 * 对于奇数形式的，我们就从遍历到的位置为中心，向两边进行扩散，
 * 对于偶数情况，我们就把当前位置和下一个位置当作偶数行回文的最中间两个字符，然后向两边进行搜索，
 * @author bened
 *
 */
class Solution5_1 {
	private int start;
	private int maxLen;

	public String longestPalindrome(String s) {
		if (s == null || s.length() <= 1) {
			return s;
		}

		for (int i = 0; i < s.length() - 1; i++) {
			findMaxLen(s, i, i); // odd middle point i，奇数形式，传中心点
			findMaxLen(s, i, i + 1); // even s(i) == s(i+1)，偶数形式，传相邻的两个字符
		}
		return s.substring(start, start + maxLen);
	}

	public void findMaxLen(String s, int left, int right) {
		while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
			left--;
			right++;
		}
		// Note: i and j has moved apart, 1 extra step after while loop
		if (maxLen < right - left - 1) {
			maxLen = right - left - 1;
			start = left + 1;
		}
	}
}