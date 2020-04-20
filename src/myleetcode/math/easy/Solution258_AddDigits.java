package myleetcode.math.easy;

public class Solution258_AddDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = new Solution258_2().addDigits(38);
		System.out.println("Result => " + result);
	}

}

/**
 * 解释： Ab = a*10 +b ab%9 = (a*9+a+b)%9 = (a+b)%9; Abc=a*100+b*10+c; Abc%9 =
 * (a*99 + b*9 + a + b + c)%9 = (a+b+c)%9; 例子： 38%9 = 2; 11%9 = 2; [0…8]
 * 除了0以外，需要一个1-9 之间的数字。除了输入时0以外的情况，是不可能出现是0的。
 * 
 * @author bened
 *
 */
class Solution258_1 {
	public int addDigits(int num) {
		if (num == 0) {
			return 0;
		}
		return (num - 1) % 9 + 1;
	}
}

class Solution258_2 {
	public int addDigits(int num) {
		while (num / 10 > 0) {
			int sum = 0;
			
			while (num > 0) {
				sum += num % 10;
				num /= 10;
			}
			
			num = sum;
		}

		return num;
	}
}