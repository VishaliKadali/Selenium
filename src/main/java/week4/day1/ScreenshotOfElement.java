package week4.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotOfElement {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		//ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ele=driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c']/preceding::button)[1]"));
		File src=ele.getScreenshotAs(OutputType.FILE);
		File des=new File("./snaps/snapshot.png");
		FileUtils.copyFile(src, des);
		driver.close();
	}

}
