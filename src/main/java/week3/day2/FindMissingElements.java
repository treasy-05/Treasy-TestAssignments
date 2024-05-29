package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindMissingElements {
	
	public static void main(String[] args) {
				
        Integer[] array = {1, 2, 3, 4, 10, 6, 8}; 
        List<Integer> list = new ArrayList<>(Arrays.asList(array));
        Collections.sort(list); 
        for (int i = 0; i < list.size() - 1; i++) {
            int current = list.get(i);
            int next = list.get(i + 1);  
            if (current + 1 != next) {
                System.out.println("Missing element: " + (current +1));
            }
        }
    }
}


		
