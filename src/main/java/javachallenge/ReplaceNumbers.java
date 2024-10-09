package javachallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ReplaceNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    // Create a HashSet to store numbers and their replacements
        Set<String> numbers = new HashSet<String>();

        // Add numbers 1 to 100 and their replacements to the Set
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                numbers.add("testng");
            } else if (i % 2 == 0) {
                numbers.add("java");
            } else if (i % 3 == 0) {
                numbers.add("selenium");
            } else {
                numbers.add(Integer.toString(i));
            }
        }
        // Convert the Set to a List
        List<String> sortedNumbers = new ArrayList<>(numbers);
        
        Collections.sort(sortedNumbers);
        // Print the numbers and their replacements using an enhanced for loop
        for (String number : numbers) {
            System.out.println(number + " ");
        }
    }
	}

