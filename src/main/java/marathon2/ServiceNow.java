package marathon2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.sukgu.Shadow;

public class ServiceNow {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
		ChromeDriver driver= new ChromeDriver(options);
		driver.get("https://dev200784.service-now.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("k6C8-ajUWqY%");
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		Shadow dom=new Shadow(driver); 
		dom.setImplicitWait(10);
		WebElement eleAll = dom.findElementByXPath("//div[contains(@class,'sn-polaris-navigation')]/div[text()='All']");
		eleAll.click();
		WebElement eleLabel = dom.findElementByXPath("//span[@class='item-icon']/span[text()='Service Catalog']");
		eleLabel.click();
		WebElement iframe = dom.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(iframe);
		driver.findElement(By.xpath("(//td[@id='dropzone1']/div[4]/div//div[2]//a)[2]/span/h2")).click();
		driver.findElement(By.xpath("//h2/strong[contains(text(),' 13 pro')]")).click();
		driver.findElement(By.xpath("(//div[@class='sc-radio']//label)[1]")).click();
		driver.findElement(By.xpath("//input[@class='cat_item_option sc-content-pad form-control']")).sendKeys("9876543210");
		WebElement eleSec = driver.findElement(By.xpath("(//div[contains(@class,'form-field input_controls')])[3]/select"));
		Select sec=new Select(eleSec);
		sec.selectByIndex(1);
		driver.findElement(By.id("oi_order_now_button")).click();
		System.out.println(driver.findElement(By.xpath("//div[contains(@class,'notification-success')]/span")).getText());
		String reqNum = driver.findElement(By.xpath("//a[@id='requesturl']/b")).getText();
		System.out.println("Request Number is : " +reqNum);
		File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
        File desc = new File("./image/imagename.png");
        FileUtils.copyFile(screenshotAs, desc);
        driver.close();
	}

}
