package SeleniumChallenge;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mahindra {

ChromeDriver driver;
@BeforeMethod
public void launchBrowser() {
	WebDriverManager.chromedriver().setup();
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	driver = new ChromeDriver(options);
	driver.get("https://www.mahindra.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
@Test	
public void mahindra() {
		
		driver.findElement(By.xpath("(//div[@class='quick-links-div']/a)[1]")).click();
		String parentWindow=driver.getWindowHandle();
		System.out.println("Parent window" +parentWindow);
		String parentWindowTitle=driver.getTitle();
		System.out.println(parentWindowTitle);
		String ActualTitle="The Mahindra Group Official Website | Together We Rise";
		if(parentWindowTitle.equalsIgnoreCase(ActualTitle)) {
			System.out.println("Page is displayed");
		}
		Set<String> windowHandles=driver.getWindowHandles();
		List<String> windows=new ArrayList<>(windowHandles);
		System.out.println("windowHandles size" +windowHandles.size() );
		System.out.println(windows.size());
		for (String window : windows) {
			if(window!=parentWindow) {
				driver.switchTo().window(window);
				
			}
		}
		System.out.println("Switched to window");
	}

@AfterMethod
public void closeBrowser() {
	
	driver.close();
	//driver.quit();
}
}
