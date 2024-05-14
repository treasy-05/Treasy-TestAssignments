package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafgroundButton {
	
	public static void main(String[] args) {
		
	 ChromeDriver driver=new ChromeDriver();
     driver.get("https://leafground.com/button.xhtml");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 driver.findElement(By.xpath("//span[text()='Click']")).click();
	 System.out.println(driver.getTitle());
	 driver.navigate().back();
	 System.out.println(driver.findElement(By.xpath("//span[text()='Disabled']/parent::button")).isEnabled());
	 System.out.println(driver.findElement(By.xpath("//span[text()='Submit']/parent::button")).getLocation());
	 System.out.println(driver.findElement(By.xpath("//span[text()='Save']/parent::button")).getCssValue("background"));
	 System.out.println(driver.findElement(By.xpath("//span[text()='Submit']//ancestor::button[contains(@class,'ui-button-text-icon-right')]")).getSize()); 
	 driver.close();

	}

}
