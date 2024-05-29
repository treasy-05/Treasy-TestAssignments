package week4.day2;


import java.time.Duration;
import java.util.ArrayList;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ActionsAmazon {
	

	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver  =new ChromeDriver();
		driver.get ("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("oneplus 9 pro",Keys.ENTER);
        List<WebElement> elePrices = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
        String price = elePrices.get(2).getText().replaceAll("[,]", "");
        int price1 = Integer.parseInt(price);
        System.out.println("Price of the first product is  :" +price);
	    System.out.println("Number of customer ratings is  :"  +driver.findElement(By.xpath("(//div[@class='a-row a-size-small']/span)[2]")).getText());
	    driver.findElement(By.xpath("(//div[@data-index='3']//a/span)[1]")).click();
	    Set<String> windows = driver.getWindowHandles();
	    List<String> list=new ArrayList<>(windows);
	    driver.switchTo().window(list.get(1));
	    driver.findElement(By.id("add-to-cart-button")).click();
	    WebElement eleSub = driver.findElement(By.xpath("//span[@id='attach-accessory-cart-subtotal']"));
	    Thread.sleep(2000);
	    String subTotal = eleSub.getText().replaceAll("[₹,.00]", "");
	    System.out.println("cart Subtotal is :" +subTotal);
	    int price2 = Integer.parseInt(subTotal);
	    if (price1 == price2) {
	    	System.out.println("price and subtotal matches");
			
		} else {
            System.out.println("price and subtotal does not match");
		}
	    Thread.sleep(2000);
	    driver.quit();
	    
	 
	
	}
 
}



