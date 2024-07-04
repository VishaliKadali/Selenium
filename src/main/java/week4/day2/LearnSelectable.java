package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSelectable {
	
	public static void main(String args[]) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--Disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		// ChromeDriver driver=new ChromeDriver();

		driver.get("https://jqueryui.com/selectable");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		Actions builder=new Actions(driver);
		WebElement item1=driver.findElement(By.xpath("//li[text()='Item 1']"));
		WebElement item3=driver.findElement(By.xpath("//li[text()='Item 3']"));
		builder.keyDown(Keys.CONTROL)
		.click(item1)
		//pause for few seconds
		.pause(Duration.ofSeconds(5))
		.click(item3)
		.keyUp(Keys.CONTROL)
		.perform();
	
	}
}
