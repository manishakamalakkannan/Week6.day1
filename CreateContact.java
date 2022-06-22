package Week6.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import selenium.week4.test;

public class CreateContact extends BaseClass {
	@Test
	public void Contact() {
	 driver.findElement(By.linkText("CRM/SFA")).click();
	 driver.findElement(By.linkText("Create Contact")).click();

	 driver.findElement(By.id("firstNameField")).sendKeys("Manisha");
	 driver.findElement(By.id("lastNameField")).sendKeys("Kamal");
	 driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Manisha");
	 driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Kamal");
	 driver.findElement(By.id("createContactForm_departmentName")).sendKeys("IT");
	 driver.findElement(By.id("createContactForm_description")).sendKeys("The description is tested");
	 driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("manishakamalakkannan@gmail.com");

		WebElement drop1=	 driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select dropdown1=new Select(drop1);
		dropdown1.selectByVisibleText("New York");
driver.findElement(By.className("smallSubmit")).click();

driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
driver.findElement(By.id("updateContactForm_description")).clear();
driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Test Important Note");
driver.findElement(By.xpath("//input[@name='submitButton']")).click();
System.out.println("The title is "+ driver.getTitle());
	}
}
