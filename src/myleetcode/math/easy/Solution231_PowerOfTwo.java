package myleetcode.math.easy;

public class Solution231_PowerOfTwo {

	public static void main(String[] args) {
		

	}

}

/**
 * �ⷨ:
 * �Ƚ������ˣ�������õ���һ�����Ķ���������ֻ��1��1������λ��Ϊ0������ʡ�
 * ����һ����x��x-1������λ������λ���Ϊ0��
 * ����x=8ʱ��Ϊ100����&011�����Ϊ��000 ���ֻ��1�д��롣
 */
class Solution231_1 {
	public boolean isPowerOfTwo(int n) {
		if (n <= 0) {
			return false;
		}

		return (n & (n - 1)) == 0;
	}
}
