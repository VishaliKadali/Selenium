package SeleniumChallenge;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Indigo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.goindigo.in/");
		driver.findElement(By.xpath("//input[@name='passenger']")).click();
		driver.findElement(By.xpath("(//button[@title='Increase children passenger count'])[1]")).click();
		driver.close();
	}

}
