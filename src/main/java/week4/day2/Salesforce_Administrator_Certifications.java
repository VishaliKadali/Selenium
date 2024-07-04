package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class Salesforce_Administrator_Certifications {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("vishalikadali@testleaf.com");
		driver.findElement(By.xpath("//input[@name='pw']")).sendKeys("vishalik@123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		driver.findElement(By.xpath("//span[.='Learn More']")).click();
		//Window handling
		Set<String> windowHandles=driver.getWindowHandles();
		
		//Create an empty List to inorder to get the order of windows
		List<String> winList1=new ArrayList<String>(windowHandles);
		
		driver.switchTo().window(winList1.get(1));
		driver.findElement(By.xpath("//button[@onClick='goAhead()']")).click();
		String title=driver.getTitle();
		System.out.println(title);
		
		//Switch to main window/parent window
		//driver.switchTo().window(winList1.get(0));
		//Closes the mainwindow/parent window
		//driver.close();
		
		Shadow dom=new Shadow(driver);
		dom.findElementByXPath("//span[text()='Learning']").click();
		WebElement learningOnTrailHead=dom.findElementByXPath("//span[text()='Learning on Trailhead']");
		Thread.sleep(4000);
		Actions builder =new Actions(driver);
		builder.moveToElement(learningOnTrailHead).perform();
		
		
		//Click on sales force certification
		WebElement salesForceCertification=dom.findElementByXPath("//a[text()='Salesforce Certification']");
		builder.scrollToElement(salesForceCertification).perform();
		salesForceCertification.click();
		
		//Click on certification administrator
		driver.findElement(By.xpath("//a[text()='Administrator']")).click();
		
		//Get the available certification text
		String text=driver.findElement(By.xpath("//div[contains(@class,'certification-banner_title')]")).getText();
		System.out.println(text);
		if(text.equals("Administrator")) {
			System.out.println("Verified");
		}
		else {
			System.out.println("Not verified");
		}
		
		}

}
