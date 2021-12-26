package com.reminder.exercises;

import java.util.Scanner;

public class Ex15_145 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("점수를 입력해 주세요. > ");
		int score = scanner.nextInt();
		
		char grade = ' ';
		char opt = ' ';
		
		if(score >= 90) {
			grade = 'A';
			if(score >= 98) {
				opt = '+';
			} else if(score < 94) {
				opt = '-';
			} else {
				opt = '0';
			}
		} else if(score >= 80) {
			grade = 'B';
			if(score >= 88) {
				opt = '+';
			} else if(score < 84) {
				opt = '-';
			} else {
				opt = '0';
			}
		} else if(score >= 70) {
			grade = 'C';
			if(score >= 78) {
				opt = '+';
			} else if(score < 74) {
				opt = '-';
			} else {
				opt = '0';
			}
		} else if(score >= 60) {
			grade = 'D';
			if(score >= 68) {
				opt = '+';
			} else if(score < 64) {
				opt = '-';
			} else {
				opt = '0';
			}
		} else {
			grade = 'F';
		}
		
		System.out.printf("당신의 점수는 %d점입니다.%n", score);
		System.out.printf("당신의 학점은 %c%c입니다.%n", grade, opt);

	}

}
