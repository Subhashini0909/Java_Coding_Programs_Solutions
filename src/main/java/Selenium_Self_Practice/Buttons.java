package Selenium_Self_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttons {

	public static void main(String[] args) 
	{
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://testautomationcentral.com/demo/buttons.html");
		
		driver.findElement(By.xpath("//div//button[@data-target='basic-button']")).click();
		driver.findElement(By.xpath("//div//button[text()='Click Me']")).click();
		
		driver.findElement(By.xpath("//div//button[@data-target='submit-button']")).click();
		driver.findElement(By.xpath("//div//button[text()='Submit']")).click();
		
		driver.findElement(By.xpath("//div//button[@data-target='reset-button']")).click();
		driver.findElement(By.xpath("//div//button[text()='Reset']")).click();
		
		driver.findElement(By.xpath("//div//button[@data-target='icon-button']")).click();
		driver.findElement(By.xpath("//button[contains(@class, 'bg-purple-500') and contains(@class, 'text-white')]")).click();
		String text = driver.findElement(By.xpath("//p[@id='icon-message' and text()= 'Icon button clicked']")).getText();
		System.out.println(text);
		
		driver.findElement(By.xpath("//div//button[@data-target='disabled-button']")).click();
		boolean disabled = driver.findElement(By.xpath("//div//button[text()='Disabled']")).isEnabled();
		System.out.println(disabled);
		

		
		

	}

}
