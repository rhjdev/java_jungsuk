package com.reminder.exercises;

public class Ex08 {
	
	public static String filezero (String src, int length) {
		if(src == null || src.length() == length) {
			return src;
		} else if (length <= 0) {
			return "";
		} else if (src.length() > length) {
			return src.substring(0, length); //beginIndex, endIndex
		}
		
		char[] carr = new char[length];
		for(int i=0; i < carr.length; i++) {
			carr[i] = '0';
		}
		
		System.arraycopy(src.toCharArray(), 0, carr, length-src.length(), src.length());
		return new String(carr);
		
	}
	public static void main(String[] args) {
		String src = "12345";
		System.out.println(filezero(src, 10));
		System.out.println(filezero(src, -1));
		System.out.println(filezero(src, 3));
	}
}
