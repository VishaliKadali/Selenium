package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.leafground.com/window.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(20));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[contains(text(),'Open')]")).click();
		
		String parentWindow=driver.getWindowHandle();
		Set<String> windowHandles=driver.getWindowHandles();
		
		List<String>windows=new ArrayList<String>(windowHandles);
		System.out.println(windows.size());
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(windows.get(1));
		
		System.out.println(driver.getTitle());
		
		//driver.findElement(By.xpath(parentWindow));
		
		driver.switchTo().window(parentWindow);
		driver.switchTo().window(windows.get(0));
	}

	private static String windows(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
