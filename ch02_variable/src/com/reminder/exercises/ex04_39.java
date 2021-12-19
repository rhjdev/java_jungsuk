package com.reminder.exercises;

public class ex04_39 {

	public static void main(String[] args) {
		
		String url = "www.helloworld.com";
		float f1 = .50f;
		float f2 = 5e1f;
		float f3 = 3.14e3f;
		double d = 1.23456789;
		
		/* 실수형 값 출력을 위한 지시문 %f, %e, %g */
		/* 지시자 %f가 주로 사용되며,
		 * 지시자 %e는 지수로 나타내기 위해,
		 * 지시자 %g는 간략히 표현하기 위해 쓰인다.
		 */
		System.out.printf("f1=%f, %e, %g%n", f1, f1, f1);
		System.out.printf("f2=%f, %e, %g%n", f2, f2, f2);
		System.out.printf("f3=%f, %e, %g%n", f3, f3, f3);
		
		/* %14.12f → 전체 14자리이고, 소수점아래 12자리를 둔다. */ 
		System.out.printf("d=%f%n", d);
		System.out.printf("d=%14.12f%n", d);
		
		/* 문자열 값 출력을 위한 지시문 %s */
		/* %30s → 최소 30글자 출력공간을 확보하고, 값을 오른쪽정렬로 출력한다.
		 * %-30s → 최소 30글자 출력공간을 확보하고, 값을 왼쪽정렬로 출력한다.
		 * .3s → 왼쪽부터 3글자만 출력한다.
		 */
		System.out.printf("[%s]%n", url);
		System.out.printf("[%30s]%n", url);
		System.out.printf("[%-30s]%n", url);
		System.out.printf("[%.3s]%n", url);

	}

}
