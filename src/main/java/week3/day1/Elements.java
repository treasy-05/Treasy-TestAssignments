package week3.day1;

public class Elements extends Button{
	
	public static void main(String[] args) {
	
		
		RadioButton rb=new RadioButton();
		rb.selectRadioButton();
		rb.click();
		rb.setText("Testleaf");
		rb.submit();
	
		
		CheckBoxButton cb=new CheckBoxButton();
		cb.clickCheckButton();
		cb.setText("Testleaf");
		cb.submit();
		cb.click();
		
		TextField tf=new TextField();
		tf.click();
		tf.getText();
		tf.setText("Testleaf");
	
		
		
		
		
		
	}

}
