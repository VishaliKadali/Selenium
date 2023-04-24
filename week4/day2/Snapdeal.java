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

public class Snapdeal {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//Escape sequence
		WebElement navigation=driver.findElement(By.xpath("//span[text()=\"Men's Fashion\"]"));
		
		//Click on shirts
		WebElement shirts=driver.findElement(By.xpath("//span[text()='Shirts']"));
		
		WebElement notification=driver.findElement(By.xpath("//button[text()='NOT NOW']"));
		if(notification.isDisplayed()) {
			notification. click();
		}
		Thread.sleep(500);
		Actions builder=new Actions(driver);
		builder.moveToElement(navigation)
		.pause(500)
		.click(shirts)
		.perform();
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'Quick View')]")));
		driver.findElement(By.xpath("//div[contains(text(),'Quick View')]")).click();
		
		driver.close();
	
	
	}

}
