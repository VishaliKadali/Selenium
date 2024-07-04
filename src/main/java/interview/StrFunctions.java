package interview;

public class StrFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str = "abcd33@#%%";
		
		System.out.println(str.replaceAll("[^0-9]", ""));
		
		str=str.replaceAll("[^0-9]", "");
		
		int a =Integer.parseInt(str);
		
		int b=7;
		
		System.out.println(a+b);
		
		
	}
	

}
