package java_package;
import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		int a,b;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number a : ");
		a=in.nextInt();
		System.out.println("Enter the number b : ");
		b=in.nextInt();
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping : ");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
		
		in.close();
	}

}
