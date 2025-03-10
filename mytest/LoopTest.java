package mytest;

public class LoopTest {

	public static void main(String[] args) {
//		for(int i =1; i<=31; i++) {
		for(int i =1; i<32; i++) {
			if(i%7 == 0) {
				System.out.print(i+ " ");
			}
		}
		
		System.out.println();
		
		int i = 1;
//		while(i <= 31) {
		while(i < 32) {
			if(i%7 == 0) {
				System.out.print(i + " ");
			}
			i++; // if문 위에 놓으면 2부터 시작(7의 배수를 출력하기때문에 결과값이 똑같음)
		}

	}

}
