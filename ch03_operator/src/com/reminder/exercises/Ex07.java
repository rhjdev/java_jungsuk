package com.reminder.exercises;

public class Ex07 {

	public static void main(String[] args) {
		
		byte a = 10;
		byte b = 20;
		byte c = (byte)(a + b);
		System.out.println("c="+c);
		
		char ch = 'A';
		/* 주어진 오류 코드 */
//		ch = ch + 2;
		/* 변경 코드 */
//		ch += 2;
		/* 답안 코드 */
		ch = (char)(ch + 2);
		System.out.println("ch="+ch);
		
		float f = 3 / 2f;
		long l = 3000 * 3000 * 3000L;
		System.out.println("f="+f);
		System.out.println("l="+l);
		
		float f2 = 0.1f;
		/* 주어진 코드 */
//		double d = 0.1;
		/* 변경 코드 */
		double d = (float)0.1;
		/* 답안 코드 */
//		boolean result = (float)d==f2;
		boolean result = d==f2;
		System.out.println("result="+result);

	}

}
