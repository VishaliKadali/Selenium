package javachallenge;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number to find its square root");
		double number=scanner.nextDouble();
		
		//Calculate the square root using math.sqrt
		double sqrt=Math.sqrt(number);
		System.out.println("The square root of " +number+ " is: " +sqrt);
		
		scanner.close();
	}

}
