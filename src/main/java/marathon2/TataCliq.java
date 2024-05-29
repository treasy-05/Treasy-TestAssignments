package marathon2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TataCliq {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
		ChromeDriver driver= new ChromeDriver(options);
		driver.get("https://www.tatacliq.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));				
		WebElement eleBrands = driver.findElement(By.xpath("//div[text()='Brands']"));
		Actions builder=new Actions(driver);
		Thread.sleep(1000);
		builder.moveToElement(eleBrands).perform();
		WebElement eleWatch = driver.findElement(By.xpath("//div[text()='Watches & Accessories']"));
		builder.moveToElement(eleWatch).perform();
		driver.findElement(By.xpath("//div[contains(@class,'featureBrands')]/div[2]")).click();	
		WebElement sort = driver.findElement(By.xpath("//select[@class='SelectBoxDesktop__hideSelect']"));
        Select sec=new Select(sort);
        sec.selectByVisibleText("New Arrivals");
        driver.findElement(By.xpath("(//div[@class='FilterDesktop__newFilName'])[1]")).click();
        Thread.sleep(2000);
        List<WebElement> elePrices = driver.findElements(By.xpath("//div[@class='ProductDescription__priceHolder']/h3"));
        Thread.sleep(2000);
        String mainPrice=elePrices.get(0).getText();
        mainPrice= mainPrice.replaceAll("[\\D]", "");
        System.out.println("Price old : " +mainPrice);
        for (WebElement element : elePrices) {         	
        	String text = element.getText();
        	System.out.println("Prices of the Men's watches are : "  +text);
        	
        }
        	 Thread.sleep(2000);
        	WebElement element2 = driver.findElement(By.xpath("(//div[@class='PlpComponent__base'])[1]/div"));
        	element2.click();
 
             Set<String> windowHandles = driver.getWindowHandles();
             List<String> list = new ArrayList<>(windowHandles);
             driver.switchTo().window(list.get(1));
          
        	WebElement eleNew = driver.findElement(By.xpath("//div[@class='ProductDetailsMainCard__price']/h3"));
        	String newPrice = eleNew.getText();
        	newPrice=newPrice.replaceAll("[\\D]", "");
        	System.out.println("Price new : " +newPrice);
		if (mainPrice.equals(newPrice)) {
			System.out.println("Price matches");
			
		} else {
			System.out.println("Price does not match");

		}
		driver.findElement(By.xpath("//span[contains(text(),'BAG')]")).click();
         WebElement count = driver.findElement(By.xpath("//span[contains(@class,'cartCount')]"));
         String cartCount = count.getText();
         System.out.println("Number of items in the cart is :  " +cartCount);
         driver.findElement(By.xpath("//div[@class='DesktopHeader__myBagShow']")).click();
         Thread.sleep(2000);
         File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
         File desc = new File("./snap/imagename.png");
         FileUtils.copyFile(screenshotAs, desc);
         driver.close();      
         driver.switchTo().window(list.get(0));
         Thread.sleep(2000);
         driver.close();
         
	}
}