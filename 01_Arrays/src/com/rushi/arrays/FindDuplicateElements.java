package com.rushi.arrays;

public class FindDuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1, 2, 3, 3, 5, 6, 7, 8, 9, 10};
		
		System.out.print("Duplicate Elements: ");
		
		for(int i=0; i<nums.length-1; i++)
		{
			for(int j = i+1; j<nums.length; j++) {
				if(nums[i] == nums[j]) {
					System.out.println(nums[i]);
					break;
				}
			}
		}
	}

}
