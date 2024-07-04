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
		Thread.sleep(2000);
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
		/*
		 * WebElement ele=driver.findElement(By.xpath("(//table[contains(@class,'DataTable')])[1]//tr/td[2]/a"));
		 * Thread.sleep(3000); System.out.println(ele.getText());
		 */
		List<WebElement> ele=driver.findElements(By.xpath("(//table[contains(@class,'DataTable')])[1]//tr/td[2]/a"));
		Thread.sleep(3000);
		int count=ele.size();
		System.out.println(count);
		
		List<String> list=new ArrayList<String>();
		for(int i=0;i<=ele.size()-1;i++) {
			list.add(ele.get(i).getText());
			//System.out.println(" ");
		}
		
		System.out.println(list);
		//List<WebElement> trainNamesEles=driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//td[2]"));
		//System.out.println("Train names " +trainNamesEles.size());
		
		//int count=trainNamesEles.size();
		
		//System.out.println(count);
		/*
		 * List<WebElement> trainNames=new ArrayList<WebElement>();
		 * 
		 * for (WebElement trainName : trainNamesEles) {
		 * 
		 * String text=trainName.getText();
		 * 
		 * System.out.println(text);
		 * 
		 * }
		 */
		
}
}