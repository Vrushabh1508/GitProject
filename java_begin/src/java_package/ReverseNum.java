//Write a program to reverse the given number.
package java_package;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		int num;
		int remainder;
		int result = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		num = sc.nextInt();
		while (num > 0) {
			remainder = num % 10;
			result = result * 10 + remainder;
			num = num / 10;
		}
		System.out.println(result);
		sc.close();
	}

}
