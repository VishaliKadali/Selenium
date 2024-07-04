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

public class LearnRightClick {

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
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		//Thread.sleep(1000);
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='right click me']")));
		
		//Right click on the element using contextclick
		Actions builder=new Actions(driver);
		WebElement element=driver.findElement(By.xpath("//span[text()='right click me']"));
		builder.contextClick(element).perform();
		
		//System.out.println("Right clciked on the element");
		
		//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(2));
		WebElement copyAction=driver.findElement(By.xpath("//span[text()='Copy']"));
		copyAction.click();
		//wait.until(ExpectedConditions.visibilityOf(copyAction));
		driver.switchTo().alert().accept();
		System.out.println("Clicked on the Ok button");
		driver.close();
		
		
	}

}
