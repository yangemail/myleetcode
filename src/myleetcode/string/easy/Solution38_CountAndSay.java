package myleetcode.string.easy;

public class Solution38_CountAndSay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

/**
 * 这道计数和读法问题还是第一次遇到，看似挺复杂，其实仔细一看，算法很简单， 就是对于前一个数，找出相同元素的个数，把个数和该元素存到新的 string 里。
 * 代码如下：
 *
 */
class Solution38_1 {
	public String countAndSay(int n) {
		if (n <= 0)
			return "";
		String result = "1";
		while (--n > 0) {
			String current = "";
			for (int i = 0; i < result.length(); i++) {
				int count = 1;
				while (i + 1 < result.length() && result.charAt(i) == result.charAt(i + 1)) {
					++count;
					++i;
				}
				current += String.valueOf(count) + result.charAt(i);
			}
			result = current;
		}
		return result;
	}
}

/**
 * 首先这道题非常的蛋疼，光翻译题目是看不懂的……其实这道题的要求是这样，先设置一个字符串str：
 * 
 * 当n=1,str="1"
 * 
 * 当n=2,因为当n=1时，str="1"，里面有一个“1”，所以此时的str="11"
 * 
 * 当n=3,因为当n=2时，str="11"，里面有两个“1”，所以此时的str="21"
 * 
 * 当n=4,因为当n=3时，str="21"，里面有一个"2"，一个“1”，所以此时的str="1211"
 * 
 * 当n=5,因为当n=4时，str="1211"，里面是：先一个"1"，再一个"2"，最后两个“1”，所以此时的str="111221"
 * 
 * 也就是说，取值为n的字符串是根据取值n-1的字符串来考虑的……
 */
class Solution38_2 {
	public String countAndSay(int n) {
		String oldString = "1";

		// 第一层循环 -- 层数
		while (--n > 0) {
			StringBuilder sb = new StringBuilder();
			char[] oldChars = oldString.toCharArray();

			// 第二层循环 -- 上一行的值
			for (int i = 0; i < oldChars.length; i++) {
				// 默认 count 为一次
				int count = 1;

				// 第三层循环 -- 找到重复数字的出现频率
				for (int j = i; j + 1 < oldChars.length && oldChars[j] == oldChars[j + 1]; j++) {
					// 如果当前位置的数字和下一个一样,则count++, i++
					count++;
					i++;
				}

				// 将出现次数和数字放入buffer
				sb.append("" + count + oldChars[i]);
			}

			// 将结果赋值给 oldString
			oldString = sb.toString();
		}

		return oldString;
	}
}