package oop9;

import java.io.FileInputStream;
import java.util.Properties;

public class TvTest {
	public static void main(String[] args) {
	
		Properties pr = new Properties();
		try {
			pr.load(new FileInputStream("src/oop9/product.properties"));
			String tvClass = pr.getProperty("tv");
			String speakerClass = pr.getProperty("speaker");
			
			Class tvClazz = Class.forName(tvClass);
			Class speakerClazz = Class.forName(speakerClass);
			//Instance 생성
			TV tv = (TV) tvClazz.getConstructor(null).newInstance();
			Speaker sp = (Speaker) speakerClazz.getConstructor(null).newInstance();

//			TV tv = new SamsungTV();
			tv.setSpeaker(sp);
			tv.powerOn();
			tv.channelUp();
			tv.channelUp();
			tv.soundUp();
			tv.powerOff();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
// SaumsungTV에 OrangeSpeaker 연결
