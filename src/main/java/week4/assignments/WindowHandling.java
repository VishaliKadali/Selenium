
package week4.assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		//ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/window.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[.='Open']")).click();
		Set<String> windowHandles=driver.getWindowHandles();
		List<String> winList=new ArrayList<String>(windowHandles);
		driver.switchTo().window(winList.get(1));
		String title=driver.getTitle();
		if(title.contains("Dashboard")) {
			
			System.out.println("New window opened");
		}
		
		else {
			System.out.println("New window not opened");
		}
		driver.close();
		
		//Switch to parent window
		driver.switchTo().window(winList.get(0));
		driver.findElement(By.xpath("//span[.='Open Multiple']")).click();
		
		//Get window handles
		Set<String> windowHandles2=driver.getWindowHandles();
		//Create a empty list in order to get the windows in order
		List<String> winlist2=new ArrayList<String>(windowHandles2);
		System.out.println(winlist2.size());
		driver.switchTo().window(winlist2.get(0));
		driver.findElement(By.xpath("//span[.='Close Windows']")).click();
		Set<String> windowHandles3=driver.getWindowHandles();
		List<String> winlist3=new ArrayList<String>(windowHandles3);
		System.out.println(winlist3.size());
		for(int i=0;i<=winlist3.size()-1;i++) {
			
			if(i!=0) {
				driver.switchTo().window(winlist3.get(i));
		
				driver.close();
			}
		}
	
		driver.switchTo().window(winlist3.get(0));
		
		driver.findElement(By.xpath("//span[.='Open with delay']")).click();
		
		//Wait until the window count is 3 including the main window
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.numberOfWindowsToBe(3));
		driver.switchTo().window(winlist3.get(0));
		//Set<String> windowHandles4=driver.getWindowHandles();
		
		//create an empty list in order to get the order of the windows
		//List<String> winlist4=new ArrayList<String>(windowHandles4);
		
	}

}
