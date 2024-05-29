package week4.day2;

import java.io.IOException;
import java.time.Duration;


import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsSnapdeal {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		ChromeDriver driver  =new ChromeDriver();
		driver.get ("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement category = driver.findElement(By.linkText("Men's Fashion"));
		String type = category.getText();
		System.out.println(type);
		Actions act= new Actions(driver);
		act.moveToElement(category).perform();
		driver.findElement(By.linkText("Sports Shoes")).click();
		String count = driver.findElement(By.xpath("//div[contains(@class,'category-name-wrapper')]/span")).getText();
	    System.out.println("Total number of Sports shoes : "  +count);
	    driver.findElement(By.xpath("//li[contains(@class,'child-cat-list')]//div[contains(text(),'Training Shoes')]")).click();
	    driver.findElement(By.xpath("//div[contains(@class,'sorting-sec')]")).click();
	    WebElement sort = driver.findElement(By.xpath("//div[contains(@class,'sorting-sec')]//li[2]"));    
	    String textSort = sort.getText();
	    sort.click();
	    System.out.println(textSort);
	    WebElement eleLeft = driver.findElement(By.xpath("//div[@class='filter-inner']/div/a[1]"));
	    WebElement eleRight = driver.findElement(By.xpath("//div[@class='filter-inner']/div/a[2]"));	    
        //WebElement eleRange = driver.findElement(By.xpath("//div[contains(@class,'ui-slider-range')]"));
	    Actions builder= new Actions(driver);
	    Thread.sleep(1000);
	    builder.dragAndDropBy(eleLeft, 30, 0).perform();
	    Thread.sleep(1000);
	    builder.dragAndDropBy(eleRight, -70, 0).perform();
	    Thread.sleep(1000);
	    String priceLow = driver.findElement(By.xpath("//div[@class='clear']/span[1]")).getText();
	    System.out.println(priceLow);
	    String priceHigh = driver.findElement(By.xpath("//div[@class='clear']/span[2]")).getText();
	    System.out.println(priceHigh);
	    WebElement colour = driver.findElement(By.xpath("(//div[@data-filtername='Color_s']/div[3]//label)[1]"));
	    String text1 = colour.getText();
	    System.out.println(text1);
	    colour.click();
	    if (textSort.equalsIgnoreCase("price low to high")&& type.equalsIgnoreCase("men's fashion")) {
	    	System.out.println("Sorted correctly");
			
		} else {
			System.out.println("Sorting is incorrect");

		}
	    WebElement firstEle = driver.findElement(By.xpath("(//section[contains(@class,'js-section')]/div[1]//a)[1]"));
	    Actions action = new Actions(driver);
	    action.moveToElement(firstEle).perform();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//div[contains(@class,'row-disc')])[1]")).click();
	    Thread.sleep(1000);
	    System.out.println(driver.findElement(By.className("payBlkBig")).getText());
	    System.out.println(driver.findElement(By.xpath("//span[contains(@class,'percent-desc')]")).getText());
	    driver.close();
	    driver.quit();
	   
	   
	    
	}

}
