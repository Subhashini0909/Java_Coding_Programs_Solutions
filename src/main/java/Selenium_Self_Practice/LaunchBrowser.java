package Selenium_Self_Practice;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		System.out.println("Launching Chrome...");
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		//ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		System.out.println("Chrome Successfully launched...");
		driver.get("https://www.google.com");
		driver.quit();
		System.out.println("Launching Edge...");
		EdgeDriver driver1 = new EdgeDriver();
		System.out.println("Edge Successfully launched...");
	}

}
