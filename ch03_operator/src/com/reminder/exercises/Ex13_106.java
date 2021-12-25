package com.reminder.exercises;

public class Ex13_106 {

	public static void main(String[] args) {
		/* 소수점자리 버리기 */
		float pi = 3.141592f;
		/* 1. 출력값 3141.592 */
//		float a = pi * 1000f;
//		System.out.println(a);
		/* 2.  출력값 3141.0 */
//		float b = (int)(pi * 1000);
//		System.out.println(b);
		float result = (int)(pi * 1000) / 1000f;
		System.out.println(result);
		
		/* 반올림하기 */
		double piNum = 3.141592;
		/* A. 형변환 이용 */
		System.out.println((int)(piNum * 1000 + 0.5) * 0.001);
		System.out.println((int)(piNum * 1000 + 0.5) / 1000.0);
		/* B. Math.round() 이용 */
		System.out.println(Math.round(piNum));
		System.out.println(Math.round(piNum * 100));
		System.out.println((Math.round(piNum * 1000) / 1000.0));
	}

}
