package Selenium_Self_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBox {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://testautomationcentral.com/demo/textboxes.html");
		
		driver.findElement(By.xpath("//button[text()='Simple Textbox']")).click();
		driver.findElement(By.xpath("//div[@id=\"simple-textbox\"]//input[@placeholder='Enter text']")).sendKeys("Subha");
		
		driver.findElement(By.xpath("//button[text()='Password Textbox']")).click();
		driver.findElement(By.xpath("//div[@id=\"password-textbox\"]//input[@placeholder='Enter password']")).sendKeys("Subha@0909");
		
		driver.findElement(By.xpath("//button[text()='Read-Only Textbox']")).click();
		String readonly = driver.findElement(By.xpath("//div//input[@value='Read-only text']")).getAttribute("readonly");
		System.out.println(readonly);
		
		driver.findElement(By.xpath("//button[text()='Disabled Textbox']")).click();
		boolean disabled = driver.findElement(By.xpath("//div//input[@value='Disabled text']")).isEnabled();
		System.out.println(disabled);
		

	}

}
