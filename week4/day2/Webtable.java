package week4.day2;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webtable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		//ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://erail.in/");
		
		WebElement fromStation=driver.findElement(By.xpath("//input[@id='txtStationFrom']"));
		fromStation.clear();
		fromStation.sendKeys("MAS");
		fromStation.sendKeys(Keys.ENTER);
		
		
		WebElement toStation=driver.findElement(By.xpath("//input[@id='txtStationTo']"));
		toStation.clear();
		toStation.sendKeys("CBE");
		Thread.sleep(2000);
		toStation.sendKeys(Keys.ENTER);
		
		boolean Checked=driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']")).isSelected();
		if(Checked==true) {
			
			driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']")).click();
			
		}
		
		else {
			
			System.out.println("Sort on Date is already unchecked");
		}
		
		List<WebElement> trainNamesEles=driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//td[2]"));
		List<WebElement> trainNames=new ArrayList<WebElement>();
		System.out.println(trainNamesEles.size());
		for (WebElement trainName : trainNames) {
			
			String text=trainName.getText();
			
			System.out.println(text);
			
		}
		
}
}