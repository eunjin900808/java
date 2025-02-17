package study7;

import java.security.PublicKey;

public class MethodTest3 {

	public static void main(String[] args) {
		
//		MethodTest2.programBooks();
//		MethodTest1.scriptProgram();
//		count10();
		System.out.println("-------------------------------");
//		count20();
		oddNumber100();
		}
	// 1~ 10출력
	public static void count10() {
		for(int i = 1; i <=10; i++) {
			System.out.println(i);
		}

	}
	
	// 1~ 20출력
	public static void count20() {
		int a = 1;
		while(a<=20) {
			System.out.println(a);
			a++;
		}	
	}
	
	// 1~100 홀수만 출력
	public static void oddNumber100() {	
		for(int i = 1; i<=100; i++) {
			if(i%2==1) {
				System.out.print(i+" ");
			}
		}
	}
	

}
