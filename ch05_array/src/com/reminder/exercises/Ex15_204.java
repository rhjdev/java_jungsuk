package com.reminder.exercises;

public class Ex15_204 {

	public static void main(String[] args) {
		
		int[] iarr = new int[10];
		int[] count = new int[10];
		
		/* 난수 저장 */
		for(int i=0; i < iarr.length; i++) {
			iarr[i] = (int)(Math.random() * 10);
			System.out.print(iarr[i]);
		}
		System.out.println();
		
		/* 빈도수 판단 */
		for(int i=0; i < iarr.length; i++) {
			count[iarr[i]]++;
		}
		
		/* 출력 */
		for(int i=0; i < iarr.length; i++) {
			System.out.println(i +"의 개수 : " + count[i]);
		}

	}

}
