package oop9;

public interface TV {
	public abstract void powerOn();
	public abstract void powerOff();
	public abstract void channelUp();
	public abstract void channelDown();
	public abstract void soundUp();
	public abstract void soundDown();
	// default를 붙여주면 interface도 바디를 가질 수 있게 된다.
	public default void setSpeaker(Speaker speaker) {}

}
// interface 전체 틀