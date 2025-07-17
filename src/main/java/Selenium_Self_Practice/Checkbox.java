package Selenium_Self_Practice;
import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class Checkbox {

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://testautomationcentral.com/demo/checkboxes.html");
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement CheckBox = driver.findElement(By.xpath("//label//span[text()=\"Option 2\"]"));
		CheckBox.click();
		driver.quit();

	}

}
