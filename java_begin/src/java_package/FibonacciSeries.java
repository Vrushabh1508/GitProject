package java_package;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int sum = 0;
		int n;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter thr number upto which you want Fibonacci Sequence :");
		n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println(sum + " ");

			a = b;
			b = sum;
			sum = a + b; // To print n terms, write program upto this.

			// To print sum less than or equal to n, write above block of code too.
			if (sum >= n) {
				break;
			}

		}
		sc.close();
	}

}
