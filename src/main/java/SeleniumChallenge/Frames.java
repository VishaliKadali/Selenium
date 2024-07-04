package SeleniumChallenge;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://leafground.com/frame.xhtml");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h5[contains(text(),' Click Me (Inside frame)')]//following-sibling::iframe")));
		WebElement frame=driver.findElement(By.xpath("//h5[contains(text(),' Click Me (Inside frame)')]//following-sibling::iframe"));
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//button[contains(text(),'Click Me')]")).click();
		//Come out of all frames
		driver.switchTo().defaultContent();
		List<WebElement> iframes=driver.findElements(By.tagName("iframe"));
		System.out.println(iframes.size());
		//To come back to 1 frame:  parent frame
		//driver.switchTo().parentFrame();
		
		
		
		WebElement frame1=driver.findElement(By.xpath("//h5[contains(text(),' Click Me (Inside Nested frame)')]//following-sibling::iframe"));
		driver.switchTo().frame(frame1);
		
		//Frame within a frame
		WebElement frame2=driver.findElement(By.xpath("//iframe[@id='frame2']"));
		driver.switchTo().frame(frame2);
		
		//driver.findElement(By.xpath("//button[contains(text(),'Count Frames')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Click Me')]")).click();
		
		String clickedonbutton=driver.findElement(By.xpath("//button[contains(text(),'Hurray! You Clicked Me.')]")).getText();
		
		System.out.println(clickedonbutton);
		driver.switchTo().defaultContent();
		driver.close();
		
		
		
		
		
		
	}

}
