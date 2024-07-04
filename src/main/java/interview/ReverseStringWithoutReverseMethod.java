package interview;

public class ReverseStringWithoutReverseMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str="123vishali";
		String reversed="";
		for(int i=str.length()-1;i>=0;i--) {
			reversed+=str.charAt(i);
		}
		
		System.out.println(reversed);
	}

}
