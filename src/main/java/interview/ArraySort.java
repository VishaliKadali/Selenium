package interview;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int[] list = {5, 0, 25, 1, 9};

	        // Sorting the array
	        Arrays.sort(list);

	        // Printing the sorted array
	        System.out.println("Sorted Array: " + Arrays.toString(list));
	        
	        for(int i=list.length-1; i>=0;i--) {
	        	
	        	//Sorting the array in Descending order
	        	
	        	System.out.println(list[i] + " ");
	        	
	        }
	}

}
