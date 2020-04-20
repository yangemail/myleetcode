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

         // 找到每个数的倍数,同时i*i应该小于最大数n
         for (int i = 2; i * i < n; i++) {
             if (!isPrime[i]) {
                 continue;
             }

             // j从2*2 = 2起始,每次增加 i。
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