package SeleniumChallenge;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Interview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@name='login-button']")).click();
		
		String actualResult=driver.getTitle();
		System.out.println(actualResult);
		String expectedResult=driver.findElement(By.xpath("//div[contains(text(),'Swag Labs')]")).getText();
		//String expectedResult= driver.findElement(By.xpath(""));
		Assert.assertEquals(actualResult, expectedResult);
		System.out.println("Landed in homepage");
		
		
	}

}
