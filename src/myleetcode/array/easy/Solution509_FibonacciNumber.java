package myleetcode.array.easy;

public class Solution509_FibonacciNumber {

	public static void main(String[] args) {

	}

}

class Solution509_1 {
	public int fib(int N) {
		if (N <= 1)
			return N;
		return fib(N - 1) + fib(N - 2);
	}
}
