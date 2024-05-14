package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/.");
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
		  driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("crmsfa");
		  driver.findElement(By.xpath("//input[contains(@class,'dec')]")).click();
		  driver.findElement(By.xpath("//a[contains(text(),'SFA')]")).click();
		  driver.findElement(By.xpath("//a[text()='Leads']")).click();
		  driver.findElement(By.xpath("(//a[contains(text(),'Lead')])[3]")).click();
	}
}