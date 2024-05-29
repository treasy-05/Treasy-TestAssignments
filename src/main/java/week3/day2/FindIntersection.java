package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {
	
	public static void main(String[] args) {
		
        Integer[] array1 = {3, 2, 11, 4, 6, 7};
        Integer[] array2 = {1, 2, 8, 4, 9, 7};

       
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < array1.length; i++) {
        	list.add(array1[i]);
        	
			
		}
        
        for (int i = 0; i < list.size(); i++) {
        	for (int j = 0; j < array2.length; j++) {
        	  if (list.get(i) == array2[j]) {
                    System.out.println("Intersection at index " + i + ": " + list.get(i));
				
			}
			
		}
    }

	}

		
}


