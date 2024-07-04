package week3.day2.classroom;

import java.util.ArrayList;
import java.util.List;

public class ListAddAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] num= {4,2, 6,6, 9};
			
		List<Integer> list1=new ArrayList<Integer>();
		for (Integer eachNum : num) {
			list1.add(eachNum);
		}
		System.out.println(list1);
		
		list1.removeAll(list1);
		System.out.println(list1);
		}

}
