package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {
	
	public static void main(String[] args) {
		
		Integer[] array= {3, 2, 11, 4, 6, 7};
		 List<Integer> list=new ArrayList<>(Arrays.asList(array));
		 Collections.sort(list);	
		 System.out.println("Second largest number: " + list.get(list.size() - 2));
		 
		
	}

}
