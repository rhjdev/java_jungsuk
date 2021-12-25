package com.reminder.exercises;

public class Ex11_104 {

	public static void main(String[] args) {
		
		char ch = 'a';
		for(int i=0; i < 26; i++) {
			System.out.print(ch++);
		}
		System.out.println();
		
		ch = 'A';
		for(int i=0; i < 26; i++) {
			System.out.print(ch++);
		}
		System.out.println();
		
		ch = '0';
		for(int i=0; i < 10; i++) {
			System.out.print(ch++);
		}
	}

}
