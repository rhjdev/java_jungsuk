package com.reminder.exercises;

import java.util.StringJoiner;

public class Ex01_472 {

	public static void main(String[] args) {
		
		String colors = "blue,yellow,green";
		String[] arr = colors.split("[,]");
		
		System.out.println(String.join("-", arr));
		
		StringJoiner j = new StringJoiner("/", "[", "]");
		for(String s : arr) {
			j.add(s);
		}
		System.out.println(j);
	}
}
