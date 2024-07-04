package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public ChromeDriver driver;

	@BeforeMethod
	public void Precondition() {
		/*
		 * WebDriverManager.chromedriver().setup(); 
		 * ChromeOptions options = new ChromeOptions(); 
		 * options.addArguments("--remote-allow-origins=*"); 
		 * driver = new ChromeDriver(options); 
		 * driver.manage().window().maximize();
		 * driver.get("http://leaftaps.com/opentaps/");
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 * driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		 * driver.findElement(By.id("password")).sendKeys("crmsfa");
		 * driver.findElement(By.className("decorativeSubmit")).click();
		 * driver.findElement(By.linkText("CRM/SFA")).click();
		 */
		System.out.println("BeforeMethod");
	}

}
