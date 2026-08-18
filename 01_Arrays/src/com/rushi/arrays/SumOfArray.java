package com.rushi.arrays;

public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		
		int sum = 0;
		
		for(int num : nums) {
			sum += num;
		}
		
		System.out.println("Sum of Array: " + sum);

	}

}
