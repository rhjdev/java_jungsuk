package com.reminder.exercises;

public class Ex01_442 {

	public static void main(String[] args) {
		
		try {
			methodA();
		} catch (Exception e) {
			System.out.println("main메소드에서 예외처리 완료");
			e.printStackTrace();
		}

	}
	
	static void methodA() throws Exception {
		try {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("methodA에서 예외처리 완료");
			throw e;
		}
	}
}
