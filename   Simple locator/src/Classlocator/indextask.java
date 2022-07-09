package Classlocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class indextask {

	public static void main(String[] args) {
		
		
			System.setProperty("webdriver.chrome.driver", "C:\\Testing docoment\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
					
			driver.get("file:///C:/Testing%20docoment/index.html");
					
					driver.manage().window().maximize();
					
		// classname locator 
		
		driver.findElement(By.className("username")).sendKeys("mishaa");
		
		driver.findElement(By.className("pass")).sendKeys("mishaa@77888");
		
		driver.findElement(By.className("login")).click();
		
		driver.findElement(By.className("cancel")).click();
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
