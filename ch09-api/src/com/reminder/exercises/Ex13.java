package com.reminder.exercises;

public class Ex13 {
	
	public static int getRandom(int from, int to) {
		return (int)(Math.random() * (Math.abs(to-from) + 1)) + Math.min(from, to);
	}

	public static void main(String[] args) {
		for(int i=0; i < 20; i++) {
			System.out.print(getRandom(1, -3) + " ");
		}
	}

}
