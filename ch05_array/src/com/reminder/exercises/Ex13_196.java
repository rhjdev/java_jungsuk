package com.reminder.exercises;

public class Ex13_196 {

	public static void main(String[] args) {
		
		int[] score = {70, 80, 90, 100, 100, 50, 40};
		
		/* 총합, 평균 */
		int sum=0;
		float average=0.0f;
		
		for(int i=0; i < score.length; i++) {
			sum += score[i];
		}
		average = (float)sum / score.length;
		System.out.printf("총합 : %d%n", sum);
		System.out.printf("평균 : %.2f%n", average);
		
		/* 최대값, 최소값 */
		int max=score[0];
		int min=score[0];
		for(int i=0; i < score.length; i++) {
			if(max < score[i]) {
				max = score[i];
			}
			if(min > score[i]) {
				min = score[i];
			}
		}
		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
	}

}
