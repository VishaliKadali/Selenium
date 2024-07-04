package week5.day2;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import testcase.BaseClass;
//Run from xml
public class DataProviderBasic extends BaseClass{
	@Test(dataProvider="create")
	public void createLead(String CompanyName, String FirstName, String LastName) {
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(CompanyName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(FirstName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(LastName);
		driver.findElement(By.name("submitButton")).click();
		
		
		}
	
	@DataProvider(name="create")
	public String[][] fetchData() {
		String[][] data=new  String[2][3];
		
		//Firstrow
		data[0][0]="TestLeaf";
		data[0][1]="Hari";
		data[0][2]="RadhaKrishnan";
		
		//Second row
		data[1][0]="Qeagle";
		data[1][1]="Babu";
		data[1][2]="Manickam";
		
		//Returns an array of objects
		return data;
	}

}
