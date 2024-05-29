package week3.day2;

public class JavaConnection implements DatabaseConnection{
	
		
  public static void main(String[] args) {
	  JavaConnection jac=new JavaConnection();
	  jac.connect();
	  jac.disconnect();
	  jac.executeUpdate();
}

	@Override
	public void connect() {
		System.out.println("connect implemented from DatabaseConnection interface" );
		
	}

	@Override
	public void disconnect() {
		System.out.println("disconnect implemented from DatabaseConnection interface" );
		
	}

	@Override
	public void executeUpdate() {
		System.out.println("executeUpdate implemented from DatabaseConnection interface" );
	}
	
	
	

}
