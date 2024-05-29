package week4.day2;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClassroomAutomateActionClass {
	
	public static void main(String[] args) {
		
		ChromeDriver driver  =new ChromeDriver();
		driver.get ("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement element = driver.findElement(By.linkText("Conditions of Use & Sale"));
		Actions act=new Actions(driver);
		act.scrollToElement(element).perform();
		System.out.println(element.getText());
		File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
		System.out.println("Screenshot is captured in  "  +screenshotAs);
	}

}
