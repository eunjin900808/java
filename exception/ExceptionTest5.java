package exception;

import java.util.Scanner;

/**
 *  숫자 맞추기 게임
 */
public class ExceptionTest5 {

	public static void main(String[] args) {

		// Math.random() : 0 ~ 1 사이의 값(소수점값)
		// 0.000000000001 ~ 0.99999999999
		// 0.000000000001 * 100 => 0.000000001
		// 0.999999999999 * 100 => 99.99999999
		// (int)99.999999 -> 99
		
		int number1 = (int)(Math.random()*100) + 1; 
		//System.out.println("시스템 값:"+number1);
		
		Scanner scn = null;
		int i = 0;
		while( true ) { // 무한루프
			try {
				i++;
				scn = new Scanner(System.in);
				System.out.print("번호입력>>");
				int number2 = scn.nextInt();
				
				if( number2 < number1 ) {
					System.out.println(number2+"보다 크다.");
				} else if( number2 > number1 ) {
					System.out.println(number2+"보다 작다.");
				} else {
					System.out.println("## 정답입니다.##");
					System.out.println(i+"회만에 정답을 맞추었습니다.");
					break;  // 반복문의 종료
				}
				
			} catch( Exception e) {
				System.out.println("*** 숫자만 입력하세요.***");
			}

		}
	}
}