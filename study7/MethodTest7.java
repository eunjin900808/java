package study7;

import java.util.Scanner;

public class MethodTest7 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		while(true) {			
		System.out.print("성별 입력(M or F or 종료:0)>> ");
		String gender = scn.next();
			if(!gender.equals("0")) {
				methodGender(gender);			
			}else {
				System.out.println("종료합니다.");
				break;
			} 
		}
	}
	
	// 매개변수 : 외부데이터 값을 가지게되는 변수
	// 아규먼트 : 매개변수에 대입되는 값을 아규먼트라고 한다
	public static void methodGender(String gender) { //매개변수
		if(gender.equals("M")) {
			System.out.println("남성");			
		}else if(gender.equals("F")) {
			System.out.println("여성");
		}else {
			System.out.println("잘못된 데이터");
		}
	}
	

}
/*
 * [CMD 화면에서의 실행] {이클립스로의 작업파일}
 * 1. CMD 화면을 open
 * 2. 작업폴더로 이동
	> cd 이동경로
	> cd C:\eclipse-workspace7\sample1\bin
 * 3. 목록확인
 	> dir
 * 4. 실행
 	> java study7.MethodTest7
 */
