package week3.assignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Vishali";
		char[] ch = name.toLowerCase().toCharArray();
		System.out.println(ch);

		Set<Character> set = new LinkedHashSet<Character>();
		
		 // Iterate over the string and add each character to the set
		for (Character uniqueChar : ch) {
			set.add(uniqueChar);
		}
		
		for(char c:set) {
			System.out.println(c+ " ");
		}

	}

}
