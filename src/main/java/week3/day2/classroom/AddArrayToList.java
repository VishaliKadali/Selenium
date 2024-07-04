package week3.day2.classroom;

import java.util.ArrayList;
import java.util.List;

public class AddArrayToList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//<> -> generic to restrict the datatype
		
		int num[]= {100,200,300,400};
		
		List<Integer> listValues=new ArrayList<Integer>();
		
		for (Integer eachValue : num) {
			
			
			listValues.add(eachValue);
			
			
		}
		
		System.out.println(listValues);
		System.out.println(listValues.size());
		listValues.add(500);
		System.out.println(listValues);
		System.out.println(listValues.size());
		System.out.println(listValues.get(4));
	}
	
	
	/*
	 * Linked list is another implementation class in List Data is stored in Doubly
	 * linked List
	 */

}
