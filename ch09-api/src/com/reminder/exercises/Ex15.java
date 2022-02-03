package com.reminder.exercises;

public class Ex15 {

	public static void main(String[] args) {
		String src = "aabbccAABBCCaaAAAA";
		System.out.println(src);
		System.out.println("AA를 " + stringCount(src, "AA") + "개 찾았습니다.");
	}
	
	public static int stringCount(String src, String key) {
		return stringCount(src, key, 0);
	}
	
	public static int stringCount(String src, String key, int pos) {
		int count = 0;
		int index = 0;
		
		if(key == null || key.length() == 0) {
			return 0;
		}
		
		while((index = src.indexOf(key, pos)) != - 1) {
			count++;
			pos = index + key.length();
		}
		return count;
	}
}
