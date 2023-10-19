package oop9;

public class OrangeSpeaker implements Speaker{

    public void soundUp() {
        System.out.println("OrangeSpeaker: Volume Up");
    }

    @Override
    public void soundDown() {
        System.out.println("OrangeSpeaker: Volume Down");
    }

}
