package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		 driver.get("http://leaftaps.com/opentaps/.");
		 driver.manage().window().maximize();
	     driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	     driver.findElement(By.id("password")).sendKeys("crmsfa");
	     driver.findElement(By.className("decorativeSubmit")).click();
	     driver.findElement(By.partialLinkText("SFA")).click();
	     driver.findElement(By.linkText("Accounts")).click();
	     driver.findElement(By.linkText("Create Account")).click();
	     driver.findElement(By.id("accountName")).sendKeys("Treasy1");
	     driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
	      WebElement industryID = driver.findElement(By.name("industryEnumId"));
	      Select sec =new Select(industryID);
	      sec.selectByIndex(3);
	      WebElement ownershipID = driver.findElement(By.name("ownershipEnumId"));
	      Select own= new Select(ownershipID);
	      own.selectByVisibleText("S-Corporation");
	      WebElement sourceID = driver.findElement(By.id("dataSourceId"));
	      Select soc =new Select(sourceID);
	      soc.selectByValue("LEAD_EMPLOYEE");
	      WebElement campaignID = driver.findElement(By.id("marketingCampaignId"));
	      Select camp =new Select(campaignID);
	      camp.selectByIndex(6);
	      WebElement stateID = driver.findElement(By.id("generalStateProvinceGeoId"));
	      Select sid =new Select(stateID);
	      sid.selectByValue("TX");
	       driver.findElement(By.className("smallSubmit")).click();
	       driver.close();
	 
	      
	      
	      
	      
	      
	      
	      
	      
	      
	
	     
	     
	     
		
	}

}
