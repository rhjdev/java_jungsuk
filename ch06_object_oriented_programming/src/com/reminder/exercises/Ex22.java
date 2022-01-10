package com.reminder.exercises;

public class Ex22 {
	
	public static boolean isNumber(String str) {
		/* 유효성 체크 */
		if(str==null || str.equals("")) {
			return false;
		}
		/* 문자열 확인 */
		char check=' ';
		for(int i=0; i < str.length(); i++) {
			check = str.charAt(i);
		}
		if('0' > check || check > '9') {
			return false;
		} else {
			return true;
		}
	}
	public static void main(String[] args) {
		String str = "123";
		System.out.println(str + "는 숫자입니까? " + isNumber(str));
		
		str = "1234o";
		System.out.println(str + "는 숫자입니까? " + isNumber(str));

	}

}
