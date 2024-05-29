package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassroomAutomateFrame {
	
	public static void main(String[] args) {
		ChromeDriver driver  =new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.switchTo().frame("iframeResult");
        driver.findElement(By.xpath("//button[text()='Try it']")).click();
        Alert confirmAlert = driver.switchTo().alert();
        String text2 = confirmAlert.getText();
        System.out.println("Alert message is : " +text2);
        confirmAlert.accept();
        String verifyMsg = driver.findElement(By.id("demo")).getText();
        if (verifyMsg.contains("OK")) {
        	System.out.println("Alert is accepted");
     	} else {
     		System.out.println("Alert is not accepted");

		}
     
       

		
	}

}
