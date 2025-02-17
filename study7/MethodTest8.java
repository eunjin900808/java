package study7;

public class MethodTest8 {
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
	public static void main(String[] args) {
		//java study7.MethodTest8 100 200
//		100
//		200
		
//		System.out.println( args[0] );
//		System.out.println( args[1] );
		
		int number = 80;
		System.out.println(getGender("M"));
		System.out.println("----------------------------------");

		numberGubun(number);
		System.out.println("----------------------------------");
		
		System.out.println(getGrade(number));
		System.out.println("----------------------------------");
		System.out.println(getGrade2(number));
		System.out.println("----------------------------------");
		
		gugudan(number);

	}
	
	// 남성 또는 여성 이라는 값이 리턴
	public static String getGender(String gender) {
		String value;
		if( gender.equals("M")) {
			value = "남성";
		}else if( gender.equals("F")) {
			value = "여성";
		}else {
			value = "설정안됨";
		}
		
		return value;
	}
	
	public static void numberGubun(int number) {
		String aa = "";
		if(number>0) {
			aa = "양수";
		}else if(number<0){
			aa = "음수";
		}else {
			aa = "0";
		}
		System.out.println(aa + "입니다.");
	}
	
	public static String getGrade(int score) {
		String ab = "";
		if( score <=100 && score >=90) {
			ab = "A학점";
		}else if(score <90 && score >=80) {
			ab = "B학점";
		}else if(score <80 && score >=70) {
			ab = "C학점";
		}else if(score <70 && score >=60) {
			ab = "D학점";
		}else if(score <60 && score >=0){
			ab = "F학점";
		}else {
			ab = "arror";
		}
		return ab;
	}
	
	// A+(95~100), A0 / B+(85~89), B0(80~84)
	public static String getGrade2(int score) {
		String ab = "";
		if( score <=100 && score >=95) {
			ab = "A+학점";
		}else if( score <95 && score >=90) {
			ab = "A0학점";
		}else if( score <90 && score >=85) {
			ab = "B+학점";
		}else if(score <85 && score >=80) {
			ab = "B0학점";
		}else if(score <80 && score >=75) {
			ab = "C+학점";
		}else if(score <75 && score >=70) {
			ab = "C0학점";
		}else if(score <70 && score >=65) {
			ab = "D+학점";
		}else if(score <65 && score >=60) {
			ab = "D0학점";
		}else if(score <60 && score >=0){
			ab = "F학점";
		}else {
			ab = "arror";
		}
		return ab;
	}
	
	public static void gugudan(int number) {
		for(int i = 1; i<=9; i++) {
			System.out.println(number+" x "+i+" = "+(number*i));
		}
	}

}
