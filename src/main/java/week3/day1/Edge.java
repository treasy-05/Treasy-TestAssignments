package week3.day1;

public class Edge extends Chrome {
	
	public void takeSnap() {
		
		System.out.println("takeSnap from Edge class");
		

	}
 public void clearCookies() {
		System.out.println("clearCookies from Edge class");
	

}
 public static void main(String[] args) {
	
	 Edge ed= new Edge();
	 ed.clearCache();
	 ed.clearCookies();
	 ed.closeBrowser();
	 ed.navigateBack();
	 ed.takeSnap();
	 ed.openURL();
}
}
