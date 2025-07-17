package Selenium_Self_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationcentral.com/demo/radiobuttons.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//label//span[text()='Option C']")).click();
		
		driver.findElement(By.xpath("//label//span[text()='Styled Option A']")).click();
		
		driver.quit();

	}

}
