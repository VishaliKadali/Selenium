package week4.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableWithForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--Disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		// ChromeDriver driver=new ChromeDriver();

		driver.get("https://leafground.com/table.xhtml");
		driver.manage().window().maximize();

//		String text=driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr[1]/td[1]")).getText();
//		System.out.println(text);

		List<WebElement> rows = driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr"));
		int rowCount = rows.size();
		System.out.println(rowCount);

		List<WebElement> columns = driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table//th"));
		int colCount = columns.size();
		System.out.println(colCount);

		for (int i = 1; i <= rowCount; i++) {
			for (int j = 1; j <= colCount; j++) {

				String value = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr[" + i + "]/td[" + j + "]")).getText();
				System.out.println(value);

			}

		}
		
		//Foreach loop prints all the table data(all the rows)
		for (WebElement eachRow : rows) {
			String text = eachRow.getText();
			System.out.println(text);
		}
	}

}
