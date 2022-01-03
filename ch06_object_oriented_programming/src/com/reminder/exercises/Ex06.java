package com.reminder.exercises;

public class Ex06 {

	public static void main(String[] args) {
		System.out.println(getDistance(1,1,2,2));
		
		MyPoint p = new MyPoint(1, 1);
		System.out.println(p.getDistance(2, 2));
	}
	
	static double getDistance(int x, int y, int x1, int y1) {
//		return Math.sqrt(((x - x1) * (x - x1)) + (y - y1) * (y - y1));
		return Math.sqrt(Math.pow(x - x1, 2) + Math.pow(y - y1, 2));
	}

}
