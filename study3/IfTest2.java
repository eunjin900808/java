package study3;

import java.util.Scanner;

public class IfTest2 {

	public static void main(String[] args) {
		
		//scanner : 콘솔화면에 입력상태를 제공해 주는 클래스(파일)
		Scanner scn = new Scanner(System.in);//사용 선언
		System.out.print("영어점수>>");		
		int eng = scn.nextInt();//입력상태제공
		
		if( eng >= 60) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		
		System.out.println("===========================");
		
		System.out.print("5의 배수를 입력>>");
		int number = scn.nextInt();
		int result = number%5;
		
		if(result == 0) {
			System.out.println("5의 배수");
		}else {
			System.out.println("5의 배수가 아님");
		}

		
	}

}
