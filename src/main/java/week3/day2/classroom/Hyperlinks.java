package week3.day2.classroom;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hyperlinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		ChromeDriver driver = new ChromeDriver(options);

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// driver.findElement(By.xpath("//a[.='Create New Account']")).click();
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));

		// allLinks.size();

		System.out.println(allLinks.size());

		driver.close();
	}

}
