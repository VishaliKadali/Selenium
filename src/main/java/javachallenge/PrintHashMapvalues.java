package javachallenge;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PrintHashMapvalues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hmap=new HashMap<>();
		hmap.put(1, "Vishali");
		hmap.put(2, "Aradhya");
		hmap.put(3,"Devansh");
		hmap.put(4,"Devansh");
	//	hmap.remove(3);
	//	System.out.println(hmap);
		
		//Set<Entry<Integer, String>> entrySet = hmap.entrySet();
		
		//System.out.println(entrySet);
		for (Map.Entry<Integer, String> entry : hmap.entrySet()) {
			System.out.println(entry);
			
			System.out.println("Value is "+entry.getValue());
			System.out.println("Key is " +entry.getKey());
		}
	
	}
}
