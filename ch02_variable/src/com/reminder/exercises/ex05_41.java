package com.reminder.exercises;

import java.util.*;

public class ex05_41 {

	public static void main(String[] args) {
		
		/* 1. Scanner 클래스 사용 위해 import 추가 */
		/* 2. Scanner 클래스 객체 생성 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("0~9 사이 가장 좋아하는 숫자를 입력해 주세요.>");
		/* 3. 입력 받은 값을 변수에 저장 */
		String input = scanner.nextLine();
		/* 4. 입력 받은 문자열 내용을 정수로 변환 */
		int num = Integer.parseInt(input);
		
		System.out.println("입력하신 숫자는 " + num + "입니다.");
		System.out.printf("num=%d", num);

	}

}
