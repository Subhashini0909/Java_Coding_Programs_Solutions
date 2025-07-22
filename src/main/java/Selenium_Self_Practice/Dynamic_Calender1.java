package Selenium_Self_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Calender1 {

	public static void main(String[] args) {
		
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://jqueryui.com/datepicker/");
//		
//		
//		driver.switchTo().frame(0);
//		WebElement date = driver.findElement(By.id("datepicker"));
//		date.click();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://jqueryui.com/datepicker/");
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));

		driver.findElement(By.id("datepicker")).click(); // Step 1: Open calendar

		// Step 2: Navigate to desired month/year (optional – skip if already visible)
		String ele = driver.findElement(By.className("ui-datepicker-title")).getText();
		while(!ele.contains("2024") && !ele.contains("August"))
		{
			driver.findElement(By.className("ui-datepicker-prev")).click();
		}

		// Step 3: Pick the date
		driver.findElement(By.xpath("//a[text()='15']")).click(); // Select 15th

		//driver.quit();
		
		

	}

}
