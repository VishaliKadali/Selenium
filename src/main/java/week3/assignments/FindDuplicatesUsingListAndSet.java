package week3.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicatesUsingListAndSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int[] a= {11,12, 15, 16, 16, 11, 20};
		
		List<Integer> list1=new ArrayList<Integer>();
		list1.add(11);
		list1.add(12);
		list1.add(15);
		list1.add(16);
		list1.add(16);
		list1.add(11);
		list1.add(20);
			Collections.sort(list1);
			
			Set<Integer> set1=new HashSet<Integer>();
			for (Integer Dup : list1) {
				if(set1.add(Dup)==false)
				
				System.out.println(Dup+ " is duplicated");
		
		}
		}

}
