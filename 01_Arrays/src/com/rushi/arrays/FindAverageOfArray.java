package com.rushi.arrays;

public class FindAverageOfArray {

	public static void main(String args[]) {
		int[] nums = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		
		int sum = 0;
		
		for(int num : nums) {
			sum += num;
		}
		
		double average = (double)sum / nums.length;
		
		System.out.println("Average of Array: " + average);
	}
}
