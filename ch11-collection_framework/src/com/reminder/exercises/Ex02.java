package com.reminder.exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class Student implements Comparable<Student> {
	
	String name;
	int ban;
	int no;
	int kor, eng, math;
	
	public Student() {}
	
	public Student(String name, int ban, int no, int kor, int eng, int math) {
		super();
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBan() {
		return ban;
	}

	public void setBan(int ban) {
		this.ban = ban;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", ban=" + ban + ", no=" + no + ", kor=" + kor + ", eng=" + eng + ", math="
				+ math + "]";
	}

	@Override
	public int compareTo(Student student) {
		return name.compareTo(student.name);
	}
	
}
public class Ex02 {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student("김자바", 7, 1, 100, 100, 100));
		list.add(new Student("이자바", 6, 2, 100, 90, 90));
		list.add(new Student("박자바", 5, 8, 90, 80, 90));
		list.add(new Student("구자바", 5, 4, 80, 80, 100));
		list.add(new Student("연자바", 5, 9, 70, 90, 90));
		
		Collections.sort(list);
		Iterator it = list.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
