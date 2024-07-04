package javachallenge;

public class SplitString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s1 = "Hello World";

		String[] split = s1.split(" ");

		// If you don't give space in the String[] split-s1.split("");, it gives
		// different output
		System.out.println(split.length);

		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
			System.out.println(split[i].substring(0, 4));
			
			
	}
		
	}

}
