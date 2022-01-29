package com.reminder.exercises;

public class Ex09 {
	public static boolean contains(String src, String target) {
		return src.indexOf(target) != -1;
//		if(src.contains(target)) {
//			return true;
//		} else {
//			return false;
//		}
	}
	public static void main(String[] args) {
		System.out.println(contains("12345", "23"));
		System.out.println(contains("12345", "67"));
	}

}
