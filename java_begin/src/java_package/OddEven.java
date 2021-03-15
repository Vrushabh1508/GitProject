//Write a program to find if the given number is even or odd.

package java_package;

import java.util.Scanner;

public class OddEven {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		n = sc.nextInt();
		if (n % 2 == 0) {
			System.out.println("The number " + n + " is Even!");
		} else {
			System.out.println("The number " + n + " is Odd!");
		}
		sc.close();
	}

}
