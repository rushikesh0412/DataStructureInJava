package com.rushi.arrays;

public class SearchAnElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		
		int searchElement = 30;
		boolean found = false;
		
		for(int i=1; i<nums.length; i++) {
			if(nums[i] == searchElement) {
				System.out.println("Element found at Index: " + i);
				found = true;
				break;
			}
		}
		
		if(!found) {
			System.out.println("Element not found");
		}

	}

}
