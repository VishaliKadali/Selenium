package interview;

import java.util.Iterator;

public class ReverseName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "123vishali";
		for (int i = name.length() - 1; i >= 0; i--) {
			// System.out.println(name.charAt(i));

			char ch = name.charAt(i);
			String str = Character.toString(ch);
			
			str=str.replaceAll("[^a-z]", "");
			
			System.out.println(str);
		}
	}

}
