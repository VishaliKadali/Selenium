package week3.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data= {3,2,11,4,6,7};
		
		//Add the array to the list
		List<Integer> list1=new ArrayList<Integer>();
		for(int i=0;i<data.length;i++) {
			
			list1.add(data[i]);
		}
		System.out.println(list1);
		//After arranging in ascending order largest value will be in the last position, which can be identified by getting size value
		//In order to get the second largest value get size-2
		Collections.sort(list1);
		System.out.println(list1);
		int size=list1.size();
		System.out.println(list1.get(size-2));
	}



}
