package week3.assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeContact {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		//driver.get("http://leaftaps.com/opentaps/");
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[.='Contacts']")).click();
		driver.findElement(By.xpath("//a[.='Merge Contacts']")).click();
		driver.findElement(By.xpath("(//img[@src='/images/fieldlookup.gif'])[1]")).click();
		Set<String> windowHandles =driver.getWindowHandles();
		//Create an empty list to store window handles in order to get window handles in order
		List<String> winList=new ArrayList<String>(windowHandles);
		//Now get into the first window
		driver.switchTo().window(winList.get(1));
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")).click();
		Thread.sleep(1000);
		driver.switchTo().window(winList.get(0));
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//img[@src='/images/fieldlookup.gif'])[2]")).click();
		Thread.sleep(1000);
		//Get window handles
		Set<String> windowHandles2=driver.getWindowHandles();
		//Create an empty list to store window handles inroder to get window handles in order
		
		List<String> winList2=new ArrayList<String>(windowHandles2);
		driver.switchTo().window(winList2.get(1));
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[2]/a")).click();
		driver.switchTo().window(winList2.get(0));
		driver.findElement(By.xpath("//a[.='Merge']")).click();
		
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		String title=driver.getTitle();
		if(title.contains("View Contact")) {
			System.out.println("Passed");
		}
		else {
			System.out.println("Failed");
		}
		driver.close();
	}

}
