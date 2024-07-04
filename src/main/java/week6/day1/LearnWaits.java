package week6.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWaits {
	@Test
	public void waits() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		//String driverPath=System.setProperty(null, null)
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("http://leafground.com/window.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='Open with delay']")).click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.numberOfWindowsToBe(3));
		Set<String> WindowHandles=driver.getWindowHandles();
		List<String> windows=new ArrayList<String>(WindowHandles);
		driver.switchTo().window(windows.get(1));
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.quit();
		/*
		 * WebElement username=driver.findElement(By.id("username"));
		 * username.sendKeys("DemoSalesManager");
		 * driver.findElement(By.id("password")).sendKeys("crmsfa");
		 * driver.findElement(By.className("decorativeSubmit")).click();
		 * 
		 * //Click on link driver.findElement(By.linkText("CRM/SFA")).click();
		 * 
		 * //Click on Leads tab driver.findElement(By.linkText("Create Lead")).click();
		 */
	}
}
