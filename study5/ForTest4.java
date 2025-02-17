package study5;

public class ForTest4 {

	public static void main(String[] args) {
		
		// 가감 처리되는 반복문
		// 예) 10 9 ~ 1
		for(int i = 10; i >= 1; i--) {
			System.out.print(i+" ");
		}
		
		System.out.print("\n\n");
		
		
		for(int i = 1; i <= 9; i += 1) {
			System.out.print(i+" ");
		}
		
		System.out.print("\n\n"); // \n :개행(줄바꿈)

		for(int i = 1; i <= 9; i = i+1) {
			System.out.print(i+" ");
		}
		
		System.out.print("\n\n");
		// 2씩 증가 또는 3 씩 증가
		// 1 3 5 7 9
		for(int i = 1; i <= 9; i += 2) {
			System.out.print(i+" ");
		}
		
		System.out.print("\n\n");
		
		for(int i = 1; i <= 9; i += 3) {
			System.out.print(i+" ");
		}
		
//		int a = 1;
//		a++;
//		++a;
//		a += 1;
//		a = a + 1;
//		
//		int b = 1;
//		b += 2;
//		b = b + 2;

	}

}
