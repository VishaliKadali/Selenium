package week5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	//Removed Chrome Driver because by default it is declared as (public ChromeDriver driver;), since we are using firefox browser also, declaring the parent RemoteWebDriver, also inlcude one more parameter with browser and value
	//If you want to execute different tests in different browser declare them in test level separately
	public RemoteWebDriver driver;
	@Parameters({"url","username","password","browser"})
	@BeforeMethod
	public void preCondition(String url, String username, String password, String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			WebDriverManager.chromedriver().setup();
			
			driver = new ChromeDriver(options);
		}else if(browser.equalsIgnoreCase("edge")) {
			EdgeOptions options=new EdgeOptions();
			options.addArguments("--remote-allow-origins=*");
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver(options);
		}
		
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
	}
	
	@AfterMethod
	public void postCondition() {
		driver.close();
	}
}
