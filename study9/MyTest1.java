package study9;

import java.util.function.IntPredicate;

public class MyTest1 {

	public static void main(String[] args) {
		
		int age1 = 105;
		int age2 = 83;
		int age3 = 98;
		int aa = Math.max(age1, Math.max(age2, age3));
		int bb = Math.min(age1, Math.min(age2, age3));
		System.out.println("제일 많은 나이는 "+aa+"살이고 제일 적은 나이는 "+bb+"살 입니다.");
		
		int[] a1 = {90,80,-40,98,72,54};
		int sum = 0;
		for(int i= 0; i<a1.length; i++) {
//			System.out.println(a1[i]);
			sum += a1[i];
		}
		int ab = sum/a1.length;
		System.out.println(sum);
		System.out.println(ab);
		
		int ee = 0;
		for(int i =0; i<a1.length;i++) {
			int qq = Math.abs(a1[i]);
			ee = Math.max(qq, ee);
		}
		System.out.println(ee);
		

	}

}
