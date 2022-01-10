package com.reminder.exercises;

public class Ex20 {
	
	public static int[] shuffle(int[] arr) {
		/* 유효성 체크 */
		if(arr==null || arr.length==0) {
			return arr;
		}
		/* 배열 인덱스 값 셔플 */
		for(int i=0; i < arr.length; i++) {
			int random = (int)(Math.random() * arr.length);
			int tmp = arr[i];
			arr[i] = arr[random];
			arr[random] = tmp;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println(java.util.Arrays.toString(original));
		
		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));
	}

}
