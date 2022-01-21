package com.reminder.exercises;

class Card {
	final int NUMBER;
	final String KIND;
	static int width = 100;
	static int height = 250;
	
	public Card() {
		this(1, "HEART");
	}
	public Card(int num, String kind) {
		this.NUMBER = num;
		this.KIND = kind;
	}
	public String toString() {
		return KIND + " " + NUMBER;
	}
}

public class Ex03_346 {

	public static void main(String[] args) {
		
		System.out.println(new Card().toString()); //HEART 1
		Card c = new Card(5, "DIAMOND");
		System.out.println(c.toString()); //DIAMOND 5
	}
}
