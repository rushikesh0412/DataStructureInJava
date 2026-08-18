package com.rushi.arrays;

public class ReverseAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		
		System.out.print("Original Array: ");
		for(int num : nums) {
			System.out.print(num + " ");
		}
		
		System.out.print("\n\nReverse Array: ");
		for(int i = nums.length -1; i>=0; i--) {
			System.out.print(nums[i] + " ");
		}
	}

}
