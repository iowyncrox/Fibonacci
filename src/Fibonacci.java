public class Fibonacci {

	public static int fibonacci(int n) {

		if (n == 0)
			return 0;
		if (n == 1 || n == 2)
			return 1;

		return fibonacci(n - 1) + fibonacci(n - 2);
	}

	public static int fib(int n) {

		if (n == 0)
			return 0;
		if (n == 1 || n == 2)
			return 1;

		int x = 1, y = 1;
		int temp = 0;

		for (int i = 3; i <= n; i++) {
			temp = x + y;
			x = y;
			y = temp;
		}
		return temp;
	}

	public static void main(String[] args) {
		System.out.println(Fibonacci.fibonacci(9));
		System.out.println(Fibonacci.fib(9));
	}
}
