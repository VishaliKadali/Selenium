package week1.day2;

import java.util.Arrays;

public class ArrayDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[] = { 11, 5, 7, 7, 0, 11, 5 };

		int len = array.length;

		System.out.println(" Size of an array is : " + len);

		Arrays.sort(array);

		for (int i = 0; i <= len - 1; i++) {

			// System.out.println("Array after sorting : " +array[i]);

			for (int j = i + 1; j <= array.length - 1; j++) {

				if (array[i] == array[j]) {

					System.out.println("Duplicate values in an array are: " + array[i]);
				}
			}

		}

		// Another method to find duplicates in an array

		for (int i = 0; i < array.length - 1; i++) {

			if (array[i] == array[i + 1]) {
				System.out.println("Duplicates are" + array[i]);
			}
		}

	}

}
