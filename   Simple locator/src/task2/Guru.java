package task2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru {

	
	public static void main(String[] args) {	
			System.setProperty("webdriver.chrome.driver", "C:\\Testing docoment\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
				
		driver.get("http://demo.guru99.com/test/newtours/index.php");
		driver.manage().window().maximize();
		
		
		WebElement log =driver.findElement(By.name("userName"));
		log.sendKeys("mohini");
		
		WebElement pass= driver.findElement(By.name("password"));
		pass.sendKeys("88888888");
			
		WebElement log1=driver.findElement(By.name("submit"));
		log1.click();
		
		

		
	}
	
	
	
	
	
	
	
	
}
