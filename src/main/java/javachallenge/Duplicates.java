package javachallenge;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		//String[] str= {"Test","Dev","QA","Implementation","Prod","Stage","QA","UAT","Sanity","Prod"};

		
		List<String> list=new ArrayList<>();
		list.add("Test");
		list.add("Dev");
		list.add("QA");
		list.add("Implementation");
		list.add("Prod");
		list.add("Stage");
		list.add("QA");
		list.add("UAT");
		list.add("Sanity");
		list.add("Prod");
		
		Set<String> set=new HashSet<>();
		
		for (String name : list) {
			if(set.add(name)==false) {
				
				System.out.println(name+ " is duplicated");
			}
		}
	}
	
}

	