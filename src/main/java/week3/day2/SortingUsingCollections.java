package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollections {
	
	public static void main(String[] args) {
		 String[] arr ={"HCL", "Wipro", "Aspire Systems", "CTS"};
		 List<String> list=new ArrayList<>(Arrays.asList(arr));
		 Collections.sort(list);
		 for(int i=list.size()-1;i>=0;i--) {
			 System.out.println(list.get(i));
		 
		 }
 
	}

}
