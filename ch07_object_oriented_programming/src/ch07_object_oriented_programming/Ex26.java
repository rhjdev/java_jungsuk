package ch07_object_oriented_programming;

class OuterB { //외부 클래스
	static class InnerB { //내부 클래스(static 클래스)
		int iv = 200;
	}
}
public class Ex26 {

	public static void main(String[] args) {
		/* 인스턴스 생성 불필요 */
		OuterB.InnerB oi = new OuterB.InnerB();
		System.out.println(oi.iv);

	}

}
