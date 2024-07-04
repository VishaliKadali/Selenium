package week4.day1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertLeafGround {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		//ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml;jsessionid=node01uchomb9dxu9r44hnc5vr79fp344596.node0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c']/preceding::button)[1]")).click();
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c']/preceding::button)[2]")).click();
		driver.switchTo().alert().accept();
		String text=driver.findElement(By.xpath("//span[.='User Clicked : OK']")).getText();
		System.out.println(text);
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c']/preceding::button)[3]")).click();
		String text2=driver.findElement(By.xpath("//p[contains(text(),'You have clicked and open a dialog')]")).getText();
		System.out.println(text2);
		driver.findElement(By.xpath("(//span[.='Dismiss'])[2]")).click();
		
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c']/preceding::button)[5]")).click();
		//driver.findElement(By.xpath("//h5[contains(text(),'Sweet Modal Dialog')]/following::button")).click();
		
		driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-closethick']//ancestor::a)[2]")).click();
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c']//ancestor::button)[6]")).click();
		driver.switchTo().alert().sendKeys("Vishali");
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c']//ancestor::button)[7]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Yes')]/ancestor::button")).click();
		driver.findElement(By.xpath("(//a[@aria-label='Close'])[2]")).click();
		
		driver.findElement(By.xpath("(//h5[.='Minimize and Maximize']/following::button)[1]")).click();
		driver.findElement(By.xpath("(//span[.='Min and Max']/following::a)[3]")).click();
		
		//Maximize
		driver.findElement(By.xpath("(//span[.='Min and Max']/following::a)[2]")).click();
		//Thread.sleep(500);
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[.='Min and Max']/following::a)[1]")));
		//Close
		driver.findElement(By.xpath("(//span[.='Min and Max']/following::a)[1]")).click();
		driver.close();
	}

}
