package week3.day1;

public class APIClient {
	
	public void sendRequest(String endpoint) {
		System.out.println(endpoint);
		
	}
	
	public void sendRequest(String endpoint,String requestBody,boolean requestStatus) {
      System.out.println(endpoint+ " " +requestBody+ " " +requestStatus);
}
	
	
	public static void main(String[] args) {
		APIClient api=new APIClient();
		api.sendRequest("URL1");
		api.sendRequest("URL2", "Firstname", true);
		
	}
}