//Write a program to find if the year is leap year or not.

package java_package;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		int year;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year : ");
		year = sc.nextInt();
		if ((year % 400 == 0) || (year % 100 != 0 && year % 4 == 0)) {
			System.out.println("The year " + year + " is leap year!");
		} else {
			System.out.println("The year " + year + " is not a leap year!");
		}

		sc.close();
	}

}
