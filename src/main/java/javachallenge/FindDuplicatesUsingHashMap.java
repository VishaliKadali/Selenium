package javachallenge;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicatesUsingHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] inputArray= {2,5,7,9,7,2,1,5,1,4,7,};
		
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(int i=0;i<inputArray.length;i++) {
			
			if(map.containsKey(inputArray[i])) {
				
				int count=map.get(inputArray[i])+1;
				map.put(inputArray[i], count);
			}
			
			else {
				map.put(inputArray[i], 1);
			}
		}
		
		for(Map.Entry<Integer, Integer> entry	:  map.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println("Duplicate element: " + entry.getKey());
			}
		}
	}

}
