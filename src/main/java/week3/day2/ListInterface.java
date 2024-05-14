package week3.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListInterface {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
	    driver.get("https://www.amazon.in/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    driver.findElement(By.xpath("//div[@class='nav-search-field ']/input")).sendKeys("phones",Keys.ENTER);
	    List<WebElement> prices=driver.findElements(By.className("a-price-whole"));
	    for (WebElement webElement : prices) {
	    	String str =webElement.getText();
	    	System.out.println(str);
			
		}
	    


		
	}
	

}
