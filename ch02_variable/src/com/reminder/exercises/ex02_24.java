package com.reminder.exercises;

public class ex02_24 {

	public static void main(String[] args) {
		
		/* 두 변수의 값 교환하기 */
		int i = 100;
		int j = 200;
		System.out.println("i=" + i + " j=" + j);
		/* 1. 임시 변수 선언 */
		int tmp = 0;
		/* 2. 변수간 값 교환 */
		tmp = i;
		i = j;
		j = tmp;
		
		System.out.println("i=" + i + " j=" + j);

	}

}
