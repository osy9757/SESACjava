package io;

import java.io.File;

public class FileMethods {
	public static void main(String[] args) {
		File tempDir = new File("C:/temp");
		if(!tempDir.exists())
			tempDir.mkdir();
		
		File file = new File("C:/Windows");
		System.out.println("절대경로 " + file.getAbsolutePath());
		System.out.println("folder? : " + file.isDirectory());
		System.out.println("file? : " + file.isFile());
		System.out.println("folder/file name : " + file.getName());
		System.out.println("super folder : " + file.getParent());
		
		File newfile1 = new File("C:/temp/abc");
		System.out.println(newfile1.mkdir());
		File newfile2 = new File("C:/temp/bcd/cde");
		System.out.println(newfile2.mkdir());
		System.out.println(newfile2.mkdirs());
		
		File[] fnames = file.listFiles();
		for(File fname: fnames) {
			System.out.println((fname.isDirectory()? "folder:" : "file:") + fname.getName());
		}
		
	}
}
