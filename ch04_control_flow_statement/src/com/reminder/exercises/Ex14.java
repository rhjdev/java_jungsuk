package com.reminder.exercises;

public class Ex14 {

	public static void main(String[] args) {
		
		int num = 12321;
		int tmp = num;
		int result = 0;
		
		while(tmp != 0) {
			result = result * 10 + tmp % 10;
			tmp /= 10;
		}
		
		if(num == result) {
			System.out.println(num + "는 회문수입니다.");
		} else {
			System.out.println(num + "는 회문수가 아닙니다.");
		}

	}

}
