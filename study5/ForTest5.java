package study5;

import java.awt.Font;

public class ForTest5 {

	public static void main(String[] args) {
		
		//예제1) -5 ~ 5 출력
		for(int i = -5; i <= 5; i++) {
			System.out.print(i+ " ");
		}

		System.out.print("\n\n");

		//예제2)
		for(int i = 101; i <= 109; i++) {
			System.out.print(i+" ");
			if(i == 103 || i ==106) {
				System.out.println();
			}
		}
		
		System.out.print("\n\n");

		//예제2 다른방법)
		int cnt = 0;
		for(int i = 101; i <= 109; i++) {
			cnt++;
			System.out.print(i+" ");
			if(cnt%3 == 0) {
				System.out.println();
			}
		}
		
		System.out.print("\n\n");
		
		//예제3)
		for(int i=2; i<=4; i++) {
			System.out.println("<Font size='"+i+"'>java</font>");
		}
		
		System.out.print("\n\n");
		
		//예제4)
		
		for(int i = 0;i <=23; i++) {
			String dd = "";
			if(i>=0 && i <= 5) {
				dd="새벽";
			}else if(i>=6 && i <= 11) {
				dd="오전";
			}else if(i>=12 && i <= 18) {
				dd="오후";
			}else {
				dd="저녁";
			}
			System.out.println(dd+" "+i+"시");
		}
		
		
		
		
		
	}

}
