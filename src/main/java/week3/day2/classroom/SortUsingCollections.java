package week3.day2.classroom;


import java.util.ArrayList;
import java.util.Collections;

public class SortUsingCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] input = {"HCL","Wipro","Aspire Systems","CTS"};
//		Declare a String array and add the Strings values as (HCL, Wipro,  Aspire Systems, CTS)

//		get the length of the array		
		int length=input.length;
		
		System.out.println("Length of an array " +length);

		
		
		ArrayList<String> values=new ArrayList<String>();
	
		
		
		for(String eachdata:input)
//		sort the array
			
		{
			//System.out.println(values.add(eachdata));
			values.add(eachdata);
		}
		Collections.sort(values);
		
		

//		Iterate it in the reverse order
		for(int i=values.size()-1;i>=0;i--) {
//			print the array
			
			System.out.println(values.get(i));
			
		}


		
//		Required Output: Wipro, HCL , CTS, Aspire Systems
	}

}
