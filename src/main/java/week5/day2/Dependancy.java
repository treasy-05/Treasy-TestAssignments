package week5.day2;



import org.testng.annotations.Test;

public class Dependancy extends BaseClass {
	
	@Test ()
	public void createLead() {
		System.out.println("Lead Created");
		throw new RuntimeException();
		
	

	}
	@Test(dependsOnMethods= {"week5.day2.Dependancy.createLead"})
	public void updateLead() {
		System.out.println("Lead Updated");
		
	

	}
	@Test(dependsOnMethods= {"week5.day2.Dependancy.updateLead"})
	public void deleteLead() {
		System.out.println("Lead Deleted");
		
		

	}
}

