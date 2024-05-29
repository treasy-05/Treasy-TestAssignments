package week5.day2;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LearnDataProvider extends BaseClass {
	@DataProvider(name="fetchdata")
	public String[][] rundata() {
	 String[][] dp = new String[2][3];
	 dp[0][0]="Treasy";
	 dp[0][1]="J";
	 dp[0][2]="Testleaf";
	 
	 dp[1][0]="Monica";
	 dp[1][1]="S";	
	 dp[1][2]="Qeagle";
			 
	 return dp;
	}
	 
		@Test(dataProvider="fetchdata")
		public void runcreateLead(String firstName, String lastName,String companyName ) {		
			driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.linkText("Create Lead")).click();		
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
			driver.findElement(By.name("submitButton")).click();

	

	
		
	}
}

