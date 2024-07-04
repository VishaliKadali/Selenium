package interview;

public class ReverseStringwithReverseMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="123 vishali";
		
		String reversed = new StringBuilder(name).reverse().toString();
		System.out.println("Reversed String is " +reversed);
		
	}

}
