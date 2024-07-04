package week5.day2;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EditLeadWithDataProvider extends BaseClass {
	
	
	@Test(dataProvider="Edit")
	public void editLead(String Phone, String Company) throws InterruptedException {
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(Phone);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(Company);
		driver.findElement(By.name("submitButton")).click();
		
	}
	
	@DataProvider(name="Edit")
	public String[][] fetchData() throws IOException{
		
//		String[][] data;
		/*
		 * String[][] data=new String[3][2]; data[0][0]="9"; data[0][1]="Infosys";
		 * 
		 * data[1][0]="8"; data[1][1]="Amazon";
		 * 
		 * data[2][0]="7"; data[2][1]="HCL";
		 */
		
		/*
		 * data=ReadExcelData.readSheetData("EditLead"); return data;
		 */
		
		//If you want the data in same sheet for different testcases use the below one 
		//return ReadExcelData2.readExcelData("CreateLead","EditLead");
		return ReadExcelData.readSheetData("EditLead");
	}

}
