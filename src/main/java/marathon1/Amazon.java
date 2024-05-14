package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags for b");
		driver.findElement(By.xpath("//div[text()='bags for b'][1]")).click();
	    String str1=driver.findElement(By.xpath("//span[contains(@class,'a-color-state')]/preceding::span[2]")).getText();	
	    String str2=driver.findElement(By.xpath("//span[contains(@class,'a-color-state')]")).getText();
	    System.out.println(str1+str2);
	    driver.findElement(By.xpath("//span[text()='Brand']/parent::div/following-sibling::ul//i[1]")).click();
	    driver.findElement(By.id("a-autoid-0-announce")).click();
	    driver.findElement(By.linkText("Newest Arrivals")).click();
	    System.out.println(driver.findElement(By.xpath("//div[contains(@class,' s-result-list')]/div[@data-index='2']//div[@data-cy='title-recipe']/h2//span")).getText());
	    System.out.println(driver.findElement(By.xpath("//div[contains(@class,' s-result-list')]/div[@data-index='2']//span[@class='a-price']/span[2]")).getText());
	    System.out.println(driver.getTitle());
	    Thread.sleep(2000);
	    driver.close();
	    
	    
	}


}
