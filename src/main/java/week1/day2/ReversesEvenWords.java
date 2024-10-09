package week1.day2;

public class ReversesEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String name="I am a software engineer";
			
			String[] split=name.split(" ");
			
			for(int i=0;i<split.length;i++) {
				if(i%2!=0) {
					
					char[] charArray=split[i].toCharArray();
					
					for(int j=charArray.length-1;j>=0;j--) {
						System.out.println(charArray[j]);
					}
					
					System.out.println(" ");
				}
				
				else {
					System.out.println(split[i]+ " ");
				}
			}
			
	}

}
