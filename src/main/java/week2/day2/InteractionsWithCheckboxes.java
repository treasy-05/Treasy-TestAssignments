package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteractionsWithCheckboxes {
	
	public static void main(String[] args) throws InterruptedException {
	
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//span[text()='Basic']")).click();
		driver.findElement(By.xpath("//div[@class='col-12']//span[text()='Ajax']")).click();
		String str = driver.findElement(By.xpath("//span[text()='Checked']")).getText();
		System.out.println(str.equals("Checked"));
		driver.findElement(By.xpath("//label[text()='Java']/parent::td//div[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(@class,'toggleswitch')]/div[2]")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//div[@class='ui-growl-message']/span")).getText());
		Thread.sleep(3000);
	    System.out.println(driver.findElement(By.xpath("//div[contains(@class,'ui-selectbooleancheckbox')]//span[text()='Disabled']/parent::div/div/input")).isEnabled());
		driver.findElement(By.xpath("//div[@class='card']/h5[contains(text(),'State')]/following::div[@class='col-12']//div[contains(@id,'ajaxTriState')]")).click();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.xpath("//span[@class='ui-growl-title']//following-sibling::p")).getText());
	    driver.findElement(By.xpath("//div[@role='combobox']/ul")).click();
	    driver.findElement(By.xpath("//div[contains(@class,'ui-selectcheckboxmenu')]/input")).sendKeys("lon");
	    driver.findElement(By.xpath("//div[contains(@class,'ui-selectcheckboxmenu')]/ul[@role='group']//label[text()='London']")).click();
	    driver.findElement(By.xpath("//span[contains(@class,'circle-close')]")).click();
	    driver.close();
	}


}
