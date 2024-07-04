package javachallenge;

public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 1, 11, 3, 4, 6 };

		int[] b = new int[a.length];

		for (int i = 0; i < a.length; i++) {

			b[i] = a[i];

			System.out.println(b[i]);
		}

	}

}
