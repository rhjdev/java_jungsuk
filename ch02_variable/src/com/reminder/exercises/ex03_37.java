package com.reminder.exercises;

public class ex03_37 {

	public static void main(String[] args) {
		
		byte b = 1;
		short s = 2;
		int i = 4;
		long l = 8L;
		
		char ch = 'A';
		
		int month = 12;
		
		/* printf()는 println()과 달리 자동 개행 기능이 없어 지시자 %n 입력해야 한다. */
		/* 10진수 정수로 출력할 때 지시자 %d */
		System.out.printf("b=%d%n", b);
		System.out.printf("s=%d%n", s);
		System.out.printf("i=%d%n", i);
		System.out.printf("l=%d%n", l);
		System.out.printf("정수형 자료형의 byte 크기=%d, %d, %d, %d%n", b, s, i, l);
		
		/* 문자로 출력할 때 지시자 %c */
		System.out.printf("ch=%c%n", ch);
		System.out.printf("ch=%c, %d%n", ch, (int)ch);
		
		System.out.printf("month=[%6d]%n", month);
		System.out.printf("month=[%-6d]%n", month);
		System.out.printf("month=[%06d]%n", month);
		
	}

}
