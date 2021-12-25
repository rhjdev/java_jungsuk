package com.reminder.exercises;

public class Ex11 {

	public static void main(String[] args) {
		
		int dan=2;
		while(dan < 10) {
			
			int num=1;
			while(num < 4) {
				System.out.print(dan + " * " + num + " = " + (dan*num) + "\t");
				num++;
			}
			dan++;
			System.out.println();
		}

	}

}
