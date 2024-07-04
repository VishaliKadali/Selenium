package interview;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumbersFibnocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 100, firstnum = 0, secnum = 1, sum;
		boolean bPrime = true;

		for (int i = 2; i <= 25; i++) {

			System.out.println(firstnum);

			sum = firstnum + secnum;
			firstnum = secnum;
			secnum = sum;
			// List<Integer> list=new ArrayList<>();
			// list.add(firstnum);

			/*
			 * if(firstnum%i==0) { System.out.println(+ firstnum +
			 * " Is not a Prime Number"); bPrime=false; break; }
			 * 
			 * if(bPrime==true) { System.out.println(+ firstnum + " Is a Prime Number "); }
			 */

		}

	}

}
