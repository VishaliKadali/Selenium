package practice;

public class Interview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "apple";
		char ch = 'p';
		char[] charArray = str.toCharArray();
		int count=0;
		for (int i = 0; i < charArray.length; i++) {

			if (charArray[i] == ch) {
				count++;

			}
		}

		System.out.println(count);

	}
	}

