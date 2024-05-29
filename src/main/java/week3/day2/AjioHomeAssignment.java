package week3.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AjioHomeAssignment {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();		
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.name("searchVal")).sendKeys("bags",Keys.ENTER);
		driver.findElement(By.xpath("(//div[@class='facet-linkhead']//label)[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='facet-linkhead']//label[contains(@class,' Fashion')]")).click();
		Thread.sleep(2000);
		String count = driver.findElement(By.xpath("//div[@class='length']")).getText();
		System.out.println(count);
		List<WebElement> elements = driver.findElements(By.xpath("//div[@class='ReactVirtualized__Grid__innerScrollContainer']//div[@class='brand']/strong"));
		for (WebElement each : elements) {
			String brands = each.getText();
			System.out.println(brands);
		}
		List<WebElement> eleNames = driver.findElements(By.xpath("//div[@class='ReactVirtualized__Grid__innerScrollContainer']//div[@class='nameCls']"));
		for (WebElement every : eleNames) {
			String names = every.getText();
			System.out.print(names+  ",");
		}
	   driver.close();
	}
	

}
