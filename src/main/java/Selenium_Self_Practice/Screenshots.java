package Selenium_Self_Practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Screenshots {

	public static void main(String[] args) throws IOException 
	{
		
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.findElement(By.id("name")).sendKeys("Subha");
		
		//TO TAKE SCREENSHOT OF THE SCREEN
		//Capture a screenshot as a File
			File img_src = ((RemoteWebDriver) driver).getScreenshotAs(OutputType.FILE);
					//The OutputType.FILE parameter specifies that the screenshot should be returned as a File object.
			
		//Specify the destination file path and name
			File dest = new File("./Screenshots/img.png");
			
		//Copy the captured screenshot to the specified destination
			FileHandler.copy(img_src, dest);
			
			driver.quit();

	}

}
