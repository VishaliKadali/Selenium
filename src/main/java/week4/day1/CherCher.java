package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CherCher {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement frame1=driver.findElement(By.id("frame1"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//b[@id='topic']//following::input")).sendKeys("Learning Frames");
		//Switch to another frame
		WebElement frame3=driver.findElement(By.id("frame3"));
		driver.switchTo().frame(frame3);
		driver.findElement(By.xpath("//input[@id='a']")).click();
		//Come out of frame
		driver.switchTo().defaultContent();
		
		//Switch to frame and perform actions
		WebElement frame2=driver.findElement(By.id("frame2"));
		driver.switchTo().frame(frame2);
		
		WebElement drp=driver.findElement(By.xpath("//select[@id='animals']"));
		Select dropdown=new Select(drp);
		dropdown.selectByVisibleText("Avatar");
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		driver.close();
		
	}

}
