package week3.day1;

public class Polymorphism {
	
	public void reportStep(String msg,String status){
	System.out.println(msg+ " " +status);	
	}
public void reportStep(String msg,String status,boolean snap){
	System.out.println(msg+ " " +status+ " " +snap);	
		
	}
public static void main(String[] args) {
	Polymorphism pm=new Polymorphism();
	pm.reportStep("firstmessage", "pass");
	pm.reportStep("secondmessage", "fail", false);
	
	
			
}
}
