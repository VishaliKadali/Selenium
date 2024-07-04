package javachallenge;

public class UniqueNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] num= {2,2,1,3,4,2,1};
		
		for(int i=0;i<=num.length-1;i++) {
			
		//	System.out.println(num[i]);
			
			for(int j=1;j<=i;) {
				
				if(num[i]!=num[j]) {
					
					System.out.println("Distinct Elements are : "+num[i]);
					break;
				}
				
				if(num[i]==num[j]) {
					
					System.out.println( "Duplicate Elements: " +num[i]);
				
				}
				break;
			}
		}
	}

}
