package week4.day2;

public class LearnThis {

String comName;
	
	public void learnThis(String comName) {
		
		this.comName=comName;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LearnThis lt=new LearnThis();
		lt.comName="vishali";
		System.out.println(lt.comName="Vishali");
	}

}
//The this keyword in Java refers to the current object—the instance of the class that is currently being used. 
//It is used to differentiate between class variables (also known as instance variables) and method parameters or local variables that may have the same name.