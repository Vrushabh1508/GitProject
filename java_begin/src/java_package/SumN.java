//Write a program to add first n numbers.

package java_package;

import java.util.Scanner;

public class SumN {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number upto which you wanna add them : ");
		n = sc.nextInt();
		int temp = 0;
		for (int i = 0; i <= n; i++) {
			temp = temp + i;
			}
		System.out.println("The sum of first " + n + " numbers is " + temp);
		sc.close();
	}

}
