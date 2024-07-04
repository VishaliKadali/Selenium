package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDoubleClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--Disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		// ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick");
		
		
		Thread.sleep(1000);
		Actions builder=new Actions(driver);
		driver.switchTo().frame("iframeResult");
		WebElement element=driver.findElement(By.xpath("//button[text()='Double-click me']"));
		builder.doubleClick(element).perform();
		String doubleClickConfirmation=driver.findElement(By.xpath("//p[text()='Hello World']")).getText();
		if(doubleClickConfirmation.contains("Hello World")) {
			System.out.println("Double clicked on the element");
		}
		else {
			System.out.println("Failed to click on the element");
		}
		driver.close();
	}

}
