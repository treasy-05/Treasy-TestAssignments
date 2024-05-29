package week4.day2;


import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ClassroomWebTableInteraction {
	
public static void main(String[] args) {
		
		ChromeDriver driver  =new ChromeDriver();
		driver.get ("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement fromEle = driver.findElement(By.id("txtStationFrom"));
		fromEle.clear();
		fromEle.sendKeys("MAS",Keys.ENTER);
		WebElement toEle = driver.findElement(By.id("txtStationTo"));
		toEle.clear();
		toEle.sendKeys("MDU",Keys.ENTER);
		driver.findElement(By.id("chkSelectDateOnly")).click();
		List<WebElement> trainNames = driver.findElements(By.xpath("//table[contains(@class,'DataTable TrainList')]/tbody/tr/td[2]"));
		Set<String> set =new TreeSet<>();
		for (WebElement eachName : trainNames) {
		String text = eachName.getText();
	     set.add(text);
        }
		System.out.println(trainNames.size());
		System.out.println(set.size());
		if (trainNames.size()!=set.size()) {
			System.out.println("Duplicates are present");
			
		} else {
			System.out.println("Duplicates are not present");
		}
		
		
			
		}
		
		

}



