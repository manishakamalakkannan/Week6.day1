package Week6.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
public ChromeDriver driver;
	
	
	@BeforeMethod
public void PreCondition () {
		
		
		 WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.manage().window().maximize();
		 WebElement elemFirst = driver.findElement(By.id("username"));
		 elemFirst.sendKeys("DemoSalesManager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();

	}
	@AfterMethod
	public void PostCondition() {
		driver.close();
}
}
