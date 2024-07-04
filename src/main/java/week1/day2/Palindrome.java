package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="madam";
		
		String rev="";
		
	
		
		//char[] ch=	s1.toCharArray();
		
		//System.out.println(ch);
		
		for(int i=s1.length()-1;i>=0;i--) {
			
			rev=rev+s1.charAt(i);
			
		}
		
		if(s1.equals(rev)) {
			System.out.println(s1 + " is a Palindrome String.");
		}
		else {
			System.out.println(s1 + " is not a Palindrome String.");
		}
			
		
	}

}
