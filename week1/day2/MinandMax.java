package week1.day2;

import java.util.Arrays;

public class MinandMax
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nums[]= {7,5,2,0,-2,-5,-7};
		
		//int len=nums.length;
		
		Arrays.sort(nums);
		
		System.out.println("Min value of an array: " +nums[0]);
		
		System.out.println("Max value of an array: " +nums[nums.length-1]);
		
		
		//Another method to find min and max of arrays
		
		
		//Gives maximum value of Integer
		int min=Integer.MAX_VALUE;
		
		//Gives minimum value of Integer
		int max=Integer.MIN_VALUE;
		
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
