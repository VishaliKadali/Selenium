
package javachallenge;

public class LengthOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hello World";

		String[] split = s1.split(" ");

		// If you don't give space in the String[] split-s1.split("");, it gives
		// different output
		System.out.println(split.length);

		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]);

			
//			  if(i==split.length) {
//			  
//			  System.out.println(split[i].length()); }
			 

		}

		String s2 = "fly me to the moon";
		String[] split2 = s2.split(" ");
		System.out.println( split2.length - 1);

		for (int i = 0; i < split2.length; i++) {
			System.out.println(split2[i]);
			if (i == split2.length - 1) {

				System.out.println(split2[i].length());
			}
		}

		String s3 = "luffy is still joyboy";
		String[] split3 = s3.split(" ");
		System.out.println(split3.length - 1);

		for (int i = 0; i < split3.length; i++) {
			System.out.println(split3[i]);

			if (i == split3.length) {

				System.out.println(split3[i].length());
			}
		}
	}

}
