package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chitogarh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		
		//ChromeDriver driver=new ChromeDriver();
		
		//Launch the url
		driver.get("https://www.chittorgarh.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Click on stock markets
		driver.findElement(By.xpath("//a[@title='Stock Market']")).click();
		driver.findElement(By.xpath("//a[text()='NSE Bulk Deals']")).click();
		
		//driver.findElement(By.xpath("(//a[.='NSE Bulk Deals'])[1]")).click();
		
		//List<WebElement> security=driver.findElements(By.xpath("//table[@class='table table-bordered table-condensed table-striped']//td[3]"));
		
		List<WebElement> security = driver.findElements(By.xpath("//table[@class='table table-bordered table-striped table-hover w-auto']/tbody/tr"));
		List<String> list=new ArrayList<String>();
		for(int i=0; i<=security.size()-1;i++) {
		list.add(security.get(i).getText());
			
		}
		System.out.println(list);
		//Pass in set inorder to remove duplicates
		
		Set<String> set=new HashSet<String>(list);
		
		if(list.size()!=set.size()) {
			
			System.out.println("Contains duplicates");
		}
		else {
			System.out.println("Doesn't contain duplicates");
		}
	}

}
