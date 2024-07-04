package week4.day2;

public class ParameterizedConstructor {

	public ParameterizedConstructor() {
		System.out.println("I am in default constructor");
	}
	
	public ParameterizedConstructor(String name) {
		System.out.println("I am in Parameterized constructor: " +name);
	}
	
	public void method() {
		System.out.println("In method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ParameterizedConstructor cons=new ParameterizedConstructor("Vishali");
		cons.method();
	}
	
	

}
