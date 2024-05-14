package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Test");
		driver.findElement(By.name("lastname")).sendKeys("j");
		driver.findElement(By.name("reg_email__")).sendKeys("testleaf6@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("Jesmar2212!");
		WebElement dob =driver.findElement(By.id("day"));
		Select sec = new Select(dob);
		sec.selectByValue("5");
	    WebElement mon =driver.findElement(By.id("month"));
	    Select sec1=new Select(mon);
	    sec1.selectByVisibleText("Aug");
	    WebElement yea =driver.findElement(By.id("year"));
	    Select sec2=new Select(yea);
	    sec2.selectByValue("1999");
	    driver.findElement(By.xpath("//input[@value='1']")).click();
	    
		
		
	}

}
