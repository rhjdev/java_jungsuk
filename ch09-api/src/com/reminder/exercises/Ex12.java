package com.reminder.exercises;

public class Ex12 {
	
	public static String format(String str, int length, int alignment) {
		int check = length - str.length();
		if(check < 0) return str.substring(0, length);
		
		char[] source = str.toCharArray();
		char[] result = new char[length];
		for(int i=0; i < result.length; i++)
		result[i] = ' ';
		
		switch(alignment) {
		case 0 :
		default :
		System.arraycopy(source, 0, result, 0, source.length);
		break;
		case 1 :
		System.arraycopy(source, 0, result, check/2, source.length);
		break;
		case 2 :
		System.arraycopy(source, 0, result, check, source.length);
		break;
		}
		
		return new String(result);
	}
	public static void main(String[] args) {
		String str = "가나다";
		
		System.out.println(format(str, 7, 0));
		System.out.println(format(str, 7, 1));
		System.out.println(format(str, 7, 2));

	}

}
