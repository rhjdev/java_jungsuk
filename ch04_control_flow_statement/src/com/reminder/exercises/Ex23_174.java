package com.reminder.exercises;

public class Ex23_174 {

	public static void main(String[] args) {
		
		for(int i=1; i <= 39; i++) {
			System.out.printf("%d", i);
			
			int tmp = i;
			
			do {
				if(tmp % 3 == 0 && tmp % 10 != 0) {
					System.out.print("짝");
				}
			} while((tmp /= 10) != 0);
			
			System.out.println();
		}

	}

}
