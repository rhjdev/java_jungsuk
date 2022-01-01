package com.reminder.exercises;

public class Ex14_199 {

	public static void main(String[] args) {
		
		int[] ball = new int[45];
		
		for(int i=0; i < ball.length; i++) {
			ball[i] = i + 1;
		}
		
		int tmp=0;
		for(int i=0; i < 6; i++) {
			int random = (int)(Math.random() * 45) + 1;
			tmp = ball[i];
			ball[i] = ball[random];
			ball[random]=tmp;
		}
		
		for(int i=0; i < 6; i++) {
			System.out.printf("ball[" + (i+1) + "]=" + ball[i] + "%n");
		}

	}

}
