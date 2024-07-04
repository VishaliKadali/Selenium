package week1.day2;


public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String test="changeme";
		
		char[] toChar=test.toCharArray();
		
		for(int i=0;i<=toChar.length-1;i++) {
			
			if(i%2==0) {
				
				System.out.println(Character.toUpperCase(toChar[i]));
			}
			
			else  {
				
				System.out.println(test.charAt(i)+ " is Not Odd Index");
				
			}
			
			
		}

	}

}
