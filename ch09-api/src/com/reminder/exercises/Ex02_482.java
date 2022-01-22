package com.reminder.exercises;

public class Ex02_482 {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("01");
		StringBuffer sbB = sb.append("23");
		sb.append('4').append(56);
		StringBuffer sbC = sb.append(78);
		sb.append(9.0);
		
		System.out.println("sb=" + sb);
		System.out.println("sbB=" + sbB);
		System.out.println("sbC=" + sbC);
		
		System.out.println("sb=" + sb.deleteCharAt(10));
		System.out.println("sb=" + sb.delete(3,  6));
		System.out.println("sb=" + sb.insert(3, "abc"));
		System.out.println("sb=" + sb.replace(6, sb.length(), "dfg"));
		
		System.out.println("capacity=" + sb.capacity());
		System.out.println("length=" + sb.length());
		
		/* StringBuffer 비교 */
		StringBuffer sb1 = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");
		System.out.println("sb1 == sb2 ? " + (sb1 == sb2));
		System.out.println("sb1.equals(sb2) ? " + sb1.equals(sb2));
		String s1 = sb1.toString();
		String s2 = sb2.toString();
		System.out.println("s1.equals(s2) ? " + s1.equals(s2));
	}
}
