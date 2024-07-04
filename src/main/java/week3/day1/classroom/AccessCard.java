package week3.day1.classroom;

public class AccessCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LearnEncap cc=new LearnEncap();
		String creditCardNum=cc.getCreditCardNum();
		System.out.println(creditCardNum);
		//cc.creditCardNum="5522 2881 9199 1822";
		
		
		cc.setCreditCardNum("5522 2881 9199 1822");
		System.out.println(cc.getCreditCardNum());
	}

}
