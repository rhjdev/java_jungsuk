package com.reminder.exercises;

public class Ex05 {

	public static void main(String[] args) {
		
		int count=0;
		for(int i=1; i <= 6; i++) {
			for(int j=1; j <= 6; j++) {
				if(i + j == 6) {
					System.out.println(i + " + " + j + " = " + (i + j));
					count++;
				}
			}
		}
		
		System.out.println("눈의 합이 6이 되는 경우의 수 = " + count);

	}

}
