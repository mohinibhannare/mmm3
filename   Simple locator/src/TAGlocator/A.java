package TAGlocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Testing docoment\\document\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver =new ChromeDriver();
				
		driver.get("file:///C:/Testing%20docoment/index.html");
				
				driver.manage().window().maximize();
				
				
				driver.findElement(By.className("username")).sendKeys("mishaa");
				
				driver.findElement(By.className("pass")).sendKeys("mishaa@77888");
			
			//	**********//tagname************//
				
					WebElement sel=driver.findElement(By.tagName("select"));
		
					Select s=new Select(sel);
					
				//	s.electByIndex(1);
					
					//s.selectByValue("firefox");
		
		//**********************************************
		
		//linkTest//
		
		
		//driver.findElement(By.linkText("Password?")).click();
					
					
		
		driver.findElement(By.partialLinkText("Pas")).click();
		
	}
	
	
	 	
	
		
	
	
	
	
}
