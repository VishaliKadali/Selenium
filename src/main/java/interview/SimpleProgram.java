package interview;

public class SimpleProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "High radius";
		// String rev="";
		// char[] ch=s1.toCharArray();

		for (int i = s1.length() - 1; i >= 0; i--) {

			
			//System.out.println(s1.charAt(i));
			char s2 = s1.charAt(i);
			System.out.println(Character.toString(s2));

		}

	}

}
