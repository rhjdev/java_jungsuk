package com.reminder.exercises;

public class Ex10_95 {

	public static void main(String[] args) {
		
		/* println()에게 대입되는 순서 차이 */
		int i = 3, j = 3;
		System.out.println(i++);
		System.out.println(++j);
		System.out.println("i = " + i + ", j = " + j);
		
		/* 부호 연산자 */
		int k = -5;
		k = -k;
		System.out.println(k);
		
	}

}
