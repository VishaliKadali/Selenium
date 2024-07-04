package week2.day2.classroom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.leafground.com/select.xhtml");
		driver.manage().window().maximize();
		
		WebElement eleAT = driver.findElement(By.className("ui-selectonemenu"));
		
		Select dd = new Select(eleAT);
		
//		dd.selectByIndex(1);
		
//		dd.selectByVisibleText("Playwright");

//		dd.selectByValue("");
//		
//		dd.getFirstSelectedOption();
		
		List<WebElement> dropdownoptions = dd.getOptions();
		//dd.selectByIndex(dropdownoptions.size()-2);
		for (int i = 0; i < dropdownoptions.size(); i++) {
			WebElement eachOption = dropdownoptions.get(i);
			String text = eachOption.getText();
			System.out.println(text);
		}
		
		dd.selectByIndex(dropdownoptions.size()-2);
	}



}
