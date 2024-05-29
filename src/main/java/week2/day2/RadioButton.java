package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//div[@class='col-12']/table//label[text()='Chrome'][1]")).click();
		driver.findElement(By.xpath("//div[contains(@class,'ui-g')]//label[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(@class,'ui-g')]//label[1]")).click();
		Thread.sleep(2000);
        System.out.println(driver.findElement(By.xpath("//div[contains(@class,'ui-state-active')]/preceding-sibling::div/input[@value='Option3']")).isSelected());
	    System.out.println(driver.findElement(By.xpath("//div[contains(@class,'ui-g-12')]//div[contains(@class,'ui-state-active')]/preceding-sibling::div/input")).isSelected());
	}

}

