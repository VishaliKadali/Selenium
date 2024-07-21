package week1.day2;

public class CountOfCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Count of the character
		String str = "TestLeaf";
		char ch = 'e';
		char[] charArray = str.toCharArray();
		int count=0;
		for (int i = 0; i < charArray.length; i++) {

			if (charArray[i] == ch) {
				count++;

			}
		}

		System.out.println("Character " +ch+ "is Present" +count+ "times");

	}
}
