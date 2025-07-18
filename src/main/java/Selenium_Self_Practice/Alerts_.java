package Selenium_Self_Practice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts_ {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://testautomationcentral.com/demo/alerts.html");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));

//SCROLL TO BOTTOM
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
//Simple Alert - Accept
		System.out.println("Simple Alert");
		driver.findElement(By.xpath("//div//button[text()='Show Alert']")).click();
		driver.switchTo().alert().accept();
		
//Prompt Alert - Accept & Dismiss	
		System.out.println("Prompt Alert - Dismiss");
		driver.findElement(By.xpath("//div//button[@data-target='prompt-tab']")).click();
		driver.findElement(By.xpath("//div//button[@onclick='showPrompt()']")).click();
		driver.switchTo().alert().dismiss();
		
		System.out.println("Prompt Alert - Enter Text and accept");
		driver.findElement(By.xpath("//div//button[@onclick='showPrompt()']")).click();
		Alert Prompt_Alert_Accept = driver.switchTo().alert();
		Prompt_Alert_Accept.sendKeys("Subha");
		Prompt_Alert_Accept.accept();
		String Prompt_Alert_msg = driver.findElement(By.id("prompt-message")).getText();
		System.out.println(Prompt_Alert_msg);
		
//Confirm Alert - Accept & Dismiss		
		System.out.println("Confirm Alert - Dismiss");
		driver.findElement(By.xpath("//div//button[@data-target='confirm-tab']")).click();
		driver.findElement(By.xpath("//div//button[@onclick='showConfirm()']")).click();
		driver.switchTo().alert().dismiss();
		
		System.out.println("Confirm Alert - Accept");
		driver.findElement(By.xpath("//div//button[@onclick='showConfirm()']")).click();
		driver.switchTo().alert().accept();
		String Confirm_Alert_msg = driver.findElement(By.id("confirm-message")).getText();
		System.out.println(Confirm_Alert_msg);

	}

}
