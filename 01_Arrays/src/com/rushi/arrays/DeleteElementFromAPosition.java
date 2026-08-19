package com.rushi.arrays;

public class DeleteElementFromAPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int position = 2;
		
		int[] newArray = new int[nums.length - 1];
		
		for(int i=0, j=0; i<nums.length; i++) {
			if(i == position) {
				continue;
			}else {
				newArray[j] = nums[i];
				j++;
			}
		}
		System.out.print("Array after deletion: ");
		for(int number : newArray) {
			System.out.print(number + " ");
		}
	}

}
