package week5.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class ParameterCreateLead extends BaseClass{

	@Test
	public void Create() {
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hari");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		driver.findElement(By.name("submitButton")).click();
		
	
		
		

	}

}
