package Selenium_Self_Practice;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class Checkbox {

	public static void main(String[] args) 
	{
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationcentral.com/demo/checkboxes.html");
		
		WebElement CheckBox = driver.findElement(By.xpath("//label//span[text()=\"Option 2\"]"));
		CheckBox.click();

	}

}
