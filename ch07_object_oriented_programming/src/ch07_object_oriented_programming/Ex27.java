package ch07_object_oriented_programming;

class Outer {
	int value = 10;
	
	class Inner {
		int value = 20;
		void methodA() {
			int value = 30;
			
			System.out.println(value);
			System.out.println(this.value);
//			Outer o = new Outer();
//			System.out.println(o.value);
			System.out.println(Outer.this.value);
		}
	}
}
public class Ex27 {

	public static void main(String[] args) {
		
		Outer o = new Outer();
		Outer.Inner inner = o.new Inner();
		
		inner.methodA();

	}

}
