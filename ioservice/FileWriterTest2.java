package ioservice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class FileWriterTest2 {

	public static void main(String[] args) throws Exception{
		
		Scanner scn = new Scanner(System.in);
		
		String filePath = "c:/mytemp/test102.txt";
		System.out.print("**내용입력>>");
		String text = scn.next();
		
		//FileWriter(경로,구분); 구분:덮어쓰기(false),이어쓰기(true) 
		FileWriter fw = new FileWriter(filePath,true);
		fw.write(text+"\n");
		fw.close();


		FileReader file = new FileReader(filePath);
		BufferedReader buffer = new BufferedReader(file);
		
		while(true) {
			String str = buffer.readLine();
			if(str == null) break;
			System.out.println(str);
		}
		buffer.close();
		file.close();

	}

}
