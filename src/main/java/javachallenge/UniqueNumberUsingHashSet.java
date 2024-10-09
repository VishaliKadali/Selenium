package javachallenge;

import java.util.HashSet;

public class UniqueNumberUsingHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num= {2,2,1,3,4,2,1};
		
		// Use HashSet to track unique and duplicate numbers
		HashSet<Integer> uniqueNumbers=new HashSet<>();
		HashSet<Integer> duplicateNumbers=new HashSet<>();
		
		for(int i=0;i<=num.length;i++) {
			// If the number is already in uniqueNumbers, add it to duplicateNumbers
			if(!uniqueNumbers.add(num[i])) {
				duplicateNumbers.add(num[i]);
			}
		}
		
		// Print unique numbers
        System.out.println("Distinct Elements are: " + uniqueNumbers);

        // Print duplicate numbers
        System.out.println("Duplicate Elements are: " + duplicateNumbers);
		
	}

}
