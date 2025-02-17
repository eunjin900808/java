package study6;

import java.util.Scanner;

public class WhileTest2 {

	public static void main(String[] args) {
		//1 2 3 4 5 6 7 9 10 11~
		Scanner scn = new Scanner(System.in);
		int number =0;
		while(true) {//무한루프
			if( number != 0 && number%10 == 0) {
				System.out.print("계속출력 'Y', 종료 'N'을 입력하세요.>> ");
				String str =scn.next();
				if( str.equals("N")) {
					System.out.print("종료되었습니다.");					
					break;
				}else if(!str.equals("Y")){
					continue;
				}
			}
			number++;
			System.out.println(number);
		}

	}

}
