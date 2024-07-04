package week3.day2.classroom;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declare a string
		String s1 = "Paypal India";

		// Convert into to Char array
		char[] charArray = s1.toLowerCase().toCharArray();

		// Declare a set as charset for character
		Set<Character> values = new LinkedHashSet<Character>();

		// Iterate character array and add it to charSet
		for (char eachChar : charArray) {

			// Check whether the character is space, if not add to charSet
			if (eachChar != ' ') {
				values.add(eachChar);
				// System.out.println(ch);
			}

		}

		// System.out.println(values);

		String Output = "";

		// Iterate using charSet
		for (Character eChar : values) {

			// Print each character for charSet
			//System.out.println(eChar);

			//Output += eChar; or
			Output= Output + eChar;

		}
		
		System.out.println(Output);
		// System.out.println(values);
	}

}
