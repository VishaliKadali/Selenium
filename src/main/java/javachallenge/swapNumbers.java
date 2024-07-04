package javachallenge;

public class swapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 7, b = 3;
		System.out.println("Value of a is " +a +" Value of b is " +b );
		// Swap numbers without using third variable
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("Value of a after swapping " +a + " Value of b after swapping " + b);

	}

}
