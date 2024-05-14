package marathon1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbhiBus {
	
public static void main(String[] args) throws InterruptedException {
	
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.abhibus.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@placeholder='From Station']")).sendKeys("Chennai");
		Thread.sleep(2000);
        driver.findElement(By.xpath("//div[text()='Chennai']")).click();
        driver.findElement(By.xpath("//input[@placeholder='To Station']")).sendKeys("Bangalore");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[text()='Bangalore']")).click();
        driver.findElement(By.xpath("//button[text()='Tomorrow']")).click();
        System.out.println(driver.findElement(By.xpath("//h5[text()='Parveen Travels'][1]")).getText());
        driver.findElement(By.xpath("//p[text()='Bus Type']/parent::div//span[text()='Sleeper']")).click();
        System.out.println(driver.findElement(By.xpath("//div[contains(@id,'service-cards-container')]/div[1]//div[contains(@id,'service-operator-select-seat-')]//small")).getText());
        driver.findElement(By.xpath("//div[contains(@id,'service-cards-container')]/div[1]//div[contains(@id,'service-operator-select-seat-')]/button")).click();	
        
        List<WebElement> seats = driver.findElements(By.xpath("//table[@id='seat-layout-details'][1]//tr/td[@rowspan='1']"));
       
		for(int i=0; i<seats.size(); i++) {	
			if(seats.get(i).isEnabled()) {
				seats.get(i).click();
				break;
			}
		}
		
		driver.findElement(By.xpath("//div/input[@placeholder='Search Boarding Point']/following::p[1]")).click();
		driver.findElement(By.xpath("//div/input[@placeholder='Search Dropping Point']/following::p[1]")).click();
		System.out.println("Seat slected is =  "+ driver.findElement(By.xpath("//span[@class='text-primary'][1]")).getText());
		System.out.println("Bus fare is = "+ driver.findElement(By.xpath("//span[@class='text-primary']/following::span[2]")).getText());
        System.out.println(driver.getTitle());
        Thread.sleep(3000);
        driver.close();


}

}


