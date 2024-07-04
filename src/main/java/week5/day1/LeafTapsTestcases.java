package week5.day1;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LeafTapsTestcases extends BaseClass{
	
	@Test
	public void testcase2() {
		System.out.println("testcase2");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforeMethod for TC2");
	}

}
