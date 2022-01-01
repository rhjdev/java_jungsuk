package com.reminder.exercises;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		/* 동전 단위와 개수 */
		int[] coinUnit = {500, 100, 50, 10};
		int[] coin = {5, 5, 5, 5};
		
		/* 거스름돈 입력 */
		System.out.println("===== 거스름돈 =====");
		Scanner scanner = new Scanner(System.in);
		System.out.print("거스름돈 > ");
		int change = scanner.nextInt();
		
		int coinNum = 0;
		for(int i=0; i < coinUnit.length; i++) {
			/* 단위마다 필요한 개수 */
			coinNum = change / coinUnit[i];
			
			/* 개수 판단 */
			if(coinNum >= coin[i]) {
				coinNum = coin[i];
				coin[i] = 0; //0으로 변경
			} else {
				coin[i] -= coinNum;
			}
			change -= coinNum*coinUnit[i]; //남은 값 변경
			System.out.println(coinUnit[i] + "원 : " + coinNum);
		}
		
		if(change > 0) {
			System.out.println("거스름돈이 부족합니다.");
			System.out.println("프로그램을 종료합니다.");
		}
		
		System.out.println("=== 남은 동전 갯수 ===");
		for(int i=0; i < coinUnit.length; i++) {
			System.out.println(coinUnit[i] + "원 : " + coin[i]);
		}

	}

}
