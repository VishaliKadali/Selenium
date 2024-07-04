package week2.day1.classroom;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeaf {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		//String driverPath=System.setProperty(null, null)
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Click on link 
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Click on Leads tab
		driver.findElement(By.linkText("Create Lead")).click();
		
		//Enter the  form
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("VAM");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vishali");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("K");
		driver.findElement(By.xpath("//input[@name='departmentName']")).sendKeys("Engineer");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("I am a software Engineer");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("info@testleaf.com");
		Select stateProvince_dropdown=new Select( driver.findElement(By.xpath("//select[@id='createLeadForm_generalStateProvinceGeoId']")));
		//List<WebElement> stateOptions=stateProvince_dropdown.getOptions();
		stateProvince_dropdown.selectByVisibleText("New York");
		String stateProvince=stateProvince_dropdown.getFirstSelectedOption().getText();
		System.out.println(stateProvince);
		driver.findElement(By.name("submitButton")).click();
		Thread.sleep(2000);
		
		//String title=driver.findElement(By.xpath("//img[@src='/opentaps_images/opentaps_logo.png']")).getText();
		String title=driver.getTitle();
		System.out.println(title);
		
		driver.close();
		
	}

}
