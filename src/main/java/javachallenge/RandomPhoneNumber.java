package javachallenge;

import java.util.Random;

public class RandomPhoneNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random=new Random();

		long RandomNumber= Math.abs(random.nextLong());

		String randomstring=Long.toString(RandomNumber);


		randomstring.substring(0,5);

		
		System.out.println(randomstring.substring(0,10));
		
	}

}
