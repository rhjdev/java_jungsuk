package com.reminder.exercises;

public class Ex09 {

	public static void main(String[] args) {
		
		int[][] score = {{100, 100, 100}, {20, 20, 20}, {30, 30, 30}, {40, 40, 40}, {50, 50, 50}};
		
		int[][] result = new int [score.length + 1][score[0].length + 1];
		
		for(int i=0; i < score.length; i++) {
			for(int j=0; j < score[i].length; j++) {
				/* score 값들 모두 대입 */
				result[i][j] = score[i][j];
				/* 행 합계 */
				result[i][result[0].length - 1] += result[i][j];
				/* 열 합계 */
				result[result.length - 1][j] += result[i][j];
				/* 행간, 열간 총 합계 */
				result[result.length - 1][result[i].length - 1] += result[i][j];
			}
		}
		for(int i=0; i < result.length; i++) {
			for(int j=0; j < result[i].length; j++) {
				System.out.printf("%4d", result[i][j]);
			}
			System.out.println();
		}

	}

}
