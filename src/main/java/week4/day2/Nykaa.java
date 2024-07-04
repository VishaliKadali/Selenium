package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Nykaa {

	public static WebDriverWait wait;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver(options);
		
		//Launch the url
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Mousehover on the brands
		WebElement findElement=driver.findElement(By.xpath("//a[contains(text(),'brands')]"));
		Actions action=new Actions(driver);
		action.moveToElement(findElement).build().perform();
		
		//Click on Loreal paris and get the page title
		driver.findElement(By.xpath("//img[contains(@src,'lorealparis')]")).click();
		
		if(driver.getTitle().contains("L'Oreal Paris")) {
			System.out.println("Title contains Paris");
			
		}
		else {
			System.out.println("Title doesn't contain Paris");
		}
		
		driver.findElement(By.xpath("//span[contains(text(),'Sort By : popularity')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'customer top rated')]")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement ele0=driver.findElement(By.xpath("//span[contains(text(),'Category')]"));
		js.executeScript("window.scrollBy(0,250)", ele0);
		driver.findElement(By.xpath("//span[contains(text(),'Category')]")).click();
		Thread.sleep(2000);
		
		//WebElement element2=driver.findElement(By.xpath("(//span[@class='filter-name '])[1]"));
		//js.executeScript("window.scrollBy(0,250)", element2);
		//Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[contains(text(),'Hair')])[3]")).click();
		//WebElement element=driver.findElement(By.xpath("(//span[@class='filter-name ']//parent::div)[1]"));
		
		//js.executeScript("window.scrollBy(0,250)", element);
		driver.findElement(By.xpath("(//span[contains(text(),'Hair Care')])[2]")).click();
		//Thread.sleep(1000);
		String text=driver.findElement(By.xpath("//span[contains(text(),'Shampoo')]")).getText();
		System.out.println(text);
		if(text.contains("Shampoo")) {
			System.out.println("It contains shampoo");
		}
		else {
			System.out.println("It doesnt contain shampoo");
		}
		driver.findElement(By.xpath("//span[contains(text(),'Shampoo')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Concern')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Color Protection')]")).click();
		//driver.findElement(By.xpath("//div[contains(text(),'Colour Protect Shampoo')]")).click();
		//Go to the new window and select size
		//Click on preview 
		//Print the MRP of the 
		
		String text2=driver.findElement(By.xpath("//span[contains(text(),'MRP:')]")).getText();
		System.out.println(text2);
		String text3=driver.findElement(By.xpath("(//span[contains(text(),'MRP:')]//following::span)[1]")).getText();
		System.out.println("Price of the product is : "+text3);
		driver.findElement(By.xpath("//div[contains(text(),' Paris Colour Protect Shampoo')]")).click();
		Set<String> winSet=driver.getWindowHandles();
		List<String> winList=new ArrayList<String>(winSet);
		
		driver.switchTo().window(winList.get(1));
		
		//driver.findElement(By.xpath("//button[contains(text(),'Preview Size')]")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("//span[@class='cart-count']//parent::button")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Proceed')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'CONTINUE AS GUEST')]")).click();
		

	
	}

}
