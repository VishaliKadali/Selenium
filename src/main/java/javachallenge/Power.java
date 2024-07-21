package javachallenge;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the base number:");
        double base = scanner.nextDouble();

        System.out.println("Enter the exponent:");
        double exponent = scanner.nextDouble();

        // Calculate the power using Math.pow
        double result = Math.pow(base, exponent);

        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
        
        scanner.close();
	}

}
