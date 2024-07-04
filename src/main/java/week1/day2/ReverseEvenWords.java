package week1.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String test = "I am a software tester"; 
		
		//String rev="";
		
		String[] split = test.split(" ");
		
		for(int i=0; i<split.length;i++) {
			
			if(i%2!=0) {
				
				//Reverse String
				
				StringBuilder sb= new StringBuilder(split[i]);
				
				System.out.println(sb.reverse()+ " ");	
					
				}
			
			else {
				
				System.out.println(split[i] + " ");
			}
			}
		}
	}

