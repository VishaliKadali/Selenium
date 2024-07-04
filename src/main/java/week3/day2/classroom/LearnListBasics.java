package week3.day2.classroom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnListBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//List can allow any number of duplicates
		/*
		 * add()---Add the values to the list 
		 * remove()--Remove values from the list 
		 * size()--used to find the number of elements in a list
		 * The first data index will be zero
		 * last index-> size()-1
		 * get(index)->get value from list
		 * Collections.sort(<List>) -> To sort the elements in ascending order
		 * Collections.reverse(<List>) -> to reverse the sorting
		 * indexOf(object) -> Index of an item
		 * 
		 * Allows duplicates in the list
		 * Can get the elements from the list based on the index
		 * List can allow any number of duplicates
		 */
		List<String> values=new ArrayList<String>();
		values.add("Hari");
		values.add("Vishali");
		values.add("Babu");
		values.add("Aravind");
		values.add("Vidya");
		values.add("Subraja");
		values.add("Hari");
		//To find the number of items in a list
		int count=values.size();
		System.out.println(count);
		
		values.add("Haja");
		System.out.println(values.size());
		
		
		//To get single data from list
		String data=values.get(2);
		System.out.println(data);
		
		//To get last data
		values.get(values.size()-1);
		System.out.println(values.get(values.size()-1));
		
		for (String eachValue : values) {
			
			System.out.println(eachValue);
			
		}
		
		//Remove data from the list
		values.remove(1);
		
		
		
		System.out.println("List after sorting");
		//Sort the values in the list
		Collections.sort(values);
		System.out.println(values);
		
		
		System.out.println("Reverse the values in a list");
		
		//Reverse the values in the list
		Collections.reverse(values);
		System.out.println(values);
		
		
		//IndexOfthe value in the lis
		System.out.println(values.indexOf("Vishali"));
		
		
		
		
		
		//Generic list
		int num[]= {100,200,300,400,500};
		
		List<Object> numericValues=new ArrayList<>();
		
		for (Object eachNum : num) {
			
			numericValues.add(eachNum);
			
		}
		numericValues.add("Vishali");
		System.out.println(numericValues);
		Collections.reverse(numericValues);
		System.out.println(numericValues);
	}

}
