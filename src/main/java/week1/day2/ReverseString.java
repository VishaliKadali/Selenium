package week1.day2;



public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str="I am at cognizant";
		
		//char[] ch= s.toCharArray();
		
		
			
			char[] ch=str.toCharArray();
			
			System.out.println(ch);
			
		/*for(int i=ch.length-1;i>=0;i--) {
			System.out.println(ch[i]);*/
			
			for(int i=str.length()-1;i>=0;i--) {
				
				
				System.out.println(str.charAt(i));
			
			
		}
		
	}

}
