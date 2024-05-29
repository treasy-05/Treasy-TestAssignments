package week5.day2;

import org.testng.annotations.Test;

public class Attributes extends BaseClass {
	@Test (priority=1)
	public void createLead() {
		System.out.println("Lead Created");
		
	

	}
	@Test(priority=2, enabled=false)
	public void updateLead() {
		System.out.println("Lead Updated");
		
	

	}
	@Test(priority=3 )
	public void deleteLead() {
		System.out.println("Lead Deleted");
		
		

	}
}
