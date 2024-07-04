package week.day1;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Hint: Iterate all the numbers from 0 to (n-1) input and for every number
		 * check if it divides n (input) If we find any number that divides, print prime
		 * If nothing divides, print not prime
		 */

		int n = 9;

		int count = 0;

		for (int i = 2; i <= n - 1; i++)

		{
			if (n % i == 0) {

				count++;

			}
		}

		if (count == 0) {

			System.out.println(n + " Is a prime number");
		} else {

			System.out.println(n + " is not a prime number");
		}

	}

}
