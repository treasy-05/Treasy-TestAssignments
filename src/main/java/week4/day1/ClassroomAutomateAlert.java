package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassroomAutomateAlert {
	
	public static void main(String[] args) {
		
		ChromeDriver driver  =new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//h5[contains(text(),'(Prompt Dialog)')]//following::span[1]")).click();
	    Alert prompt = driver.switchTo().alert();
	    String text = prompt.getText();
	    System.out.println("Alert Message : " +text);
	    prompt.sendKeys("Treasy");
	    prompt.accept();
	    String text2 = driver.findElement(By.xpath("//span[@id='confirm_result']")).getText();
	    if (text2.contains("Treasy")) {
		  System.out.println("Alert is accepted");
		
	    } else {
		System.out.println("Alert is not accepted");

	    }
	    } 
	

}