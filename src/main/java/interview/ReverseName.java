package interview;

public class ReverseName {
 static String name="";
 static String str;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String name="123vishali";
		char[] ch=name.toCharArray();
		System.out.println(name.length());
		for(int i=ch.length-1;i>=0;i--) {
			
			System.out.println(ch[i]);
			
			str=String.valueOf(ch[i]);
			
			//str.replaceAll("[^0-9]", "");
			
			
			
			//System.out.println(str.replaceAll("[^a-z]", ""));
			
		}
		
		System.out.println(str.replaceAll("[^0-9]",""));
		
	}

}
