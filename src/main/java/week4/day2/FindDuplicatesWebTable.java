package week4.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindDuplicatesWebTable {

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
			Thread.sleep(2000);
			List<WebElement> trainNameElements = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//td[2]"));
			
			List<String> trainNames=new ArrayList<String>();
			
			for (WebElement eachEle : trainNameElements) {
				String text=eachEle.getText();
				trainNames.add(text);
				
			}
			System.out.println(trainNames);
			Set<String> trains = new HashSet<String>(trainNames);
			
			
			if(trainNames.size()==trains.size()) {
				System.out.println("No Duplicates");
				
			}
			
			else {
				
				System.out.println("There are duplicates");
			}
		}
	}


