package com.reminder.exercises;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		String[][] words = {{"chair", "의자"}, {"computer", "컴퓨터"}, {"integer", "정수"}};
		
		Scanner scanner = new Scanner(System.in);
		int correct=0;
		
		for(int i=0; i < words.length; i++) {
			System.out.printf("Q%d. %s의 뜻은? ", i+1, words[i][0]);
			String answer = scanner.nextLine();
			
			for(int j=0; j < words[i].length; j++) {
				if(answer.equals(words[i][1])) {
					System.out.println("정답입니다.");
					correct++;
					break;
				} else {
					System.out.println("틀렸습니다. 정답은 " + words[i][1] + "입니다.");
					break;
				}
			}
		}
		
		System.out.println("전체 " + words.length + "문제 중 " + correct + "문제 맞히셨습니다.");

	}

}
