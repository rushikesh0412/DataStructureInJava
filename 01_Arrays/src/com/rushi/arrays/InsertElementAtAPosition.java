package com.rushi.arrays;

public class InsertElementAtAPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int position = 2;
		int newElement = 25;
		
		int[] newArray = new int[nums.length + 1];
		
		for( int i=0, j=0; i<newArray.length; i++) {
			if(position == i) {
				newArray[i] = newElement;
			}else {
				newArray[i] = nums[j];
				j++;
			}
		}
		
		System.out.println("Array after insertion:");

        for (int number : newArray) {
            System.out.print(number + " ");
        }
	}

}
