package com.reminder.exercises;

import java.util.Scanner;

public class Ex17_155 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("당신의 주민등록번호를 입력하세요. > ");
		String regNo = scanner.nextLine();
		
		char gender = regNo.charAt(7);
		
		switch(gender) {
		case '1': case '3':
			System.out.print("당신은 남자이고, ");
			switch(gender) {
			case '1':
				System.out.print("2000년 이전 출생입니다.");
				break;
			case '3':
				System.out.print("2000년 이후 출생입니다.");
				break;
			}
			break; //중요!
		case '2': case '4':
			System.out.print("당신은 여자이고, ");
			switch(gender) {
			case '2':
				System.out.print("2000년 이전 출생입니다.");
				break;
			case '4':
				System.out.print("2000년 이후 출생입니다.");
				break;
			}

		}
		
	}
	
}