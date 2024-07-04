package week2.day1.classroom;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Setup browser driver
		WebDriverManager.chromedriver().setup();
		//WebDriverManager.edgedriver().setup();
		
		//Get driverpath
		String driverPath=System.getProperty("webdriver.chrome.driver");
		//String edgeDriverPath=System.getProperty("webdriver.edge.driver");
		System.out.println(driverPath);
		//System.out.println(edgeDriverPath);
		
		//Launch browser
		
		  ChromeOptions options=new ChromeOptions();
		  options.addArguments("--remote-allow-origins=*"); 
		  ChromeDriver driver=new ChromeDriver(options);
		 
		//FirefoxDriver ffdriver=new FirefoxDriver();
		//EdgeDriver driver=new EdgeDriver();
		
		//Load the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Enter the username, password and click submit button
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
	
	}

}
