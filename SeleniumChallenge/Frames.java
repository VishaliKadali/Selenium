package SeleniumChallenge;

import java.time.Duration;

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
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://leafground.com/frame.xhtml");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h5[contains(text(),' Click Me (Inside frame)')]//following-sibling::iframe")));
		WebElement frame=driver.findElement(By.xpath("//h5[contains(text(),' Click Me (Inside frame)')]//following-sibling::iframe"));
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//button[contains(text(),'Click Me')]")).click();
		//Come out of all frames
		driver.switchTo().defaultContent();

		//To come back to 1 frame:  parent frame
		driver.switchTo().parentFrame();
		
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//button[contains(text(),'Count Frames')]")).click();
		
		//Frame within a frame
		WebElement frame1=driver.findElement(By.xpath("//h5[.=' Click Me (Inside Nested frame)']"));
		driver.switchTo().frame(frame1);
		
		
	}

}
