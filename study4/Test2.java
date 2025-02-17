package study4;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		//실습1)
		System.out.print("이름입력>> ");
		String name = scn.next();

		System.out.print("연차입력>> ");
		int year = scn.nextInt();
		
		String level ="";
		
		if (year >= 16) {
			level = "특급";
		}else if(year >= 11) {
			level = "고급";
		}else if(year >= 6) {
			level = "중급";
		}else if(year >= 3) {
			level = "초급";
		}else {
			level = "신입";
		}
		
//		if (year < 3) {
//			level = "신입";
//		}else if(year >= 3) {
//			level = "초급";
//		}else if(year >= 6) {
//			level = "중급";
//		}else if(year >= 11) {
//			level = "고급";
//		}else {
//			level = "특급";
//		}
		
		System.out.println(name+"님의 연차는 "+year+"년으로 "+level+"입니다.");

	}

}
