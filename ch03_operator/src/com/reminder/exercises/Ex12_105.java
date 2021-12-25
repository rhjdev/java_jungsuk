package com.reminder.exercises;

public class Ex12_105 {

	public static void main(String[] args) {
		/* 대소문자 변경 */
		char ch = 'A';
		char lowerCase = (char)(ch + 32);
		System.out.println("ch = " + ch + ", lowerCase = " + lowerCase);
		
		ch = 'a';
		char upperCase = (char)(ch - 32);
		System.out.println("ch = " + ch + ", upperCase = " + upperCase);
		
	}

}
