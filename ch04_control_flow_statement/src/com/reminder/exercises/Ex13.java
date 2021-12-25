package com.reminder.exercises;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		
		int answer = (int)(Math.random() * 100) + 1;
		int count = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			count++;
			System.out.print("100 이하 숫자를 입력하세요. > ");
			int input = scanner.nextInt();
			
			if(input > answer) {
				System.out.println("더 작은 수를 입력하세요. > ");
			} else if(input < answer) {
				System.out.println("더 큰 수를 입력하세요. > ");
			} else {
				System.out.println("정답입니다!");
				System.out.println(count + "번째 시도만에 정답을 맞추셨습니다.");
				break;
			}
			
		} while(true);

	}

}
