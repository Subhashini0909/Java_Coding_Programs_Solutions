package Selenium_Self_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Date_Picker {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/");
		
		
		driver.switchTo().frame(0);
		WebElement date = driver.findElement(By.id("datepicker"));
		date.click();
		
		date.sendKeys("09/09/2000");
		

	}

}
