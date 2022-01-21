package com.reminder.exercises;

final class Singleton { /* 상속할 수 없는 클래스 선언 */
	private static Singleton s = new Singleton();
	
	private Singleton() {}
	public static Singleton getInstance() {
		if(s == null) {
			s = new Singleton();
		}
		return s;
	}
}
public class Ex04_352 {

	public static void main(String[] args) {
//		Singleton s = new Singleton();
		Singleton s = Singleton.getInstance();
	}
}
