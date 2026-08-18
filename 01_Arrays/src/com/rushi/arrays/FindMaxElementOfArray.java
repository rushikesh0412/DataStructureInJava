package com.rushi.arrays;

public class FindMaxElementOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		
		int maxElement = nums[0];
		
		for(int i=1; i<nums.length; i++) {
			if(nums[i] > maxElement) {
				maxElement = nums[i];
			}
		}
		
		System.out.println("Maximum Element: " + maxElement);

	}

}
