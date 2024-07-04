package SeleniumChallenge;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class AutoSuggestions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		// Run without opening the chrome browser
		// options.addArguments("--headless");

		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(20));
		List<WebElement> frames = driver.findElements(By.tagName("frame"));
		int framescount = frames.size();
		System.out.println(framescount);
		// driver.switchTo().frame(0);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys("Australia");
		//driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys(Keys.ARROW_DOWN);
		//driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys(Keys.ENTER);

		/*
		 * WebElement button =
		 * driver.findElement(By.xpath("(//input[@value='Google Search'])[2]")); if
		 * (button.isDisplayed()) { button.click();
		 * 
		 * }
		 */
		// driver.switchTo().defaultContent();
		Thread.sleep(500);
		// Shadow shadow=new Shadow(driver);
		/*
		 * shadow.findElementByXPath("//input[@class='gLFyf']").sendKeys("Australia");
		 * shadow.findElementByXPath("//input[@class='gLFyf']").sendKeys(Keys.ARROW_DOWN
		 * ); shadow.findElementByXPath("//input[@class='gLFyf']").sendKeys(Keys.ENTER);
		 */

		Thread.sleep(3000);
		List<WebElement> auto = driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		// wait.until(ExpectedConditions.visibilityOfAllElements(auto));

		int count = auto.size();
		System.out.println(count);
		auto.get(count - 1).click();
		Thread.sleep(1000);
		/*
		 * Thread.sleep(500);
		 * driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys(
		 * "Australia");
		 * driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys(Keys.
		 * ARROW_DOWN);
		 * driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys(Keys.
		 * ENTER); Thread.sleep(1000);
		 */
		driver.close();
		

	}

}
