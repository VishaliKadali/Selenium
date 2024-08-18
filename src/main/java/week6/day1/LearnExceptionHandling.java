package week6.day1;

public class LearnExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10;
		int y=0;
		try {
			System.out.println(x/y);
	}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			if(y==0) {
				System.out.println(x/1);
			}
		}
		
		System.out.println("End of Program");
	}
	

}
