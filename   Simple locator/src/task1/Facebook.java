package task1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		
		
			System.setProperty("webdriver.chrome.driver", "C:\\Testing docoment\\document\\chromedriver_win32\\chromedriver.exe");
		
			WebDriver driver =new ChromeDriver();
					
			driver.get("https://www.facebook.com/");
		
			driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("mohini bhannare");
		
		driver.findElement(By.id("pass")).sendKeys("MOHINI88031277");
		
		
		driver.findElement(By.name("login")).click();
		
		driver.findElement(By.className("97w4"));
		
		//driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
