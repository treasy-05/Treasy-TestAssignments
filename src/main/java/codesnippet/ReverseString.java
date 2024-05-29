package codesnippet;

import java.util.Iterator;

public class ReverseString {
	
	public static String reverseEvenWords(String str) {
		
		//Convert full string to  in to individual string - I am a software Tester
		String [] temp = str.split(" ");
		char [] ch;
		//Iterate through the array 
		for(int i=0; i<temp.length; i++) {
			//to pick the odd index of the array
			if(i%2!=0) {//am - ch[0] = a ch[1] = m
				ch= temp[i].toCharArray();
				//Reversal of the charArray 
					for(int j=1; j<ch.length; j++) {
						ch[j-1] = ch[ch.length-j];
					}
			}
		}
		
		
		return str;
	
	}
	
	

    
}
      