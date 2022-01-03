package com.reminder.exercises;

public class SutdaCard {
	
	int num;
	boolean isKwang;
	
	/* 기본 생성자 */
	public SutdaCard() {
		this(1, true);
//		this.num = 1;
//		this.isKwang = true;
	}
	/* 매개변수 있는 생성자 */
	public SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	public String info() {
		return num + (isKwang ? "K" : "");
	}

}
