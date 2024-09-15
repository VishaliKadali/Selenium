package interview;

public class PrimeNumbersFibnocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int firstnum = 0, secnum = 1, sum;
		//boolean bPrime = true;

		for (int i = 2; i <= 25; i++) {

			System.out.println(firstnum);

			sum = firstnum + secnum;
			firstnum = secnum;
			secnum = sum;

		}

	}

}
