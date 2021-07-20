//Write a program to calculate the area of circle by taking radius
//as a input from radius.
package java_package;
import java.util.Scanner;

public class AreaCircle {

	public static void main(String[] args) {
		int radius;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the radius of the cirle : ");
		radius=sc.nextInt();
		double area=Math.PI*radius*radius;
		System.out.println("The area of circle is : "+area);
		
		
		sc.close();
		}

}

