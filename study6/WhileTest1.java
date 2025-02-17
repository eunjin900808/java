package study6;

import java.util.Scanner;

import javax.net.ssl.SSLContext;

public class WhileTest1 {

	public static void main(String[] args) {

//		int c= 1;
//		if(c <= 10) {
//			System.out.println("a");
//		}//반복문이 아니기때문에 한번만 출력된다
		
//		for(;;) {
//			System.out.println("b");
//		}
		
//		while(true) {
//			System.out.println("b");
//		}
		
		
		int a = 1;
		while(a<=10) {
			System.out.print(a+" ");
			a++;
		}
		
		System.out.println("\n\n");
		
//		for(int b=1;b<=10;b++) {
//			System.out.print(b+" ");
//		}
		
		// 10 ~ 1
		int b = 10;
		while(b >= 1) {
			System.out.print(b+" ");
			b--;
		}
		
		System.out.println("\n\n");
		
		int c = 10;
		while(c <= 100) {
			System.out.print(c+" ");
			c+=10;
		}
		
		System.out.println("\n\n");

		//1 2 3 4 5 6 7 9 10 11~
		Scanner scn = new Scanner(System.in);
		int cnt =1;
		while(true) {//무한루프
			System.out.print(cnt+" ");
			if(cnt%10 == 0) {
				System.out.print("계속 실행하시겠습니까? ('네')>> ");
				String str =scn.next();
				if( !str.equals("네")) {
					System.out.print("종료되었습니다.");
					break;
				}
			}
			cnt++;
		}

	}

}
