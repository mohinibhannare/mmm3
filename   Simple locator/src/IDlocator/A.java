package IDlocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Hello this is our first Selenium Program ");
		
		

		System.setProperty("webdriver.chrome.driver", "C:\\Testing docoment\\chromedriver_win32\\chromedriver.exe");
		
	
		WebDriver driver =new ChromeDriver();
					
			driver.get("file:///C:/Testing%20docoment/index.html");
					
					driver.manage().window().maximize();
					
		
		 // ID
		  
		  WebElement username = driver.findElement(By.id("uid"));
		  
		  username.sendKeys("mohini");
		  
		  driver.findElement(By.id("pid")).sendKeys("misha@1222");
		  
		  driver.findElement(By.id("browser")).sendKeys("Chorme");
		  
		
		  WebElement re = driver.findElement(By.id("remem")); boolean flag
		  =re.isSelected();
		  
		  System.out.println(flag);
		  
		  driver.findElement(By.id("login")).click();
		  
		  Thread.sleep(2000);
		  
		 	  
		  //driver.findElement(By.id("cancel")).click();
		 
		  Thread.sleep(2000);
		driver.findElement(By.linkText("Password?")).click();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
