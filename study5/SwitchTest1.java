package study5;

import java.security.KeyStore.TrustedCertificateEntry;
import java.util.Scanner;

public class SwitchTest1 {

	public static void main(String[] args) {
		
		//switch 는 == 만 되는걸로 보면된다
		int number = 2;
		
		switch(number){
			case 1: System.out.println("1입니다.");
			break;
			case 2: System.out.println("2입니다.");
			break;
			case 3: System.out.println("3입니다.");
			break;
			default : System.out.println("몰라요");
		}

//		-------------------------------------------------
		
		if(number == 1) {
			System.out.println("1입니다.");
		}else if(number ==2) {
			System.out.println("2입니다.");
		}else if(number ==3) {
			System.out.println("3입니다.");
		}else {
			System.out.println("몰라요");
		}
		
//		-------------------------------------------------
		
		char gender = 'M';
		switch(gender) {
			case 'M' :System.out.println("남성");
			break;
			case 'F' :System.out.println("여성");
			break;
			default :System.out.println("모름");
		}
		System.out.println("-------------------------------------------");
//		-------------------------------------------------

		Scanner scn = new Scanner(System.in);
		
		int a = 10;
		int b = 20;
		
		System.out.print("연산기호입력>> ");
		
		String mark = "+";
		switch(mark) { //switch 문은 조건식이 오지못한다
//		switch(mark > 2) {} (x)
			case"+":System.out.println(a+b);
			break;
			case"-":System.out.println(a-b);
			break;
			case"*":System.out.println(a*b);
			break;
			case"/":System.out.println(a/b);
			break;
			default:System.out.println("오류");
		}
		
		//문자열은 == 대신 .equals 를 써줘야한다 - 이런부분에서는 switch 문이 편함
		if(mark .equals("+")) {
			System.out.println(a+b);
		}else if(mark .equals("-")) {
			System.out.println(a-b);			
		}else {
			System.out.println("오류");
		}
		
//		-------------------------------------------------
		
		String name = "홍길동";
		int pay = 100;
		int level = 2; //등급
		switch (level) {
			case 1 : pay += 30;
			break;
			case 2 : pay += 20;
			break;
			case 3 : pay += 10;
			break;
		}
		System.out.println(name+"님의 최종 급여는 "+pay+"만원 입니다.");
		
//		-------------------------------------------------

		int age = 38;
		String msg = "";
		switch (age % 10) {
			case 9 : msg ="올해가 아홉수네요, 여러가지로 조심하세요";
			break;
			default : msg ="평범한 한해가 되겠네요.";
		}
		System.out.println(msg);
		
//		-------------------------------------------------

//		int n1 = 10;
//		int n2 = 20;
//		boolean result = true;
//		switch (result) { //boolean 타입은 올수가없다 error
//			case true : System.out.println();
//			break;
//		}
		
//		-------------------------------------------------
//		//실행됨
//		if(true) {
//			System.out.println("11");
//		}
//		
//		//실행되지않음
//		if(false) {
//			System.out.println("22");
//		}
//		
//		//else 처리된 내용이 실행됨
//		if (false) {
//			System.out.println("22");
//		}else {
//			System.out.println("33");
//		}
//		
//		
//		//&& 양쪽조건이 다 맞아야 참이기때문에 실행됨
//		if (1==1 && 2==2) { //true
//			System.out.println("44");
//		}
//		
//		//조건문이 거짓(false)이기때문에 실행이안됨
//		if( 1==1 && 2==3) { //false
//			System.out.println("55");
//		}
//		
//		//참이기때문에 실행됨
//		if (1==1 || 2==2) { //true
//			System.out.println("66");
//		}
//		
//		//|| 양쪽조건에 하나만 맞으면 참이기때문에 실행됨
//		if( 1==1 || 2==3) { //true
//			System.out.println("77");
//		}
//		
//		//|| 양쪽조건에 하나라도 맞아야하기 때문에 실행안됨
//		if( 1==2 || 2==3) { //false
//			System.out.println("77");
//		}
		
		
		

	}

}
