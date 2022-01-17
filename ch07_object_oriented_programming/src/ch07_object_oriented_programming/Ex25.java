package ch07_object_oriented_programming;

class OuterA { //외부 클래스
	class InnerA { //내부 클래스(인스턴스 클래스)
		int iv=100;
	}
}
public class Ex25 {

	public static void main(String[] args) {
		/* 인스턴스 생성 */
		OuterA o = new OuterA();
		OuterA.InnerA oi = o.new InnerA();
		System.out.println(oi.iv);
	}

}
