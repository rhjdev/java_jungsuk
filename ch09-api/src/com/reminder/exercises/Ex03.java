package com.reminder.exercises;

public class Ex03 {

	public static void main(String[] args) {
		SutdaCard c1 = new SutdaCard(3, true);
		SutdaCard c2 = new SutdaCard(3, true);
		
		System.out.println("c1=" + c1);
		System.out.println("c2=" + c2);
		System.out.println("c1.equals(c2) : " + c1.equals(c2));
	}
}

class SutdaCard {
	int num;
	boolean isKwang;
	
	SutdaCard() {
		this(1, true); //기본생성자 통해 초기화
	}
	
	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof SutdaCard) {
			SutdaCard c = (SutdaCard)obj;
			return num==c.num && isKwang==c.isKwang;
		}
		
		return false;
//		if(obj.equals(num) || obj.equals(isKwang)) {
//			return true;
//		} else {
//			return false;
//		}
	}
	
	@Override
	public String toString() {
		return num + ( isKwang ? "K" : "");
	}
}
