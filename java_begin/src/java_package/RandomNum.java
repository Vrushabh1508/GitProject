//Write a program to generate 5 random numbers between 5 to 50. 

package java_package;

public class RandomNum {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			System.out.println((int) (5+Math.random() * 50));//Explore Math.random() method and its examples for detailed explaination.
		}

	}

}
