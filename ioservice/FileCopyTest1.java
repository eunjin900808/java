package ioservice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class FileCopyTest1 {

	public static void main(String[] args) throws Exception{
		
		String filePath1 = "c:/mytemp/post1 (1).csv";
		String filePath2 = "c:/mytemp/post1 (1).txt.bak";
		
		//filePath1 읽어들임/출력

		FileReader file = new FileReader(filePath1);
		BufferedReader buffer = new BufferedReader(file);
		
		FileWriter fw = new FileWriter(filePath2,true);
		//출력 내부에 write() 기능을 넣음
		while(true) {
			String str = buffer.readLine();
			if(str == null) break;
			
			fw.write(str+"\n");
		}
		fw.close();
		buffer.close();
		file.close();
		System.out.println("** 내용카피완료 **");
	}

}
