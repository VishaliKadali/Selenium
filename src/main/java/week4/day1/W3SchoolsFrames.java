package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class W3SchoolsFrames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10));
		driver.switchTo().frame("iframeResult");
		System.out.println("Switched to frame");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Try it')]")));
		Thread.sleep(1000);
		//System.out.println(driver.findElement(By.xpath("//h2[.='My First JavaScript']//following-sibling::button")).getAttribute("type"));
		driver.findElement(By.xpath("//button[contains(text(),'Try it')]")).click();
		Alert alert=driver.switchTo().alert();
		alert.sendKeys("Vishali");
		alert.accept();
		String verificationText=driver.findElement(By.xpath("//p[@id='demo']")).getText();
		System.out.println(verificationText);
		driver.close();
	}

}
