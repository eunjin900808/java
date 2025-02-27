package ioservice;

import java.io.File;
import java.text.SimpleDateFormat;

public class DirList1 {

	public static void main(String[] args) {
		
		String dirPath = "C:\\eclipse-workspace7";
		File dir = new File(dirPath);
		
//		String[] str = {"aa","bb"};
//		int[] nn = {11,22};
		
//		String ss = {"asa",111};
//		물리적인 파일 또는 폴더를 배열 형식으로 묶음
		File[] names = dir.listFiles();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		
		for(int i=0; i<names.length; i++) {
			String str = "[파일]";
			if(names[i].isDirectory()) {
				str = "<폴더>";
			}
			String name = names[i].getName();
			int len = (int)names[i].length();	//byte
			long unix = names[i].lastModified(); //유닉스
			String date = df.format(unix);
			int len2 = len/1024;	//KByte 단위로 전환
			
			// Byte < KByte < MByte < GByte
			// 1024 byte -> 1KByte
			// 1024 kByte -> 1MByte
			// 1024 MByte -> 1GByte
			
			System.out.println(str +" "+name + ", 사이즈:" + len2 + ", 생성일:" + date);
		}

	}

}
