package com.reminder.exercises;

public class Ex02_318 {

	public static void main(String[] args) {
		/* 배열 초기화 A. */
//		Point[] p = new Point[3];
//		p[0] = new Point(100, 100);
//		p[1] = new Point(140, 50);
//		p[2] = new Point(200, 100);
		/* 배열 초기화 B. */
		Point[] p = { new Point(100, 100), new Point(140, 50), new Point(200, 100) };
		
		Triangle t = new Triangle(p);
		Circle c = new Circle(new Point(150, 150), 50);
		t.draw();
		c.draw();
		t.changeColor("yellow");
		t.draw();
	}
}

class Shape {
	String color = "black";
	void draw() {
		System.out.printf("[color=%s]%n", color);
	}
	void changeColor(String color) {
		this.color = color;
	}
}

class Point {
	int x;
	int y;
	
	public Point() {
		this(0, 0);
	}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	String getPoints() {
		return "(" + x + ", " + y + ")";
	}
}

class Circle extends Shape {
	Point center;
	int radius;
	
	public Circle() {
		this(new Point(0, 0), 100);
	}

	public Circle(Point center, int radius) {
		this.center = center;
		this.radius = radius;
	}
	
	@Override
	void draw() {
		System.out.printf("[center=(%d, %d), radius=%d, color=%s]%n", center.x, center.y, radius, color);
	}
	@Override
	void changeColor(String color) {
		this.color = color;
	}
}

class Triangle extends Shape {
	Point[] p = new Point[3];
	
	public Triangle(Point[] p) {
		this.p = p;
	}
	
	@Override
	void draw() {
		System.out.printf("[p1=%s, p2=%s, p3=%s, color=%s]%n", p[0].getPoints(), p[1].getPoints(), p[2].getPoints(), color);
	}
	@Override
	void changeColor(String color) {
		this.color = color;
	}
}
