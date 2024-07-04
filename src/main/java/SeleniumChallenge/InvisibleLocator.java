package SeleniumChallenge;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InvisibleLocator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.dbs.com.sg/personal/marketplaces/landing/main-home");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[contains(text(),'Our Marketplaces')]")).click();
		//WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(5));
		// wait1.until(ExpectedConditions.visibilityOf(By.xpath("//input[@id='hotelDestination-input']")));

		Actions builder = new Actions(driver);
		WebElement Travel = driver.findElement(By.xpath("//div[.='Travel/Leisure']"));
		builder.moveToElement(Travel).perform();
		driver.findElement(By.xpath("//a[.='Hotel']")).click();
		driver.findElement(By.xpath("//input[@id='hotelDestination-input']")).sendKeys("Singapore");
		List<WebElement> findElements = driver.findElements(By.xpath("//li/div/div[@class='item-value-name']"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfAllElements(findElements));
		int count = findElements.size();
		System.out.println(count);
		String lastEle = findElements.get(count - 1).getText();
		System.out.println(lastEle);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", findElements.get(count - 1));
		System.out.println("Clicked on element");
		driver.findElement(By.xpath("//input[@value='Search Hotels']")).click();
		String actual = driver.getTitle();
		System.out.println("Actual: " +actual);
		String expected = driver.findElement(By.xpath("//title[contains(text(),'DBS Singapore')]")).getText();
		Assert.assertEquals(actual, expected);
		System.out.println("Results found for the search criteria ");

	}

}
