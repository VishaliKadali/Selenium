package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDroppable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--Disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		// ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://jqueryui.com/droppable");
		driver.switchTo().frame(0);
		
		Actions action=new Actions(driver);
		
		WebElement dragElement=driver.findElement(By.id("draggable"));
		WebElement dropElement=driver.findElement(By.id("droppable"));
		
		//Drap and Drop
		action.dragAndDrop(dragElement, dropElement).perform();
		
		
		
	}

}
