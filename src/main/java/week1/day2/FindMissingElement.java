package week1.day2;

import java.util.Arrays;

public class FindMissingElement {
	
	public static void main(String[] args) {
		int[] nums= {1, 4,3,2,8, 6, 7};//1,2,3,4,6,7,8
		Arrays.sort(nums);
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i]!=i+1) {
				System.out.println(i+1);
				break;

				
			}
			
		}
	}

}
