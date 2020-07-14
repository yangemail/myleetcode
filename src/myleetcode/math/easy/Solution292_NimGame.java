package myleetcode.math.easy;

public class Solution292_NimGame {

	public static void main(String[] args) {

	}

}

/**
 * Input: 4 Output: false Explanation: If there are 4 stones in the heap, then
 * you will never win the game; No matter 1, 2, or 3 stones you remove, the last
 * stone will always be removed by your friend.
 * 
 * �㷨Ϊ��ȥ�϶�������Ǹ� n % 4 != 0;
 * 
 * n = 4
 * ��ȡ��1������ȡ��3������Ӯ
 * ��ȡ��2������ȡ��2������Ӯ
 * ��ȡ��3������ȡ��1������Ӯ
 * ���ԣ�n=4����һ�ֱ���Ĳ��ԡ�
 * 
 * ���n����һ�ַ�ʽ��һ���ﵽ�����״̬��
 * ����x,f[n-x]=���䣬����1 <= x <= 3����ôf[n]���Ǳ�ʤ
 * ����������X���Ǳ���״̬��������ô�߱��˶���ʤ��
 * ��ʼ״̬
 * f[0]=���� f[1]f[2]f[3]=��ʤ
 * f[4]=���� f[5]f[6]f[7]=��ʤ
 *
 */
class Solution292_1 {
	public boolean canWinNim(int n) {
		return n % 4 != 0;
	}
}