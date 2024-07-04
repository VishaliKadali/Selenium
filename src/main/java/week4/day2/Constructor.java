package week4.day2;



import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Constructor {
	/*
	 * Default constructor
	 * Constructors are methods without any return type
	 * name of the constructor is name of the class
	 * Used to perform some common actions while creating objects
	 */
	public Constructor() {
		System.out.println("I am in default constructor");
	}
	
	//Paramterized constructor
	public Constructor(String name) {
		System.out.println("I am in paramterized constructor");
	}
	
	public void method() {
		System.out.println("In method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		WebDriverManager.chromedriver().setup();
//		ChromeDriver driver=new ChromeDriver();
		
		
//		Constructor cons=new Constructor();
//		cons.method();
//		
		//Paramterized constructor
		Constructor cons=new Constructor("Vishali");
		
	}

}
