package week1.day2;

import java.util.Arrays;

public class MinandMax
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nums[]= {7,5,2,0,-2,-5,-7};
		
		//int len=nums.length;
		
		Arrays.sort(nums);
		System.out.println("Array after sorting: ");
		for (int i : nums) {
			System.out.println(i);
		}
		
		System.out.println("Min value of an array: " +nums[0]);
		
		System.out.println("Max value of an array: " +nums[nums.length-1]);
		
		
		//Another method to find min and max of arrays
		
		
		
		//Here the Integer.MAX_VALUE is positive number and Integer.MIN_VALUE is negative number
		//Gives maximum value of Integer
		int min=Integer.MAX_VALUE;
		System.out.println("Min value of  Integer.max " +min);
		//Gives minimum value of Integer
		int max=Integer.MIN_VALUE;
		System.out.println("Max value of Integer.min " +max);
		
		for(int i=0;i<nums.length;i++)
		{
			
			if(min> nums[i]) {
				
			min=nums[i];
			
			}
			
			if(max<nums[i]) {
				
				max=nums[i];
			}
		}

		
		System.out.println("Min value is: " +min);
		System.out.println("Max value is: " +max);
	}

}
