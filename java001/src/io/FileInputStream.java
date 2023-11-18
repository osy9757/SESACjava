package io;

import java.io.File;
import java.io.InputStream;
import java.io.IOException;

public class FileInputStream {
	public static void main(String[] args) throws IOException{
		File inFile = new File("src/io/FileInput-Stream1.txt");
		InputStream is = new FileInputStream(inFile);
		
		int data;
		while((data = is.read()) != -1) {
			System.out.println((char)data + is.available());
		}
		is.close();
		
		
	}
}
