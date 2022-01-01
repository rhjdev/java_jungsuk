package com.reminder.exercises;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		int[] coinUnit = {50, 500, 10, 100};
		
		/* 내림차순 정렬 */
		for(int i=1; i < coinUnit.length; i++) {
			for(int j=0; j < i; j++) {
				int tmp=0;
				if(coinUnit[i] > coinUnit[j]) {
					tmp = coinUnit[i];
					coinUnit[i] = coinUnit[j];
					coinUnit[j] = tmp;
				}
			}
		}
		
		/* 내림차순 정렬 후 확인 */
		System.out.print("coinUnit 내림차순 정렬 : ");
		for(int i=0; i < coinUnit.length; i++) {
			System.out.print(coinUnit[i] + " ");
		}
		System.out.println();
		
		/* 금액 입력 받기로 가정 */
		Scanner scanner = new Scanner(System.in);
		System.out.print("받은 금액 > ");
		int money = scanner.nextInt();
		System.out.print("상품 가격 > ");
		int price = scanner.nextInt();
		
		int change = money - price;
		int count = 0;
		
		for(int i=0; i < coinUnit.length; i++) {
			count = change / coinUnit[i];
			System.out.println(coinUnit[i] + "원 동전 " + count + "개");
			change %= coinUnit[i];
		}
		
	}

}
