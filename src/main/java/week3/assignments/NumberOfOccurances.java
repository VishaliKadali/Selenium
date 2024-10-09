package week3.assignments;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class NumberOfOccurances {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] input = { 2, 3, 5, 6, 3, 2, 1, 4, 2, 1, 6, -1 };

		Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		for (int i = 0; i <= input.length - 1; i++) {

			if (map.containsKey(input[i])) {
				map.put(input[i], map.get(input[i]) + 1);
			}

			else {

				map.put(input[i], 1);
			}

		}

		System.out.println(map);

		// Maximum occurance : to get the key and values separately

		// Find the character with the maximum occurrence
        Set<Entry<Integer, Integer>> entrySet = map.entrySet();
        int maxOccurrence = 0;
        Integer maxNumber = 0;
        for (Map.Entry<Integer, Integer> eachEntry : map.entrySet()) {
            if (eachEntry.getValue() > maxOccurrence) {
                maxNumber = eachEntry.getKey();
                maxOccurrence = eachEntry.getValue();
            }
        }

			System.out.println(maxNumber+"-->"+maxOccurrence);
		

			
		// map.entry() and ctrl2
		/*Set<Entry<Integer, Integer>> entrySet = map.entrySet();
		for (Entry<Integer, Integer> eachEntry : entrySet) {
			Integer Key = eachEntry.getKey();
			Integer value = eachEntry.getValue();
			System.out.println(Key + "-->" + value);*/

		}

	}


