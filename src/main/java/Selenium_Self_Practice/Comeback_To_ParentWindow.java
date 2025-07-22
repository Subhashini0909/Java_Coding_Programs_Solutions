package Selenium_Self_Practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Comeback_To_ParentWindow {

	public static void main(String[] args) throws InterruptedException 
	{
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.findElement(By.id("name")).sendKeys("Subha");
		
		driver.findElement(By.id("newWindowBtn")).click();
		
		String parent = driver.getWindowHandle();
		System.out.println("Parent: " + driver.getTitle() +" " +  driver.getCurrentUrl());
		
		Set<String> new_window = driver.getWindowHandles();
		for(String windows : new_window)
		{
			if(!windows.equals(new_window))
			{
				driver.switchTo().window(windows);
				driver.manage().window().maximize();	
			}
		}
		System.out.println("Child: " + driver.getTitle() +" " +  driver.getCurrentUrl());
		
		driver.switchTo().window(parent);
		System.out.println("Parent: " + driver.getTitle() +" " +  driver.getCurrentUrl());
		
	WebElement text_Box = driver.findElement(By.id("name"));
	text_Box.clear();
	text_Box.sendKeys("Subhashini");
		
		Thread.sleep(5000);
		driver.quit();

	}

}
