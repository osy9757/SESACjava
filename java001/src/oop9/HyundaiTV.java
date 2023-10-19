package oop9;

public class HyundaiTV implements TV{ // implements -> 구현 TV 인증된 거랑 비슷
	public void powerOn() {
		System.out.println("Hyundai : Turn on the TV");
	}
	public void powerOff() {
		System.out.println("Hyundai : Turn off the TV");
	}
	public void channelUp() {
		System.out.println("Hyundai : Channel Up");
	}
	public void channelDown() {
		System.out.println("Hyundai : Channel Down");
	}
	public void soundUp() {
		System.out.println("Hyundai : Volume Up");
	}
	public void soundDown() {
		System.out.println("Hyundai : Volume Down");
	}
}
