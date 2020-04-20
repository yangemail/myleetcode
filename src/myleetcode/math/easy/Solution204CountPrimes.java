package myleetcode.math.easy;

import java.util.Arrays;

public class Solution204CountPrimes {

	public static void main(String[] args) {
		
	}

}

class Solution204_1 {
    public int countPrimes(int n) {
    	 boolean[] isPrime = new boolean[n];
         Arrays.fill(isPrime, true);

         // �ҵ�ÿ�����ı���,ͬʱi*iӦ��С�������n
         for (int i = 2; i * i < n; i++) {
             if (!isPrime[i]) {
                 continue;
             }

             // j��2*2 = 2��ʼ,ÿ������ i��
             for (int j = i * i; j < n; j += i) {
                 isPrime[j] = false;
             }
         }

         int count = 0;
         for(int i = 2; i < n; i++) {
             if (isPrime[i]) {
                 count++;
             }
         }

         return count;
    }
}