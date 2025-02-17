package study6;

import java.awt.Window;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;
import java.util.prefs.Preferences;

public class MiniTest1 {

	public static void main(String[] args) {
		
//		1
//		Window >> Preferences >>general >>workspace >>show full workspace path

//		2
		String nickname = "뻐꾸기";
		int point = 1000;
		point += 300;
		point -=20;
		
		System.out.println("현재 "+nickname+"님의 보유포인트는"+point+"P 입니다.");
		System.out.println();
		
//		3
		int yy = 1990;
		int mm = 10;
		int dd = 21;
		String zero = (mm < 10)?"0":"";
		
		String birtday = yy+"/"+zero+mm+"/"+dd;
		int age = 2025 -yy;
		String str = "";
		if( mm >=3 && mm <=5) {
			str = "봄";
		}else if(mm >=6 && mm <=8) {
			str = "여름";
		}else if(mm >=9 && mm <=11) {
			str = "가을";
		}else {
			str ="겨울";
		}
		System.out.println("회원님의 생일은 "+birtday+"로 올해"+age+"세 이고 "+str+"에 태어났습니다.");
		System.out.println();
		
//		4
		for(int i = 0;i <=23;i++) {
			String zero4 = (i < 10)?"0":"";
			System.out.print(zero4+i+"시");
			if(i < 23) {
				System.out.print(", ");
			}
		}
		
		System.out.println("\n");
		
//		5
		for(int i = 10; i<=50;i+=10) {
			System.out.print(i+"대");
			if(i < 50) {
				System.out.print(", ");
			}
		}
		
		System.out.println("\n");
		
//		6
		for(int i = 3; i <=9; i+=3) {
			System.out.print(i+" ");
			for(int j = 1; j <=i ; j++) {
			System.out.print("*");
			}
			System.out.println();
			
		}
		
		System.out.println("\n");
		
//		7
		
//		Scanner scn = new Scanner(System.in);
//		System.out.print("1부터 몇까지??>> ");
//		int ac = scn.nextInt();
//		System.out.print("몇 배수?>> ");
//		int ab = scn.nextInt();
//		
//		int count = 0;
//		for(int i = 1; i<=ac; i++) {
//			int ret = i%ab;
//			if(ret == 0) {
//				count++;
//			}
//		}
//		System.out.println();
//		System.out.println("1부터 "+ac+"까지 "+ab+"의 배수는 "+count+"개 있습니다.");
		
		Scanner scn = new Scanner(System.in);
		System.out.print("끝번호 입력>> ");
		int end = scn.nextInt();
		System.out.print("알아볼 배수 값 입력>> ");
		int num = scn.nextInt();
		
		int cnt = 0;
		for(int i = 1; i <= end; i++) {
			int ret = i%num;
			if(ret == 0) {
				cnt++;
//				System.out.print(i+" ");
			}
		}
		System.out.println();
		System.out.println("1부터 "+end+"까지 "+num+"의 배수는"+cnt+"개 입니다.");
	}
	

	}
