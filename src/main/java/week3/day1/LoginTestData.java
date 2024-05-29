package week3.day1;

public class LoginTestData extends TestData {
	
	public void enterUsername() {
		System.out.println("Treasy > From LoginTestData class");
		
	}
		
	public void enterPassword() {
		System.out.println("password > From LoginTestData class");
		
		
		}
		
	public static void main(String[] args) {
		
		LoginTestData ln=new LoginTestData();
		ln.enterCredentials();
		ln.navigateToHomePage();
		ln.enterUsername();
		ln.enterPassword();
		
		
		
	}	

	}


