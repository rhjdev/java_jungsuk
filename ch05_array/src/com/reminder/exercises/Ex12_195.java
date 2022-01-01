package com.reminder.exercises;

import java.util.Arrays;

public class Ex12_195 {

	public static void main(String[] args) {
		
		char[] abc = {'A', 'B', 'C', 'D'};
		char[] num = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		System.out.println(abc);
		System.out.println(num);
		
		/* A. for문 */
		System.out.println("====== A. for문 ======");
		char[] copyA = new char[abc.length + num.length];
		/* A-1. abc 복사 */
		for(int i=0; i < abc.length; i++) {
			copyA[i] = abc[i];
		}
		/* A-2. num 복사 */
		for(int i=0; i < num.length; i++) {
			copyA[abc.length + i] = num[i];
		}
		/* A-3. 출력 */
		System.out.println("copyA length : " + copyA.length);
		System.out.print("copyA : ");
		for(int i=0; i < copyA.length; i++) {
			System.out.print(copyA[i] + " ");
		}
		System.out.println();
		
		/* B. .clone() */
		System.out.println("====== B. clone() ======");
		char[] copyB = new char[abc.length + num.length];
		System.out.println("복제 전 copyB length : " + copyB.length);
		copyB = abc.clone();
		System.out.println("복제 후 copyB length : " + copyB.length);
		
		System.out.print("copy B : ");
		for(int i=0; i < copyB.length; i++) {
			System.out.print(copyB[i] + " ");
		}
		System.out.println();
		
		/* C. System.arraycopy() */
		System.out.println("====== C. System.arraycopy() ======");
		char[] copyC = new char[abc.length + num.length];
		System.arraycopy(abc, 0, copyC, 0, abc.length);
		System.arraycopy(num, 0, copyC, abc.length, num.length);
		System.out.println(copyC);
		
		System.arraycopy(abc, 0, num, 0, abc.length);
		System.out.println(num);
		System.arraycopy(abc, 0, num, 5, 3);
		System.out.println(num);
		
		/* D. Arrays.copyOf() */
		System.out.println("====== D. Arrays.copyOf() ======");
		char[] copyD = Arrays.copyOf(abc, 7);
		System.out.print("copy D : ");
		for(int i=0; i < copyD.length; i++) {
			System.out.print(copyD[i] + " ");
		}
		System.out.println();

	}

}
