package week3.day2.classroom;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSetBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * add()---Add the values to the set 
		 * remove()--Remove values from the list 
		 * size()--used to find the number of elements in a set
		 * 
		 * 
		 *
		 * Collections.reverse(<List>) -> to reverse the sorting
		 * indexOf(object) -> Index of an item
		 * 
		 * Doesn't Allow duplicates in the set
		 * Can get the elements from the list based on the index
		 * Set can't allow any number of duplicates
		 * 
		 * Cannot get single data from the set
		 * Set->Maintains the random data
		 * Set->Doesn't maintain the order
		 * 
		 * LinkedHashSet->Maintains the insertion order
		 * Treeset->Automatically sorts the data, maintains ASCII order
		 * 
		 */
		
		
		Set<String> values=new HashSet<String>();
		System.out.println(values.add("Hari"));
		values.add("Vishali");
		values.add("Babu");
		values.add("Aravind");
		values.add("Vidya");
		values.add("Subraja");
		System.out.println(values.add("Hari"));
		for (String eachData : values) {
			System.out.println(eachData);
		}
		
		//To get the single data from set->Copy the set into list and use get(index) in list
		
		List<String> listValues=new ArrayList<String>(values);//copy one collection to another collection
		
		System.out.println("********************************");
		
		System.out.println(listValues.get(3));
		
		
		//To sort the list in ascii order you can use Treeset
		System.out.println("Sorted values of Treeset");
		Set<String> sortedValues=new TreeSet<String>(values);
		System.out.println(sortedValues);
		
		
	}
	
	
}
