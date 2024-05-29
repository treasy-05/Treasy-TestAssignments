package week5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


public class BaseClass {
	public static ChromeDriver driver;
	
	@Parameters({"url","username","password"})
	@BeforeMethod
    public void Run(String url,String Un,String Pw) {	
	driver= new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.findElement(By.id("username")).sendKeys(Un);
	driver.findElement(By.id("password")).sendKeys(Pw);
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	
}	
}
