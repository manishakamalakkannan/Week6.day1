package Week6.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CreateLeads extends BaseClass {
	@Test
	public void Create()   {
	 driver.findElement(By.linkText("CRM/SFA")).click();
	 driver.findElement(By.linkText("Leads")).click();
	 driver.findElement(By.linkText("Create Lead")).click();
	 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test");
	 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Manisha");
	 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kamal");
	 driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Manisha");
	 driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
	 driver.findElement(By.id("createLeadForm_description")).sendKeys("The description is tested");
	 driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneNumber']")).sendKeys("1234567890");
	 driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("manishakamalakkannan@gmail.com");
		WebElement drop=	 driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dropdown=new Select(drop);
		dropdown.selectByIndex(2);
		
		WebElement drop1=	 driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dropdown1=new Select(drop1);
		dropdown1.selectByVisibleText("New York");


	driver.findElement(By.className("smallSubmit")).click();
	//	driver.findElement(By.linkText("Edit")).click();
		// driver.findElement(By.id("updateLeadForm_description")).clear();
		// driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Filled the notes");
		 //driver.findElement(By.name("submitButton")).click();
		 System.out.println("Tile :" + driver.getTitle());
}
}
