package javachallenge;


import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrintDuplicateNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//To print duplicates
		//Create a string array
		//Create an empty set
		//Iterate the string array using for loop
		//Compare eachName in the string array by adding into the set

		String[] names= {"QA", "Dev", "Operations", "Technical", "QA" ,"Dev"};
		
		//List<String> duplicateNames=new ArrayList<>();
		
		Set<String> set= new HashSet<>();
		
		for (String eachName : names) {
			
			if(set.add(eachName)==false) {
				
				System.out.println(eachName+ " is duplicated");
			}
		}
		
	}

}
