package week4.day1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeSnap {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		//options.addArguments("--headless");
		
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		
		File source=driver.getScreenshotAs(OutputType.FILE);
		File destination=new File("./snaps/snapshot.png");
		FileUtils.copyFile(source, destination);
		
		driver.close();
	}

}
