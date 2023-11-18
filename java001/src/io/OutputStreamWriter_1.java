package io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.io.OutputStreamWriter;

public class OutputStreamWriter_1 {
	public static void main(String[] args) {
		File outputStramWriter1 = new File("src/io/files/OutputStreamWriter1.txt");
		try (Writer writer = new FileWriter(outputStramWriter1);){
			writer.write("OutputStreamWriter1 예제파일입니다.\n".toCharArray());
			writer.write("한글과 영문이 다 있네요");
			writer.write('\n');
			writer.write("Good Byeeee\n\n");
			writer.flush();
		} catch (IOException e) {
			// TODO: handle exception
		}
		File outputStramWriter2 = new File("src/io/files/OutputStreamWriter2.txt");
		try (OutputStream os = new FileOutputStream(outputStramWriter2,false);
				OutputStreamWriter osw = new OutputStreamWriter(os,"MS949")){
			osw.write("OutputStreamWriter1 예제파일입니다.\n".toCharArray());
			osw.write("한글과 영문이 다 있네요");
			osw.write('\n');
			osw.write("Good Byeeee\n\n");
			osw.flush();
			System.out.println(osw.getEncoding());
		} catch (IOException e) {
			// TODO: handle exception
		}
	}
}
