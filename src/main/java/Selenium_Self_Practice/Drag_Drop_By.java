package Selenium_Self_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop_By {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
		driver.findElement(By.id("Accepted Elements")).click();
		
		WebElement ifrm = driver.findElement(By.xpath("//*/div[2]/div/div/div[2]/p/iframe"));
		driver.switchTo().frame(ifrm);
		
		Actions builder = new Actions(driver);
		WebElement scr = driver.findElement(By.id("draggable-nonvalid"));
		
		builder.dragAndDropBy(scr, 100, 50).perform();

	}

}
