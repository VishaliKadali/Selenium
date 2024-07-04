package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

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
		options.addArguments("--disable-notifications");
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
		
		Thread.sleep(2000);
		WebElement firstShirt=driver.findElement(By.xpath("(//img[@class='product-image '])[1]"));
		
		builder.moveToElement(firstShirt)
		.perform();
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'Quick View')]")));
		driver.findElement(By.xpath("//div[contains(text(),'Quick View')]")).click();
		
		
		/*
		 * String parentWindow=driver.getWindowHandle();
		 * System.out.println(parentWindow); Set<String> windowHandles =
		 * driver.getWindowHandles(); List<String> windows=new
		 * ArrayList<>(windowHandles);
		 * 
		 * for(int i=0;i<= windows.size();i++) {
		 * 
		 * if(i!=0) { driver.switchTo().window(windows.get(1)); } else {
		 * driver.switchTo().window(windows.get(0));
		 * System.out.println("Switched to parent window"); } }
		 */
		driver.findElement(By.xpath("//div[text()='Size']/following::a")).click();
		//driver.close();
	
	
	}

}
