package week3.assignments;

import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicatesUsingSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Use the declared string as input
		String text="We learn java as a part of java sessions in java week1";
		
		//Initialize the tree set with character datatype
		Set<Character> data=new TreeSet<Character>();
		
		//Initialize the loop iteration from 0 to length of the text
		for(int i=0;i<text.length();i++){
			
			//Add the input to set
			data.add(text.charAt(i));
		}
		//Iterate through for loop to get the expected output
		for (Character ch : data) {
			System.out.println(ch.toString());
		}
	}

}
