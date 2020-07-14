package myleetcode.string.easy;

public class Solution58_LengthOfLastWord {

	public static void main(String[] args) {
		String s = "Hello World";
		int result = new Solution58_1().lengthOfLastWord(s);
		System.out.println("Result => " + result);
	}

}

class Solution58_1 {
	public int lengthOfLastWord(String s) {
		if (s == null || s.equals("")) {
			return 0;
		}

		int count = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			if(s.charAt(i) == ' ') {
				// count = 0，还在末尾，没有开始
				if(count == 0) {
					continue;
				}
				// count > 0, 已经不在末尾了，遇到空格分隔符停止
				break;
			}
			
			// 不是空格分隔符，增加count
			count++;
		}
		
		return count;
	}
}