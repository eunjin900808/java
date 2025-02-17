package study7;

import java.util.Scanner;

public class MethodTest10 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("크기를 입력하세요(제곱미터단위)>> ");
		int size = scn.nextInt();
		roomSize(size);		
		System.out.println("-----------------------");
		
		myCalc(10, 20, "+");
		System.out.println("-----------------------");
		
		int a = 60;
		int b = 58;
		aa(a, b,"");
		System.out.println("-----------------------");
		
		int[] score = {60,70,80,68,78};
		System.out.println("점수의 합: " + arraySum(score));
	}
	
	public static void roomSize(int size){
		double result = size * 0.3025;
		System.out.println("입력하신 "+size+"평방미터는 "+(size*0.3025)+"평 입니다.");
		System.out.println("입력하신 "+size+"평방미터는 "+result+"평 입니다.");
	}
	
	public static void myCalc(int a, int b, String c) {
		
		int result = 0;
		switch(c) {
		case"+":result =a+b;
		break;
		case"-":result =a-b;
		break;
		case"*":result =a*b;
		break;
		case"/":result =a/b;
		break;
		}
		//10 + 20 = 30
		System.out.println(a+c+b+"="+result);
		
	}
	
	public static void aa(int a,int b, String c) {
		if(a<=100 && a>=60) {
			c = "합격";
		}else if(a<60 && a>=0) {
			c = "재시험";
		}else {
			c = "잘못 입력";
		}
		if(b<=100 && b>=60) {
			c = "합격";
		}else if(b<60 && b>=0) {
			c = "재시험";
		}else {
			c = "잘못 입력";
		}
		System.out.println("a과목 "+a+", b과목 "+b+"로 "+c+" 입니다.");
	}
	//합격(두과목 모두60 이상),불합격(두과목 모두60점 미만),재시험(둘중 하나만 60점 이상)
	public static String egamResult(int score1, int score2) {
		String result = "";
		//올바른세팅
		if(score1 >= 60 && score2 >= 60) {
			result = "합격";
		}else if(score1 < 60 && score2 < 60) {			
			result = "불합격";
		}else {
			result = "재시험";
		}
//		//올바른세팅
//		if(score1 >= 60 && score2 >= 60) {
//			result = "합격";
//		}else if(score1 >= 60 || score2 >= 60) {			
//			result = "재시험";
//		}else {
//			result = "불합격";
//		}
		
//		//재시험의 잘못된 세팅
//		if(score1 >= 60 && score2 >= 60) {
//			result = "합격";
//		}else if(score1 < 60 || score2 < 60) {			
//			result = "재시험";
//		}else {
//			result = "불합격";
//		}
		return result;
	}
	
	public static int arraySum(int[] jumsu) {
		int aa = jumsu[0]+jumsu[1]+jumsu[2]+jumsu[3]+jumsu[4];
//		for(int i= 0;i < jumsu.length;i++) {	
//
//		}
		return aa;
	}

}
