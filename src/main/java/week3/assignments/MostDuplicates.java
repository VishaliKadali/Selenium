package week3.assignments;

import java.util.HashMap;
import java.util.Map;

public class MostDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input="abbaba";
		Map<Character, Integer>map=new HashMap<Character,Integer>();
		char[] charArray=input.toCharArray();
		char maxOccur=input.charAt(0);
		int maxValue=0;
		
		for(int i=0;i<charArray.length;i++) {
			
			map.put(charArray[i], map.getOrDefault(charArray[i], 0)+1);
			
			if(map.get(charArray[i])>maxValue) {
				maxOccur=charArray[i];
				map.get(charArray[i]);
				maxValue=map.get(charArray[i]);
			}
		}
		
			System.out.println(maxOccur);
	}

}
