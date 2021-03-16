//Write a program to calculate factorial of a number.
package java_package;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter the number : ");
		n = sc.nextInt();
		int a = 1;
		while (n > 0) {
			a = a * n;
			n--;

		}
		System.out.println(a);

		sc.close();
	}

}
