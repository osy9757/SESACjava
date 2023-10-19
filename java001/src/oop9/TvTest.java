package oop9;

public class TvTest {
	public static void main(String[] args) {
		TV tv = new SamsungTV();
		tv.powerOn();
		tv.channelUp();
		tv.channelUp();
		tv.soundUp();
		tv.powerOff();
	}
}
