package interview;

import java.util.HashSet;
import java.util.Set;

public class Replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Set of numbers 1 to 100
		 * 
		 * If num/2
		 * 
		 * replace with text java
		 * 
		 * If num/3
		 * 
		 * replace with text selenium;
		 * 
		 * Divisisble by both 2 and 3
		 * 
		 * replace wiht testng
		 * 
		 * 
		 * If it is not divisble by 2 and 3 then it should store the number
		 * 
		 * 1, java, selenium, java, 5, testng, 7
		 */
		
		
		int num=100;
		String s1="java", s2="selenium", s3="testng", a1,a2,a3;
		
		for(int i=1; i<=num; i++) {
			
			
			
			  if(i%2==0) {
			  
			  //System.out.println(i);
			  
			  a1=Integer.toString(i);
			  
			  a1.replace(a1,"java");
			  
			  System.out.println(a1.replace(a1,"java"));
			  
			  }
			  
			  if(i%3==0) {
			  
			  a2=Integer.toString(i);
			  
			  a2.replace(a2,"selenium");
			  
			  System.out.println(a2.replace(a2,"selenium"));
			  
			  }
			 
				
			 if(i%2==0 && i%3==0) {
					
					a3=Integer.toString(i);
				
					
					a3.replaceAll(a3, "testng");
					
					
					System.out.println(a3.replace(a3, "testng"));
				
			}
			 
			 
			 
			if(i%2!=0 && i%3!=0) {
				 
				System.out.println(i);	
				 
			}
			 
		}
		
	}

}
