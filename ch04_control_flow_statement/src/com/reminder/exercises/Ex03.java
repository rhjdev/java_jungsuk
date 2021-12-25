package com.reminder.exercises;

public class Ex03 {

	public static void main(String[] args) {
		
		int num = 0;
		int sum = 0;
		int sign = 1;
		for(int i=1; true; i++, sign=-sign) {
			num = i * sign;
			sum += num;
			if(sum >= 100) {
				break;
			}
		}
		
		System.out.println("num = " + num);
		System.out.println("sum = " + sum);
	}
	
}
