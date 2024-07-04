package javachallenge;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="A man, a plan, a canal: Panama";
		
		String rev="";
		
		if(s1.contains(",")&& s1.contains(":"))
		{
			s1=s1.replace(",", "");
			s1=s1.replace(":", "");
			
			System.out.println(s1);
		}
		
		//String[] split1=s1.split(" ");
		s1 = s1.replaceAll("\\s", "");
		
		s1=s1.toLowerCase();
		
		for(int j=s1.length()-1;j>=0;j--) {
			
			rev=rev+s1.charAt(j);
			System.out.println(rev);
		}
		
		if(s1.equals(rev)) {
			
			System.out.println(s1 + " : is a Palindrome" );
			
		}
		
		else {
			
			System.out.println(s1 + " : is not a Palindrome" );
		}
		
	}

}
