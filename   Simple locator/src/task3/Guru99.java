package task3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99 {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Testing docoment\\chromedriver_win32\\chromedriver.exe");
		
	
		WebDriver driver =new ChromeDriver();
				
		driver.get("http://demo.guru99.com/test/newtours/index.php");
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		
		driver.findElement(By.name("firstName")).sendKeys("mohini");
		
		driver.findElement(By.name("lastName")).sendKeys("Bhannare");
		
		driver.findElement(By.name("phone")).sendKeys("88866699");
		
		driver.findElement(By.name("userName")).sendKeys("mk8391188@gmail.com");
		
		driver.findElement(By.name("address1")).sendKeys("nagpur");
		
		driver.findElement(By.name("city")).sendKeys("nagpur");
		
		driver.findElement(By.name("state")).sendKeys("Maharastra");
		
		driver.findElement(By.name("postalCode")).sendKeys("443488");
		
		driver.findElement(By.name("email")).sendKeys("mohini");
		
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("88888888");
		driver.findElement(By.name("confirmPassword")).sendKeys("88888888");
		
		driver.findElement(By.name("submit")).click();
		
		driver.get("http://demo.guru99.com/test/newtours/login.php");
		
		driver.findElement(By.name("userName")).sendKeys("AAAA");
		driver.findElement(By.name("password")).sendKeys("aaaa");
		
		driver.findElement(By.name("submit")).click();
		
		
	}
	
	
}
