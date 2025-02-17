package study5;

public class ForTest6 {

	public static void main(String[] args) {
		for(int a = 1; a <=3 ;a++) {
			
			for(int i = 1;i <=5; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("\n\n");

		for(int i = 1; i <=5; i++) {
//			System.out.println(i);
			for(int j = 1; j <=i ; j++) {
			System.out.print("☆");
			}
			System.out.println();
			
		}
		
		System.out.println("\n\n");
		
		for(int i = 5; i >= 1; i--) {
			for(int j = 1; j <=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
