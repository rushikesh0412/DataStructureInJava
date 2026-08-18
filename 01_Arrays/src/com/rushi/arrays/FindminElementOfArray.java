package com.rushi.arrays;

public class FindminElementOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		
		int minElement = nums[0];
		
		for(int i=1; i<nums.length; i++) {
			if(nums[i] < minElement) {
				minElement = nums[i];
			}
		}
		
		System.out.println("Minimum Element: " + minElement);

	}

}
