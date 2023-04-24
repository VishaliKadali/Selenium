package week1.day2;

import java.util.Arrays;

public class LearnArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] marks= {29,32,43,23,54,12,65,23,87,45,65,98,99};
		int length=marks.length;
		System.out.println(length);
		System.out.println(marks[0]);
		System.out.println(marks.length-2);
		
		//print the last value of array
		System.out.println(marks[length-1]);
		
		//Find the number of times 23 is present
		
		int num=23;
		
		int count=0;
		
		for(int i=0;i<marks.length;i++) {
			
			if(marks[i]==num) {
				
				count=count+1;
			}
		}
		
		System.out.println(count);
		
		
		//Sort an array in ascending order
		
		Arrays.sort(marks);
		for(int i=0;i<marks.length;i++) {
			System.out.println(marks[i]);
		
		}
		//Sort an arrays in descending order
		for(int i=marks.length-1;i>=0;i--) {
			
			System.out.println(marks[i]);
		}
	}

}
