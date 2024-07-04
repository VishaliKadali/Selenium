package javachallenge;

import java.util.ArrayList;
import java.util.List;

public class PrintEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 2, 3, 6, 2, 8, 10, 6, 17, 11, 14, 15, 25 };
		List<Integer> list = new ArrayList<>();

		for (int i : nums) {

			if (i % 2 == 0) {
				
				list.add(i);
				
			//	System.out.println(i);
			
			}
		}
		
		System.out.println("Even numbers in the list are " +list);
	}

}
