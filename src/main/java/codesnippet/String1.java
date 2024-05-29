package codesnippet;

import java.util.Arrays;

public class String1 {
	
	
	public static boolean isAnagram(String input) {
		boolean flag=false;
	
			
			char []array = input.toCharArray();
			char [] array2= new char[input.length()];
			int k = 0;
			for (int i=array.length-1;i>=0; i--) {
				array2[k] = array[1];
				k++;
			}
			
			String result = array2.toString();
			return flag;
		
			      
		
	}
	


}
