package com.reminder.exercises;

public class Ex04 {

	public static void main(String[] args) {
		
		/* for문 */
		System.out.println("========= for문 =========" );
		for(int i=0; i <=10; i++) {
			for(int j=0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		/* while문 */
		System.out.println("========= while문 =========" );
		int i=0;
		while(i <= 10) {
			int j=0;
			while(j <= i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
