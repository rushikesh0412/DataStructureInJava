package com.rushi.arrays;

public class CountEvenAndOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int oddCout = 0;
		int evenCount = 0;
		
		for(int num : nums) {
			if(num%2 == 0) {
				evenCount++;
			}else {
				oddCout++;
			}
		}
		
		System.out.println("Even Numbers: "+ evenCount);
		System.out.println("Odd Numbers: "+ oddCout);
		
	}

}
