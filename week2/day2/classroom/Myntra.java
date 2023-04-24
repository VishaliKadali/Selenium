package week2.day2.classroom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Myntra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		//String driverPath=System.setProperty(null, null)
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver =new ChromeDriver(options);
		//ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com");
		driver.manage().window().maximize();
		WebElement men=driver.findElement(By.xpath("//a[.='Men']"));
		
		Actions action=new Actions(driver);
		action.moveToElement(men);
		
		WebElement jeans=driver.findElement(By.xpath("(//a[.='Jeans'])[1]"));
		
		action.moveToElement(jeans).build().perform();
		//driver.findElement(By.xpath("(//a[.='Jeans'])[1]")).click();
		driver.findElement(By.xpath("//label[contains(text(),'Flying Machine')]"));
		driver.close();

	}

}
