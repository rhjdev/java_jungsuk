package com.reminder.exercises;

class Tv {
	boolean power;
	int channel;
	int volume;
	
	void power() {
		power = !power;
	}
	void channelUp() {
		++channel;
	}
	void channelDown() {
		--channel;
	}
	void volumeUp() {
		++volume;
	}
	void volumeDown() {
		--volume;
	}
}

class CaptionTv extends Tv {
	boolean caption;
	void displayCaption(String text) {
		if(caption) {
			System.out.println(text);
		}
	}
}
public class Ex01_315 {
	
	public static void main(String[] args) {
		/* 자식클래스 인스턴스 생성해 부모클래스 멤버 사용 */
		CaptionTv captv = new CaptionTv();
		captv.power();
		captv.channel = 30;
		captv.channelUp();
		System.out.println("CHANNEL : " + captv.channel);
		
		captv.volume = 10;
		captv.volumeDown();
		System.out.println("VOLUME : " + captv.volume);
		
		captv.displayCaption("[자막]");
		captv.caption = true;
		captv.displayCaption("[자막]");
		
	}

}
