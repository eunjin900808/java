package ioservice;

import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MyFileAdmin2 {

	public static void main(String[] args) {
		String[] a0 = {"aa","bb","cc","dd"};
		
		int[] a1 = {33,11,22,50,20,40};
		Arrays.sort(a1); 		//순차적 정리
//		System.out.println(Arrays.toString(a1));

		Scanner scn = new Scanner(System.in);
		
		System.out.println("[파일관리2]");
		System.out.println("1.특정 폴더의 이미지 파일 추출");
		System.out.println("2.특정 폴더의 목록을 시간별 출력(파일만)");
		System.out.println("2.특정 폴더의 사이즈 출력\n");
		System.out.print("*메뉴번호>>");
		int menu = 0;
		try {			
			menu = scn.nextInt();
		}catch(Exception e){
			System.out.println("** 메뉴번호는 숫자로 입력해주세요. **");
			return;
		}
		System.out.print("*폴더명>>");
		String dirName = scn.next();
		System.out.println("-------------------");
		
		switch(menu) {
			case 1: dirImageList(dirName);
			break;
			case 2: dirListAllFiles(dirName);
			break;
			case 3: dirTotalSize(dirName);
			break;
			default : System.out.println("** 메뉴번호는 1~3번 사이로 입력해주세요.");
		}
	}
	
	public static void dirImageList(String dirName) {
		String dirPath = "C:/"+dirName;
		File dir = new File(dirPath);
		File[] names = dir.listFiles();
		for(int i=0; i<names.length; i++) {
			//sea_bg.PNG.txt
			//student_jumsu.csv
			//jpg, png, jpeg, gif
			String filename = names[i].getName();
			
			//a.jpg 		 -> {"a","jpg"}				//1
			//sea_bg.PNG.txt -> {"sea_bg","PNG","txt"}	//2
			
			String[] array = filename.split("\\.");
			int len = array.length;
			String ext = array[len-1];
			if(	ext.toUpperCase().equals("JPG") ||
				ext.toUpperCase().equals("PNG") ||
				ext.toUpperCase().equals("GIF") ||
				ext.toUpperCase().equals("JPEG"))
			{ //toUpperCase()대문자비교
				System.out.println(filename);
			}
		}
	}
	public static void dirListAllFiles(String dirName) {
		String dirPath = "C:/"+dirName;
		File dir = new File(dirPath);
		//{파일1, 파일2, ..}
		File[] names = dir.listFiles();
		
		Map<String, String> map = new HashMap<String, String>();
		
		long[] unixs = new long[names.length];	//빈 배열 변수
		for(int i=0; i<names.length; i++) {
			
			String fileName = names[i].getName();
			long unix = names[i].lastModified();
			unixs[i] = unix;
			map.put(unix+"",fileName); 	//(key값, 데이터값)
			
		}
		Arrays.sort(unixs); //Arrays.sort : 정렬해주는 메소드
		
		for(int i =0; i<unixs.length; i++) {
			String name = map.get(unixs[i]+"");
			System.out.println(name+" "+unixs[i]);
		}	//세로 출력
		//		System.out.println(Arrays.toString(array)); //Arrays.toString 가로출력
		
	}
	
	
	public static void dirTotalSize(String dirName) {
		String dirPath = "C:/"+dirName;
		File dir = new File(dirPath);
		//{파일1, 파일2, ..}
		File[] names = dir.listFiles();
		
		long sum = 0;
		for(int i=0; i<names.length; i++) {
			long fileSize = names[i].length();
			sum += fileSize;
		}
		System.out.println(dirName+"폴더의 크기는 "+sum+"byte 입니다.");
	}

}
