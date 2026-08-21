package com.rushi.bubble.sort;

public class BubbleSortImproved {
	
	static void printArray(int[] numbers) {
		for(int num : numbers) {
			System.out.print(num + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers = {64, 34, 25, 12, 22, 11, 90};
		
		System.out.println("Before Srting: ");
		printArray(numbers);
		
		for(int i =0; i< numbers.length - 1; i++) {
			for(int j=0; j<numbers.length - 1 - i; j++) {
				if(numbers[j] > numbers[j+1]) {
					int temp = numbers[j];
					numbers[j] = numbers[j+1];
					numbers[j+1] = temp;
				}
			}
		}
		
		
		System.out.println("After Srting: ");
		printArray(numbers);

	}

}
