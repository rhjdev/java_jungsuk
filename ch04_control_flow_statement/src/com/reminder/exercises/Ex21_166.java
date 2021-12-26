package com.reminder.exercises;

public class Ex21_166 {

	public static void main(String[] args) {
		
		int[] arr = {100, 200, 300, 400, 500};
		int sum = 0;
		
		for(int i=0; i < arr.length; i++) {
			System.out.printf("%d ", arr[i]);
		}
		System.out.println();
		
		for(int tmp : arr) {
			System.out.printf("%d ", tmp);
			sum += tmp;
		}
		System.out.println();
		System.out.println("sum = " + sum);

	}

}
