package Namelocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {

	public static void main(String[] args) {
		

	
	System.setProperty("webdriver.chrome.driver", "C:\\Testing docoment\\document\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver =new ChromeDriver();
				
		driver.get("file:///C:/Testing%20docoment/index.html");
				
				driver.manage().window().maximize();
				
				driver.findElement(By.name("uname")).sendKeys("linaa");
				
				driver.findElement(By.name("pass")).sendKeys("linaa@112233");
	
				driver.findElement(By.name("remember")).click();
				
				driver.findElement(By.name("login")).click();
				
				
	
	
}
}