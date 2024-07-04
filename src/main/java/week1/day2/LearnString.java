package week1.day2;

public class LearnString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Type String right click open declaration
		//String 
		
		//String literal
		String companyName="TestLeaf";
		
		
		//String creation using object
		String company=new String("Test leaf");
		
		//Both the terms differ in terms of memory
		
		//Compare two strings *****Select and Press ctrl+2 L
		
		
		//.equals compares the value
		boolean isEqual = companyName.equals(company);
		System.out.println(isEqual);
		
		//compares the object
		System.out.println(companyName==company);
		
		
		//To get the length of the string
		int length = companyName.length();
		System.out.println(length);
		
		//Convert the string into character array
		char[] charArray=companyName.toCharArray();
		System.out.println(charArray);
		
		//To get a particular character
		char charAt = companyName.charAt(length-1);
		System.out.println(charAt);
		
		//To get the index of a char
		//If there is a duplicate character, it would pick the first character
		int indexOf = companyName.indexOf('e');
		System.out.println(indexOf);
		
		//To check if string has a specific text
		//it is case sensitive and equals is also case sensitive
		boolean contains = companyName.contains("Leaf");
		System.out.println(contains);
		
		//Ignores case sensitive
		boolean equalsIgnoreCase = companyName.equalsIgnoreCase("testleaf");
		System.out.println(equalsIgnoreCase);
		
		//To get a particular word from sequence of words
		String[] split = company.split(" ");
		System.out.println(split[0]);
		
		
		//To convert into lowercase and uppercase
		System.out.println(companyName.toLowerCase());
		System.out.println(companyName.toUpperCase());
	}

}
