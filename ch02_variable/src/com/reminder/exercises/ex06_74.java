package com.reminder.exercises;

public class ex06_74 {

	public static void main(String[] args) {
		
		int n = 56;
//		char ch = n;
		char ch = (char)n;
		System.out.println("int to char=" + n);
		System.out.println("n=" + n);
		
		char ar = 'T';
		int n2 = ar;
		System.out.println("char to int=" + n2);
		System.out.println("char=" + ar);
		
		double d = 12.34;
		int n3 = (int)d;
		System.out.println("double to int=" + n3);
		System.out.println("d=" + d);
		
		int n4 = 10;
		float f = (float)n4;
		System.out.println("int to float=" + f);
		System.out.println("j=" + n4);
		
		/* float-double간 저장 값의 정밀도 차이 */
		float f2 = 9.87654321f;
		double d2 = 9.87654321;
		float a2 = (float)d2;
		double d3 = (double)f2;
		int n5 = (int)f2;
		int n6 = (int)d2;
		System.out.println("double to float=" + d2);
		System.out.println("float to double=" + f2);
		System.out.println("float to int=" + n5);
		System.out.println("double to int=" + n6);
		
		/* 10진수를 2진수로 변환하는 문자열 메소드 */
		System.out.println("n=" + n + ", " + Integer.toBinaryString(n));
		System.out.println("ar=" + ar + ", " + Integer.toBinaryString(ar));
		System.out.println("n4=" + n4 + ", " + Integer.toBinaryString(n4));

	}

}
