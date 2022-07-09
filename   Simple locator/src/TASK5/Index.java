package TASK5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Index {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Testing docoment\\document\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
				
		driver.get("file:///C:/Testing%20docoment/index.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("uname")).sendKeys("mohini");
		
		driver.findElement(By.name("pass")).sendKeys("88888888");
		
		driver.findElement(By.name("remember")).click();
		
		
//		WebElement re=driver.findElement(By.className("rem"));
//		boolean flag=re.isSelected();
//		System.out.println(flag);
//		
		
		driver.findElement(By.id("browser")).sendKeys("firefox");
		
		
		
		driver.findElement(By.name("login")).click();
		
		driver.close();
		
		
		
//		WebElement sel=driver.findElement(By.tagName("select"));
//		Select s=new Select(sel);
//		s.selectByValue("ie");
//		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
