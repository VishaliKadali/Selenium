package week2.day2.classroom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class Myntra {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		//String driverPath=System.setProperty(null, null)
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--disable-notifications");
		WebDriver driver =new ChromeDriver(options);
		//ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com");
		driver.manage().window().maximize();
		WebElement men=driver.findElement(By.xpath("//a[.='Men']"));
		Actions action=new Actions(driver); 
		action.moveToElement(men).build().perform();
		Thread.sleep(1000);
		action.moveToElement(driver.findElement(By.xpath("(//a[.='Jeans'])[1]"))).build().perform();
		
		//driver.findElement(By.xpath("//a[.='Men']")).click();
		/*
		 * Shadow dom=new Shadow(driver);
		 * dom.findElementByXPath("(//a[.='Jeans'])[1]").click();
		 * dom.findElementByXPath("//label[contains(text(),'Flying Machine')]").click();
		 */
		
		/*
		 * Actions action=new Actions(driver); 
		 * action.moveToElement(men);
		 * 
		 * WebElement jeans=driver.findElement(By.xpath("(//a[.='Jeans'])[1]"));
		 * 
		 * action.moveToElement(jeans).perform();
		 * //driver.findElement(By.xpath("(//a[.='Jeans'])[1]")).click();
		 * driver.findElement(By.xpath("//label[contains(text(),'Flying Machine')]"));
		 * 
		 */
		
		driver.findElement(By.xpath("(//a[.='Jeans'])[1]")).click();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[contains(text(),'Flying Machine')]")));
		driver.findElement(By.xpath("//label[contains(text(),'Flying Machine')]")).click();
		Thread.sleep(1000);
		driver.close();

	}

}
