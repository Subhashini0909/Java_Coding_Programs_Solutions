package Selenium_Self_Practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) 
	{
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.findElement(By.id("name")).sendKeys("Subha");
		
		driver.findElement(By.id("newWindowBtn")).click();
		String new_window = driver.getWindowHandle();
		String prnt_window_URL = driver.getCurrentUrl();
		System.out.println(prnt_window_URL);
		
		Set<String> new_window_handles = driver.getWindowHandles();
		for(String window : new_window_handles)
		{
			if(window!=new_window)
			{
				driver.switchTo().window(window);
				driver.manage().window().maximize();
			}
		}
		
		
		
	}

}
