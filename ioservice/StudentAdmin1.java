package ioservice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class StudentAdmin1 {
	public static String filePath = "C:\\mytemp\\student_info.txt";

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("[학생관리]\n");
		System.out.println("메뉴1].학생목록(이름)");
//			1.홍길동
//			1.박찬호
//			1.김희선
		System.out.println("메뉴2].학생점수(이름+점수)");
		System.out.print("*메뉴번호>> ");

		int menu = 0;
		try {
			menu = scn.nextInt();
		} catch (Exception e) {
			System.out.println("** 숫자를 입력하세요. **");
			return;
		}
		switch(menu) {
			case 1 : studentList1();
			break;
			case 2 : studentList2();
			break;
			default : System.out.println("** 없는 메뉴번호입니다. **");
		}
		
	}
	
	public static void studentList1() {

		try {
			FileReader file = new FileReader(filePath);
			BufferedReader buffer = new BufferedReader(file);
			int rownumber = 0;
			while(true) {
				String str = buffer.readLine();	//한 줄을 읽어들임
				if(str == null) break;
				rownumber++;
				String[] array = str.split(":");
				System.out.println(rownumber+"."+array[0]);
			}
			buffer.close();
			file.close();
			
		} catch (Exception e) {
			System.out.println("** 경로를 다시 확인 해주세요. **");
		}

	}
	public static void studentList2() {


		try {
			FileReader file = new FileReader(filePath);
			BufferedReader buffer = new BufferedReader(file);
			int rownumber = 0;
			while(true) {
				String str = buffer.readLine();	//한 줄을 읽어들임
				if(str == null) break;
				rownumber++;
				String[] array = str.split(":");
				System.out.println(rownumber+"."+array[0]+"("+array[1]+")");
			}
			buffer.close();
			file.close();
			
		} catch (Exception e) {
			System.out.println("** 경로를 다시 확인 해주세요. **");
		}
	}

}
