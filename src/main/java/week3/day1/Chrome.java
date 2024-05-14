package week3.day1;

public class Chrome extends Browser{
	
	public void openIncognito() {
		System.out.println("openIncognito from Chrome class");

	}
   public void clearCache() {
		System.out.println("clearCache from Chrome class");

		
}
  public static void main(String[] args) {
	  
	  Chrome cr =new Chrome();
	  cr.openURL();
	  cr.closeBrowser();
	  cr.navigateBack();
	  cr.openIncognito();
	  cr.clearCache();
	  
	  
	
} 
}
