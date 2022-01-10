package com.reminder.exercises;

public class Ex23 {
	
	public static int max(int[] arr) {
		/* 유효성 검사 */
		if(arr==null || arr.length==0) {
			return -999999;
		}
		int maxNum = arr[0]; //0번째 값으로 임의 설정
		for(int i=1; i < arr.length; i++) {
			if(maxNum < arr[i]) {
				maxNum = arr[i];
			}
		}
		return maxNum;
		
	}

	public static void main(String[] args) {
		
		int[] data = {3,2,9,4,7};
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("최대값 : "+max(data));
		System.out.println("최대값 : "+max(null));
		System.out.println("최대값 : "+max(new int[]{}));

	}

}
