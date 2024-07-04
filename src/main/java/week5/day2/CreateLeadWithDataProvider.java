package week5.day2;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import week6.day1.RetryFailedTests;


public class CreateLeadWithDataProvider extends testcase.BaseClass{
	
	@Test(dataProvider="Create")
	public void createLead(String companyName, String firstname, String Lastname) throws InterruptedException {
		
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hari");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		driver.findElement(By.name("submitButton")).click();
	}
	
	@DataProvider(name="Create")
	public String[][] fetchData() throws IOException{
		
		//String[][] data;
		/*
		 * String[][] data=new String[2][3];
		 * 
		 * data[0][0]="TestLeaf"; 
		 * data[0][1]="Hari"; 
		 * data[0][2]="RadhaKrishna";
		 * 
		 * data[1][0]="Qeagle"; 
		 * data[1][1]="Babu"; 
		 * data[1][2]="Manickam";
		 * 
		 * return data;
		 */
		
		/*
		 * data=ReadExcelData.readSheetData("CreateLead");
		 * 
		 * return data;
		 */
		return ReadExcelData.readSheetData("CreateLead");
			
	}

}
