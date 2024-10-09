package SeleniumChallenge;

import java.time.Duration;
import java.util.Calendar;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager. chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Go to website
		driver.get("https://www.flydubai.com/en/");
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		//Accept the cookies
		//driver.findElement(By.xpath("//button[@title='Cookie Preferences']")).click();
        //driver.close();
		//Click Departure Place
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		WebElement ele=driver.findElement(By.xpath("//span[@class=' osano-cm-content__message osano-cm-message ']"));
		wait.until(ExpectedConditions.invisibilityOf(ele));
		//wait.until(ExpectedConditions.invisibilityOfElementLocated("//span[@class=' osano-cm-content__message osano-cm-message ']"));
		//wait.until(ExpectedConditions.invisibilityOf("//span[@class=' osano-cm-content__message osano-cm-message ']"));
		//JavascriptExecutor js = (JavascriptExecutor)driver;
	//	js.executeScript("arguments[0].click();", driver.findElement(By.xpath("//label[@for='airport-destination']")));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".airportPickerTo.makeBookingTo.mat-form-group"))).click();
		
		
		//Wait Dropdown and click the first city
		//driver.findElement(By.xpath("//label[@for='airport-destination']")).click();
	WebElement destination=	driver.findElement(By.xpath("//div[@class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary Mui-error MuiInputBase-fullWidth MuiInputBase-formControl MuiAutocomplete-inputRoot css-xxg0ci']"));
	destination.sendKeys("istanbul");
	destination.sendKeys(Keys.ENTER);
		//List<WebElement> toDestinations = driver.findElements(By.xpath("//ul[@id='DestinationAirlist']/li"));
		//WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(10));
		//wait1.until(ExpectedConditions.visibilityOfAllElements(toDestinations));
		
		//int destinationsCount=toDestinations.size();
		
		//  System.out.println(destinationsCount);
		  
		
		  
		//  toDestinations.get(destinationsCount-1).click();
		  
		  
		//  if (destinationsCount > 0) {
		//	  toDestinations.get(destinationsCount-1).sendKeys(Keys.Enter);
			//  toDestinations.get(destinationsCount - 1).click();
              // Get the last destination element
            //  WebElement lastDestination = toDestinations.get(destinationsCount - 1);
			 // WebElement lastDestination = toDestinations.get(0);
			//  wait.until(ExpectedConditions.elementToBeClickable(lastDestination)).click();
	        //    System.out.println("Clicked on the first destination.");
			  
             // lastDestination.click();
				  // Scroll the last destination element into view 
      //        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", lastDestination);
				  
				  // Add a short wait to ensure the element is ready to be clicked
				//  Thread.sleep(1000); 
				//  ((JavascriptExecutor)driver).executeScript("arguments[0].click();", lastDestination);
				 
             // lastDestination.click();
            //  Thread.sleep(2000);
              // Click the last destination element
             // lastDestination.click();
      //    } else {
     //         System.out.println("No destinations found.");
     //     }

			/*
			 * Actions action=new Actions(driver);
			 * action.moveToElement(driver.findElement(By.xpath("")))
			 */
//		  Actions action=new Actions(driver);
//		  
//		  WebElement ele2=toDestinations.get(destinationsCount-1);
//		  
//		 action.moveToElement(ele2).perform();
		  
		  
			/*
			 * toDestinations.get(destinationsCount - 1).sendKeys(Keys.DOWN);
			 * toDestinations.get(destinationsCount - 1).sendKeys(Keys.ENTER);
			 */
		  
		 //driver.findElement(By.xpath("(//span[contains(text(),' Dubai All Airports')])[2]")).click();
		  
		//js.executeScript("arguments[0].click();",toDestinations.get(1));
		//Wait the DatePicker Opens
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//div[@id='dateRangeTo']"))));
		
		//Click on date picker
		driver.findElement(By.xpath("//div[@id='dateRangeTo']")).click();
		
		//This are the cell of the from date picker table for departure. Get all elements.
		//List<WebElement> cellsOfDepartureDate = 
				//wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='lightpick__day is-available']")));
		List<WebElement> cellsOfDepartureDate = driver.findElements(By.xpath("//div[@class='lightpick__day is-available']"));
		
		
		/*
		 * for (WebElement eachDepartureDate : cellsOfDepartureDate) {
		 * 
		 * System.out.println(eachDepartureDate.getText()); }
		 */
		//Click the today for Departure
		DateUtil.clickGivenDay(cellsOfDepartureDate, DateUtil.getCurrentDay());
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='Calendar']")));
		driver.findElement(By.xpath("//img[@alt='Calendar']")).click();
		cellsOfDepartureDate.get(1).click();
		Thread.sleep(3000);
		//List<WebElement> cellsOfArrivalDate = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@class='booking-date-selected align-left']")));
		//Click the 4th day (element).
		////This are the cell of the from date picker table for arrival. Get all elements.
		List<WebElement> cellsOfArrivalDate = driver.findElements(By.xpath("//div[@class='lightpick__day is-available']"));
		cellsOfArrivalDate.get(4).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		System.out.println("Closing the browser");
		
		//driver.close();
	}

}
