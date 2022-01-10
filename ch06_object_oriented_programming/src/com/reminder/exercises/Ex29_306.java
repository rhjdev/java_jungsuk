package com.reminder.exercises;

class Product {
	static int count = 0;
	int serialNo;
	/* 인스턴스 생성 시마다 수행되는 인스턴스 블럭 */
	{ 
		++count;
		serialNo = count;
	}
	public Product() {}
}

public class Ex29_306 {

	public static void main(String[] args) {
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		
		System.out.println("Serial No. " + p1.serialNo);
		System.out.println("Serial No. " + p2.serialNo);
		System.out.println("Serial No. " + p3.serialNo);
		System.out.println("생상된 제품 수량은 총 " + Product.count + "개입니다.");
	}

}
