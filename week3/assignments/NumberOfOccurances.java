package week3.assignments;

import java.util.LinkedHashMap;
import java.util.Map;

public class NumberOfOccurances {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] input= {2,3,5,6,3,2,1,4,2,1,6,-1};
		
		Map<Integer, Integer> map=new LinkedHashMap<Integer, Integer>();
		for(int i=0;i<=input.length-1;i++) {
		
			if(map.containsKey(input[i])) {
				map.put(input[1], map.get(input[1])+1);
			}
			
			else {
				
				map.put(input[i], 1);
			}
			
		}
		
		System.out.println(map);
	}

}
