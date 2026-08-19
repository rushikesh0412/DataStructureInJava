package com.rushi.arrays;

public class CopyAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1, 2, 3, 3, 5, 6, 7, 8, 9, 10};
		
		int[] copy = new int[nums.length];
		
		for(int i=0; i<nums.length; i++) {
			copy[i] = nums[i];
		}
		System.out.print("Copied of Array: ");
		for(int number : copy) {
			System.out.print(number + " ");
		}
	}

}
