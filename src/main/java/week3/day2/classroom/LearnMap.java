package week3.day2.classroom;

import java.util.LinkedHashMap;
import java.util.Map;

public class LearnMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * MAP is an interface 
		 *	2 Dimensional collection Key & Value
		 *	Implementation classes are
		 * 	HashMap -> random order 
		 * 	LinkedHashMap ->InsertionOrder 
		 * 	TreeMap -> ASCII Order
		 * 
		 * When there is a duplicate key, it overrides the old value with new value
		 * 
		 *Duplicates are not allowed
		 * 
		 */
		
		
		/* put() -> to insert data into the map
		 * get(key) ->To get the value of the key
		 * containsKey(key) -> true if it contains the key, false if it doesn't contain the key
		 * 
		 *  */
		
		Map<Integer, String> map= new LinkedHashMap<Integer, String>();
		map.put(100, "Vishali");
		map.put(200, "Vidya");
		map.put(300, "Haja");
		map.put(200, "Hari");
		System.out.println(map.get(200));
		System.out.println(map);
	}

}
