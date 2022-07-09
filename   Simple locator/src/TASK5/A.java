package TASK5;

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
	
	
		WebElement username=driver.findElement(By.id("uid"));
		username.sendKeys("Misba");
		driver.findElement(By.name("pass")).sendKeys("Misba@123");


		WebElement re=driver.findElement(By.className("rem"));
		boolean flag=re.isSelected();
		System.out.println(flag);
		WebElement sel=driver.findElement(By.tagName("select"));
		Select s=new Select(sel);
		s.selectByValue("ie");
		driver.findElement(By.className("login")).click();
		
		driver.close();
	}

}

	
	
	
	

