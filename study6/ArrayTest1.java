package study6;

import java.awt.color.CMMException;

import javax.swing.plaf.basic.BasicTabbedPaneUI;

public class ArrayTest1 {

	public static void main(String[] args) {
		
		//배열: 하나의 이름을오 여러 값을 가지는 변수
		int[] scores = {90,70,88};
		
		int sum = 0;
		for(int i=0; i<scores.length; i++) {// 0 1 2
			System.out.println(scores[i]);//index 값
			sum += scores[i];
		}
		int avg = sum/scores.length;
		System.out.println("합계:"+sum);
		System.out.println("합계:"+avg);
		
//		int hap1 = scores[0] + scores[1] + scores[2];
//		System.out.println(hap1);
//		int hab2 = 0;
//		hab2 += scores[0];
//		hab2 += scores[1];
//		hab2 += scores[2];
//		System.out.println(hab2);
		
		//1.java
		String[] subject = {"java","react","oracle"};
		for(int i=0; i<subject.length; i++) {
			System.out.println((i+1)+"."+subject[i]);
		}
		
		//풀어보기1)
		for(int i = 1; i <=17; i++) {
			System.out.print(i);
			if(i%5 ==0) {
				System.out.print("**");
			}
			System.out.print(" ");
		}
		
		System.out.println("\n");
		
		//풀어보기2)
		int[] mm = {1,3,10};
		for(int i = 0; i<mm.length; i++) {
			String str = "";
			if(mm[i] >= 3 && mm[i] <= 5) {
				str = "봄";
			}else if(mm[i] >= 6 && mm[i] <= 8) {
				str = "여름";
			}else if(mm[i] >= 9 && mm[i] <= 11) {
				str = "가을";
			}else {
				str = "겨울";
			}
			
			String zero = (mm[i] < 10)?"0":""; 
			System.out.println(zero+mm[i]+"월:"+str);
		}
		
		System.out.println("\n");
		
		int aa[] = {2,3,4};
		for(int i = 0; i<aa.length; i++) {
			for(int c = 1;c<=3;c++) {
				for(int b = 1; b<=3; b++) {
					
				}
				System.out.println(aa[i]+"*"+c+"="+(aa[i]*c));
			}
			System.out.println();
		}
	}

}
