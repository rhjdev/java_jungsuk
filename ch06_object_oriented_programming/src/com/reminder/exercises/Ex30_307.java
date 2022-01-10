package com.reminder.exercises;

class Document {
	static int count = 0;
	String name;
	
	Document() {
		this("제목없음" + ++count);
	}
	Document(String name) {
		this.name = name;
		System.out.println("문서 " + this.name + "이(가) 생성되었습니다.");
	}
}
public class Ex30_307 {

	public static void main(String[] args) {
		Document doc1 = new Document();
		Document doc2 = new Document("자바.txt"); //값을 지정하면 이 이름으로 생성된다.
		Document doc3 = new Document();
		Document doc4 = new Document();
	}

}
