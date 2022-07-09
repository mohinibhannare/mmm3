package task4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Testing docoment\\document\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
				
		driver.get("http://demowebshop.tricentis.com");
		driver.manage().window().maximize();
		
		driver.get("http://demowebshop.tricentis.com");
		driver.manage().window().maximize();
		WebElement log=driver.findElement(By.className("ico-login"));
		log.click();
		WebElement username=driver.findElement(By.name("Email"));
		username.sendKeys("Misbashaikh@gmail.com");
		WebElement password=driver.findElement(By.name("Password"));
		password.sendKeys("Misbashaikh@124");
		WebElement re=driver.findElement(By.name("RememberMe"));
		boolean flag=re.isSelected();
		System.out.println(flag);
		WebElement forgetpass=driver.findElement(By.className("forgot-password"));
		forgetpass.click();
		WebElement login=driver.findElement(By.className("buttons"));
		login.click();
	}
		
	
}
