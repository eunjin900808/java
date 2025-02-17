package study5;

public class ForTest2 {

	public static void main(String[] args) {
		
		//1~5까지 출력(세로)
		for(int i = 1; i <=5; i++) {
			System.out.println(i);
		}
		
		System.out.println("-------------------------------------------");
		
		//1~100까지 출력(가로)
		for(int i = 1; i <=100; i++) {
			System.out.print(i+ " ");
		}
		
		System.out.println("-------------------------------------------");

		//11~20까지 출력(가로)
		for(int i = 11;i <= 20; i++) {
			System.out.print(i + " ");
		}
	
		System.out.println();
		
		//1~100 홀수만 출력
		for(int i = 1; i <= 100; i++) {
			int result = i%2;
			if(result == 1) {
			System.out.print(i +"");
			}
		}
		
		System.out.println();

		//1990년 ~~~ 2025년
		for(int i =1990; i <=2025; i++) {
			int age = 2025 - i;
			System.out.print(i + "년("+age+"세) ");
		}
		
		System.out.println();
		System.out.println("-------------------------------------------");
		
		//3단 출력( 3*1 ~ 3*9 )
		int dan = 3;
		for(int i= 1; i <=9; i++){
				System.out.println(dan+"x"+ i +"="+(dan*i) );
		}
		
		System.out.println("-------------------------------------------");
		
		
		//예제 6)
		dan = 3;
		for(int i= 1; i <=5; i++){
			if(i%2 == 1) { //홀수만
				System.out.println(dan+"x"+ i +"="+(dan*i) );				
			}
		}
		
		
	}
}
