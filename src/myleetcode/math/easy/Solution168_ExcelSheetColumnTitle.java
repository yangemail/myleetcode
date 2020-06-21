package myleetcode.math.easy;

public class Solution168_ExcelSheetColumnTitle {

	public static void main(String[] args) {
		String result = new Solution168_1().convertToTitle(52);
		System.out.println("Result => " + result);
	}

}

/**
 * #### 基本换算 - 26位, 像10位一样去思考 - 从末尾开始, mod %26 可以拿到 末尾数字 remain = n % 26 - 特殊:
 * remain = 0 的时候, 也就是说n是26的倍数, 末尾应该是 'Z' - 记录'Z'了之后, n--
 */
class Solution168_1 {
	public String convertToTitle(int n) {
		if (n <= 0) {
			return null;
		}

		StringBuilder sb = new StringBuilder();
		while (n > 0) {
			int remain = n % 26;
			n = n / 26;
			if (remain == 0) {
				sb.append("Z");
				n--;
			} else {
				sb.append((char) ('A' + remain - 1));
			}
		}
		
		return sb.reverse().toString();
	}
}