 package interview;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class ShadowDom {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver(options);
		//ChromeDriver driver=new ChromeDriver();
		Thread.sleep(1000);
		driver.get("chrome://history");
		Thread.sleep(1000);
		Shadow dom=new Shadow(driver);
		String text=dom.findElementByXPath("//span[@id='time-accessed']").getText();
		System.out.println(text);
		//driver.close();
	}

}
