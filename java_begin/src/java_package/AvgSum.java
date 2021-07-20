package java_package;
import java.util.Scanner;


public class AvgSum {

	public static void main(String[] args) {
		int a,b;
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the first number : ");
		a=in.nextInt();
		System.out.println("Enter the second number : ");
		b=in.nextInt();
		
		int sum=a+b;
		System.out.println("The sum of two numbers is : "+ sum);
		float avg=sum/2;
		System.out.println("The average of two numbers is : "+ avg);
		
	in.close();
	}

}
