package week3.day2.classroom;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * 
 * put() -> To insert data into map
 * get(key) -> to get the value of key
 * containKey(key) -> true if it contains the key; false if it doesn't contain the key
*/

public class CharacterOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "amazon India";
		// Output a=3, m=1, z=1, o=1, n=2, i=2, d=1;

		// Unique one keep it as key and other one as value
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		char[] charArray = input.toLowerCase().replace(" ", "").toCharArray();

		/*
		 * for (char ch : charArray) {
		 * 
		 * if(map.containsKey(ch)) {
		 * 
		 * map.put(ch, map.get(ch)+1); }
		 * 
		 * else { map.put(ch, 1); //first time occurance } }
		 */

		for (int i = 0; i < charArray.length; i++) {

			if (map.containsKey(charArray[i])) {

				// map.get will get the existing value

				map.put(charArray[i], map.get(charArray[i]) + 1);

			} else {
				map.put(charArray[i], 1);
			}
		}
		System.out.println(map);

		int maxOccurance = 0;
		char maxCharacter = 0;
		
		//To get the key and value of entrySet
		//Press map.entry ctrl2 + L

		Set<Entry<Character, Integer>> entrySet = map.entrySet();
		for (Entry<Character, Integer> eachEntry : entrySet) {
			if (eachEntry.getValue() > maxOccurance) {
				maxCharacter = eachEntry.getKey();
				maxOccurance = eachEntry.getValue();
			}

		}

		System.out.println(maxCharacter+"-->"+maxOccurance);
	}

}
