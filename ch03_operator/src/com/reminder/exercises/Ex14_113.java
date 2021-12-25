package com.reminder.exercises;

import java.util.Scanner;

public class Ex14_113 {

	public static void main(String[] args) {
		
		/* 문자열 비교 */
		Scanner scanner = new Scanner(System.in);
		System.out.print("택 1. 사과, 딸기, 배? > ");
		String fruit = scanner.nextLine();
		
		System.out.printf("사과를 고르셨군요 ? %b%n", fruit.equals("사과"));
		System.out.printf("딸기를 고르셨군요 ? %b%n", fruit.equals("딸기"));
		System.out.printf("배를 고르셨군요 ? %b%n", fruit.equals("배"));
		
		System.out.print("ABC를 입력하세요 > ");
		String abc = scanner.nextLine();
		
		System.out.printf("ABC ? %b%n", abc.equals("ABC"));
		System.out.printf("abc ? %b%n", abc.equals("abc"));
		System.out.printf("ABC 또는 abc ? %b%n", abc.equalsIgnoreCase("ABC"));

	}

}
