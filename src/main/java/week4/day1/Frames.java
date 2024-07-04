package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://leafground.com/frame.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Switch to frame
		WebElement frame1=driver.findElement(By.xpath("//h5[text()=' Click Me (Inside frame)']/following-sibling::iframe"));
		driver.switchTo().frame(frame1);
		
		driver.findElement(By.xpath("//button[text()='Click Me']")).click();
		String elementClick=driver.findElement(By.xpath("//button[text()='Hurray! You Clicked Me.']")).getText();
		System.out.println(elementClick);
		
		//To get back to the main menu
		driver.switchTo().defaultContent();
	
		
		//Switch to frame2
		driver.switchTo().frame(1);
		String frame2=driver.findElement(By.xpath("//button[text()='Count Frames']")).getText();
		System.out.println(frame2);
		driver.switchTo().defaultContent();
		
		//NEsted frame
		WebElement nestedFrame1=driver.findElement(By.xpath("//h5[text()=' Click Me (Inside Nested frame)']/following-sibling::iframe"));
		
		
		//Switch to nested frames
		driver.switchTo().frame(nestedFrame1);
		WebElement nestedFrame2=driver.findElement(By.xpath("//iframe[@id='frame2']"));
		driver.switchTo().frame(nestedFrame2);
		driver.findElement(By.xpath("//button[text()='Click Me']")).click();
		String nestedFrameText=driver.findElement(By.xpath("//button[text()='Hurray! You Clicked Me.']")).getText();
		System.out.println(nestedFrameText);
		driver.switchTo().defaultContent();
		driver.close();
		//to get back of one frame
		//driver.switchTo().parentFrame();
		
		
		
	}

}
