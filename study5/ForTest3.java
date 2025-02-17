package study5;

import java.util.Scanner;

public class ForTest3 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("단을 입력하세요>> ");
//		int dan = scn.nextInt();
		int dan = 1;
		for(int i= 1; i <=9; i++){
				System.out.println(dan+"x"+ i +"="+(dan*i) );				
		}

		System.out.println();
		
		System.out.print("별 개수를 정해달라!>> ");
//		int i = scn.nextInt();
		int i = 1;
		for(int star = 1; star<= i; star++) {
			System.out.print("*");
		}
		
		System.out.println();
		System.out.println();
		
		//달력형식( 1 ~ 31) 한 줄에 7개씩
		for (int d = 1; d <= 31; d++) {
			if( d < 10) {
				System.out.print("0");
			}
			System.out.print(d + " ");
			//if(d == 7 || d == 14 || d == 21 || d == 28){
			if( d%7 == 0) {
				System.out.println();
			}

		}
	}

}
