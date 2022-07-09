package task4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webshop {

public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Testing docoment\\document\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver =new ChromeDriver();
			
	driver.get("http://demowebshop.tricentis.com");
	driver.manage().window().maximize();
	
	driver.findElement(By.className("ico-login")).click();
	
	
	driver.findElement(By.name("Email")).sendKeys("mk8982388889@gmail.com");
	
	driver.findElement(By.name("Password")).sendKeys("ridhi888");
	
	Thread.sleep(2000);
	driver.findElement(By.name("RememberMe")).click();
	
			  
		  driver.findElement(By.xpath( "/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input"
				  )).click();
			 
		 
	
	
	
	
	
}	
	
	
	
	
	
	
	
	
	
}
