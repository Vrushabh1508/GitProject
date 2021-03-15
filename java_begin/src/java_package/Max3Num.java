//Write a program to find maximum number between the given three numbers.
package java_package;

import java.util.Scanner;

public class Max3Num {

	public static void main(String[] args) {
		int a,b,c;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the first number : ");
		a=in.nextInt();
		System.out.println("Enter the second number : ");
		b=in.nextInt();
		System.out.println("Enter the third number : ");
		c=in.nextInt();
		
		if(a>b && a>c) {
			System.out.println(a + " is greater!");
		}else if(b<a && b>c) {
			System.out.println(b + " is greater!");
		}else {
			System.out.println(c + " is greater!");
		}
		
		
		
		in.close();
	}

}
