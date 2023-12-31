package oop9;

public class SamsungTV implements TV{
	private Speaker speaker = null;
	
	public void setSpeaker(Speaker speaker) {
	    this.speaker = speaker;
	}
	
	public void powerOn() {
		System.out.println("Samsung : Turn on the TV");
	}
	public void powerOff() {
		System.out.println("Samsung : Turn off the TV");
	}
	public void channelUp() {
		System.out.println("Samsung : Channel Up");
	}
	public void channelDown() {
		System.out.println("Samsung : Channel Down");
	}
	public void soundUp() {
		if (speaker == null) {
			System.out.println("Samsung : Volume Up");
		} else {
			speaker.soundUp();
		}
	}
	public void soundDown() {
		if (speaker == null) {
			System.out.println("Samsung : Volume Down");
		} else {
			speaker.soundDown();
		}
	}
}
