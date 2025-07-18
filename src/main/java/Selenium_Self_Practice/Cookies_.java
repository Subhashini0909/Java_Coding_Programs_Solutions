package Selenium_Self_Practice;

import java.time.Duration;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies_ {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://letcode.in/frame");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//Get a Specific Cookie by Name
		Cookie cookie = driver.manage().getCookieNamed("__gpi");
		System.out.println("__gpi: "+cookie.getValue());

	}

}
