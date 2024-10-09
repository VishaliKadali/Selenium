package javachallenge;

public class SortNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names= {"Vishali", "Ankit", "Raj", "Megha", "Sundar"};
		
		for(int i=0;i<=names.length;i++) {
			for(int j=i+1;j<names.length;j++) {
				// Compare two names lexicographically
				if(names[i].compareTo(names[j])>0) {
					String temp=names[i];
					names[i]=names[j];
					names[j]=temp;
				}
			}
		}
		System.out.println("Sorted names ");
		for (String name : names) {
			System.out.println(name);
		}
	}

}
