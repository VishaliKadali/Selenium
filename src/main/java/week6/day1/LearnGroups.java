package week6.day1;

import org.testng.annotations.Test;

public class LearnGroups {
	@Test(groups= {"smoke"})
	public void test1() {
		System.out.println("Test1");
		
	}
	@Test(groups= {"smoke"})
	public void test2() {
		System.out.println("Test2");
	}
	@Test(groups= {"Sanity"}, dependsOnGroups= {"smoke"} )
	public void test3() {
		System.out.println("Test3");
	}
	@Test(groups= {"Regression"})
	public void test4() {
		System.out.println("Test4");
	}
}
