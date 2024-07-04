package week5.day1;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LearnAnnotations extends BaseClass {
	
	@Test
	public void testcase1() {
		System.out.println("testcase1");
	}

	@BeforeMethod
	public void beforeMethod1() {
		System.out.println("beforeMethod1 for TC1");
	}
	
	@BeforeClass
	public void beforeClass1() {
		System.out.println("BeforeClass in Child");
	}
	

}
