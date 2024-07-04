package week4.day1;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IRCTC {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		//options.addArguments("--headless");
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//button[.='OK']")).click();
		//driver.switchTo().alert().acscept();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[@class='menu-list header-icon-menu']/following::a[.=' FLIGHTS ']")).click();
		
		String parentHandle=driver.getWindowHandle();
		System.out.println(parentHandle);
		
		Set<String> windowHandles=driver.getWindowHandles();
		List<String> windows=new ArrayList<String>(windowHandles);
		
		//Get the count of window handles 
		System.out.println(windows.size());
		
		//Get current window title
		String title=driver.getTitle();
		System.out.println(title);
		
		//Switch to new tab
		driver.switchTo().window(windows.get(1));
		
		//Get title of new tab
		System.out.println(driver.getTitle());
		
	}

}
