package Week6.Day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead extends BaseClass {
	@Test
	public void main() {
		// TODO Auto-generated method stub
		
		 
	//	 driver.findElement(By.linkText("CRM/SFA")).click();
		 
		 driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		 
	//	 driver.findElement(By.linkText("Leads")).click();
		 
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")) .click();
	//	 driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();
		
		// driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test");
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("test");
		 //driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Manisha");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Manisha");
		// driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kamal");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Kamal");
		 //driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Manisha");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Manisha");
	//	 driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
		driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("IT");
		// driver.findElement(By.id("createLeadForm_description")).sendKeys("The description is tested");
		driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("The description is tested");
		// driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("manishakamalakkannan@gmail.com");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("manishakamalakkannan@gmail.com");
		//	WebElement drop=	 driver.findElement(By.id("createLeadForm_dataSourceId"));
		
	//	WebElement drop=	 driver.findElement(By.xpath("//input[@id='createLeadForm_dataSourceId']"));
		//	Select dropdown=new Select(drop);
	//	Select dropdown = new Select(drop);
		//	dropdown.selectByIndex(2);
		//	dropdown.selectByIndex(2);
	//WebElement drop1=	 driver.findElement(By.xpath("createLeadForm_generalStateProvinceGeoId"));
	WebElement drop1=driver.findElement(By.xpath("//select[@id='createLeadForm_generalStateProvinceGeoId']"));
		Select dropdown1=new Select(drop1);
		dropdown1.selectByVisibleText("New York");


	//	driver.findElement(By.className("smallSubmit")).click();
		//	driver.findElement(By.xpath("//input[@name='submitButton' and @class='smallSubmit']")).click();
	//		driver.findElement(By.linkText("Edit")).click();
		//	 driver.findElement(By.id("updateLeadForm_description")).clear();
			// driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Filled the notes");
			 //driver.findElement(By.name("submitButton")).click();
			// System.out.println("Tile :" + driver.getTitle());
}
}
