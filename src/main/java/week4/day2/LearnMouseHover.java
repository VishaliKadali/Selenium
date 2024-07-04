package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnMouseHover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--Disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		// ChromeDriver driver=new ChromeDriver();

		driver.get("https://www.myntra.com");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		
		WebElement menEle=driver.findElement(By.xpath("//a[contains(text(),'Men')]"));
		
		Actions builder=new Actions(driver);
		builder.moveToElement(menEle).perform();
		
		WebElement tshirts=driver.findElement(By.xpath("//a[contains(text(),'T-Shirts')]"));
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(tshirts));
		
		builder.moveToElement(tshirts).perform();
		//tshirts.click();
		Thread.sleep(500);
		System.out.println("Clicked on Tshirts");
		Thread.sleep(1000);
		driver.close();
	}

}
