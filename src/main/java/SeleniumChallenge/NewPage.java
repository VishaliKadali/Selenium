package SeleniumChallenge;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.collections4.Get;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--disable-notifications");
		options.addArguments("disable-popup-blocking");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://www.decathlon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(20));
		/*
		 * driver.findElement(By.xpath("//button[@class='absolute top-0 right-0 m-3']"))
		 * .click(); //driver.switchTo().frame(0);
		 * driver.findElement(By.xpath("//span[.='Women']")).click(); Set<String>
		 * windows=driver.getWindowHandles(); List<String> ListOfWindow=new
		 * ArrayList<>(windows); driver.switchTo().window(ListOfWindow.get(1));
		 * Thread.sleep(3000); driver.switchTo().frame(0); driver.findElement(By.
		 * xpath("//picture[@class='relative overflow-hidden block ']")).click();
		 */
		driver.findElement(By.xpath("//button[@class='absolute top-0 right-0 m-3']")).click();
		//driver.switchTo().frame(0);
		//driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Tshirts");
		
		/*List<WebElement> findElements = driver.findElements(By.xpath("//h5[.='COLLECTIONS']/following::li/div/p"));
		int count=findElements.size();
		System.out.println(count);
		for (WebElement element : findElements) {
			String text=element.getText();
			System.out.println(text);
		}
		//int count=findElements.size();
		//System.out.println(count);
		//findElements.get(count-2).click();
		driver.findElement(By.xpath("//h5[.='COLLECTIONS']/following::ul/li")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//h5[.='COLLECTIONS']/following::ul/li")).sendKeys(Keys.ENTER);*/
		//WebElement tshirt= driver.findElement(By.xpath("//p[contains(text(),'Women T-Shirt')]"));
		
		/*
		 * JavascriptExecutor js=(JavascriptExecutor) driver;
		 * js.executeScript("arguments[0].click();", tshirt); Thread.sleep(1000);
		 */
		Thread.sleep(500);
		
		//driver.switchTo().frame(0);
		driver.findElement(By.xpath("//button[@class='flex items-center']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[contains(text(),'Women')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),\"Women T-Shirts\")]")).click();
		Thread.sleep(2000);
		//driver.switchTo().frame(1);
		int frameCount=driver.findElements(By.tagName("iframe")).size();
		System.out.println(frameCount);
		/*
		 * Set<String> windows=driver.getWindowHandles(); List<String> childWindow=new
		 * ArrayList<>(windows); driver.switchTo().window(childWindow.get(0));
		 */
		//WebElement frameID=driver.findElement(By.id("wiz-iframe-intent"));
		//driver.switchTo().frame(frameID);
		//WebElement frame=driver.findElement(By.xpath("//iframe[@id=\"wiz-iframe-intent\"]"));
		//driver.switchTo().frame(frame);
		
		//int frameCount1=driver.findElements(By.tagName("iframe")).size();
		//System.out.println(frameCount1);
		//WebElement popup=driver.findElement(By.xpath("//span[@class=\"CT_InterstitialClose\"]"));
		Thread.sleep(1000);
		//WebElement popup=driver.findElement(By.xpath("//span[contains(text(),'×')]"));
		/*
		 * boolean popup=driver.findElement(By.xpath(
		 * "//div[@class='CT_InterstitialContents']/following::span")).isDisplayed();
		 * if(popup) {
		 * //driver.findElement(By.xpath("//span[contains(text(),'×')]")).click();
		 * JavascriptExecutor js=(JavascriptExecutor) driver;
		 * js.executeScript("arguments[0].click();", popup); }
		 */
		//driver.switchTo().alert().dismiss();
		//System.out.println(driver.findElement(By.xpath("//div[@class='CT_InterstitialContents']/following::span")).getAttribute("span"));
		/*
		 * WebElement iframe=driver.findElement(By.tagName("iframe"));
		 * driver.switchTo().frame(iframe);
		 */
		//driver.switchTo().frame(1);
		//WebElement iframe=driver.findElement(By.xpath("//iframe[@id='wiz-iframe-intent']"));
		
		if(driver.findElement(By.id("wiz-iframe-intent")).isDisplayed()) {
			driver.switchTo().frame("wiz-iframe-intent");
			driver.findElement(By.xpath("//span[contains(text(),'×')]")).click();
			driver.switchTo().defaultContent();	
			Thread.sleep(500);
		}
		
		List<WebElement> Tshirts = driver.findElements(By.xpath("//li[@class='ais-Hits-item']"));
		for(int i=0;i<=Tshirts.size();i++) {
			if(i==5) {
				driver.findElement(By.xpath("//li[@class='ais-Hits-item']")).click();
			}
			
		}
			Thread.sleep(500);
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
			//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'ADD TO CART')]")));
			Thread.sleep(5000);
			driver.findElement(By.xpath("//div[@class='flex flex-col w-1/2 mb-2 md:w-auto']/div/div[contains(text(),'M')]")).click();
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'ADD TO CART')]")));
			driver.findElement(By.xpath("//span[contains(text(),'ADD TO CART')]")).click();	
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'GO TO CART')]")));
			driver.findElement(By.xpath("//span[contains(text(),'GO TO CART')]")).click();
			WebElement unavailableProduct=driver.findElement(By.xpath("//span[contains(text(),'Sorry, item not available. Please change pincode')]"));
			if(unavailableProduct.isDisplayed()) {
				System.out.println("Click on change pincode");
			}
			//driver.findElement(By.xpath("//p[.='Cart']")).click();
			driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
			
		
	}

}
