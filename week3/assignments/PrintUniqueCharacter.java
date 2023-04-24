package week3.assignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Vishali";
		char[] ch = name.toCharArray();
		System.out.println(ch);

		Set<Character> set = new HashSet<Character>();

		for (int i = 0; i < ch.length; i++) {

			set.add(ch[i]);

		}
		
		//Now store in the list inorder to compare and get the unique chracter
		List<Character> list=new ArrayList<Character>();
		for(int i=0;i<list.size();i++) {
			int c=0;
			for(int j=0;j<ch.length;j++) {
				
				if(list.get(i)==ch[j]) {
					c++;
				}
					
				}
			
			if(c==1) {
				
				System.out.println(list.get(i));
			}
		}
	}

}
