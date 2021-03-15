package java_package;

import java.util.Scanner;

public class Cmpd_Int {

	public static void main(String[] args) {

		double principalAmount;
		double finalAmount;
		double interestRate;
		double timePeriod;
		double compoundInterest;

		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Principal Amount : ");
		principalAmount = in.nextDouble();
		System.out.println("Enter the Rate of Interest : ");
		interestRate = in.nextDouble();
		System.out.println("Enter the Time Period : ");
		timePeriod = in.nextDouble();
		
		finalAmount=principalAmount * Math.pow(interestRate/100+1,timePeriod);
		System.out.println("The Final Amount is :"+ finalAmount);
		compoundInterest=finalAmount-principalAmount;
		System.out.println("The compound interest on principal amount "+principalAmount+ " is "+compoundInterest);
		
		in.close();

	}

}
