package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDragRow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/drag.xhtml");
		WebElement source=driver.findElement(By.xpath("(//table)[6]//tr[2]"));
		WebElement target=driver.findElement(By.xpath("(//table)[6]//tr[4]"));
		
		Point location = target.getLocation();
		int x = location.getX();
		int y = location.getY();
		
		Actions builder=new Actions(driver);
		//builder.dragAndDropBy(source, x, y).perform();
		//builder.clickAndHold(target).moveByOffset(x, y).release().perform();
		
	}

}
