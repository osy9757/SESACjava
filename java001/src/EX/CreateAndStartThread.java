package EX;

class SMIFileThread extends Thread {
	public void run() {
		String[] strArray = {"하나", "둘", "셋","넷","다섯"};
		try {Thread.sleep(10);} catch (InterruptedException e) {}
		
		for (int i = 0; i < strArray.length; i++) {
			System.out.println(" - (자막번호) " + strArray[i]);
			try {Thread.sleep(200);} catch (InterruptedException e) {}
		}
 	}
}

class VideoFileThread extends Thread {
	public void run() {
		int[] intArray = {1,2,3,4,5};
		
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(" - (자막번호) " + intArray[i]);
			try {Thread.sleep(200);} catch (InterruptedException e) {}
		}
 	}
}


public class CreateAndStartThread {
	public static void main(String[] args) {
		Thread smiFileThread = new SMIFileThread();
		smiFileThread.start();
		
		Thread videoFileThread = new VideoFileThread();
		videoFileThread.start();
	}
}
