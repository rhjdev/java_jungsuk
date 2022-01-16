package ch07_object_oriented_programming;

public class Ex18 {
	
	public static void action(Robot r) {
		if(r instanceof DancingRobot) {
			DancingRobot dr = (DancingRobot)r;
			dr.dance();
		} else if(r instanceof SingingRobot) {
			SingingRobot sr = (SingingRobot)r;
			sr.sing();
		} else if(r instanceof DrawingRobot) {
			DrawingRobot dr = (DrawingRobot)r;
			dr.draw();
		}
	}

	public static void main(String[] args) {
		
		Robot[] arr = { new DancingRobot(), new SingingRobot(), new DrawingRobot() };
		for(int i=0; i < arr.length; i++) {
			action(arr[i]);
		}
	}
}
	
class Robot {}
class DancingRobot extends Robot {
	void dance() {
		System.out.println("춤을 춥니다.");
	}
}
	
class SingingRobot extends Robot {
	void sing() {
		System.out.println("노래를 합니다.");
	}
}
	
class DrawingRobot extends Robot {
	void draw() {
		System.out.println("그림을 그립니다.");
	}
}