package SeleniumChallenge;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DisableImages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		disableImagesChrome(options);
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
	}
	
	public static ChromeOptions disableImagesChrome(ChromeOptions options) {
		HashMap<String, Object> imagesMap=new HashMap<String, Object>();
		imagesMap.put("images", 2);
		HashMap<String, Object> prefsMap=new HashMap<String, Object>();
		prefsMap.put("profile.default_content_setting_values", imagesMap);
		
		options.setExperimentalOption("prefs", prefsMap);
		
		return options;
	}

}
