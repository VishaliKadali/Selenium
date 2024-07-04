package week6.day1;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LearnAssertions {
	@Test
	public void test1() {
		//Hard assertt=ion
		String s1="testleaf";
		String s2="test";
		Assert.assertEquals(s1, s2);
		System.out.println("End of Program");
	}
	@Test
	public void test2() {
		//Hard assertt=ion
		String s1="testleaf";
		String s2="testleaf";
		Assert.assertEquals(s1, s2);
	}
	@Test
	public void test3() {
		//Hard assertt=ion
		//SoftAssertion
		String s="Testleaf";
		String s1="Testleaf";
		String s2="Test";
		
		SoftAssert softAssert=new SoftAssert();
		softAssert.assertEquals(s, s1);
		softAssert.assertEquals(s, s2);
		System.out.println("End of Program");
		//Failure will be captured only if we call the assertall function at the end of our execution
		softAssert.assertAll();
	}
	
}
