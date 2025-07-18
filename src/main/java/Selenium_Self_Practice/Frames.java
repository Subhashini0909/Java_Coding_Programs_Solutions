package Selenium_Self_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://letcode.in/frame");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//div//input[@name='fname']")).sendKeys("Subha");
		driver.findElement(By.xpath("//div//input[@name='lname']")).sendKeys("C");
		
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//div//input[@name='email']")).sendKeys("C.subhashini09@gmail.com");
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		driver.switchTo().parentFrame();
		System.out.println("Switched to parent frame");
		
		driver.quit();
	}

}
