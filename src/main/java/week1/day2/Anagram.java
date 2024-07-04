package week1.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Check if a string is an Anagram
		boolean isAnagram=true;
		String str1="hello";
		String str2="ohell";
		
		//First convert the string into char[] array
		
		char[] charArray1=str1.toCharArray(); //h,e,l,l,o
		char[] charArray2=str2.toCharArray();	//o,h,e,l,l
		
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		
		for(int i=0;i<charArray1.length;i++) {
			
			if(charArray1[i]!=charArray2[i]) {
				
				System.out.println("Is not a Anagram");
				isAnagram=false;
				break;
			}
		}
		
		if(isAnagram==true) {
			
			System.out.println("Anagram");
		}
		
	}
}
