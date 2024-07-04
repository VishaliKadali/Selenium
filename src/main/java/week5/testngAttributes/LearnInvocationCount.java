package week5.testngAttributes;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import week5.day2.BaseClass;



public class LearnInvocationCount extends BaseClass {
	
	@Test(invocationCount=5, threadPoolSize = 2)
	public void createLead() {
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hari");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		driver.findElement(By.name("submitButton")).click();
		//driver.close();
	}
}
