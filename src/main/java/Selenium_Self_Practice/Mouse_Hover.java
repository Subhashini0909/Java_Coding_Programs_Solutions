package Selenium_Self_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hover {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement Fashion= driver.findElement(By.xpath("//div[@aria-label='Fashion']"));
		
		Actions builder = new Actions(driver);
		builder.moveToElement(Fashion).build().perform();
		
		driver.quit();
	}

}
