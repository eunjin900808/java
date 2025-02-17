package study2;

public class Test4 {

	public static void main(String[] args) {
		
		System.out.println( "100 == 100: " + (100 == 100) ); //true
		System.out.println( "100 == 80: " + (100 == 80) );  //false
		System.out.println( "100 != 100: " + (100 != 100) ); // "!" not ;; false
		System.out.println( "100 != 80: " + (100 != 80) );  //true
		System.out.println( "100 > 100: " + (100 > 100) );  //false (100이 100보다 크다)
		System.out.println( "100 > 80: " + (100 > 80) );   //true (100이 80보다 크다)
		
		System.out.println( "100 < 100: " + (100 < 100) ); //false (100이 100보다 작다)
		System.out.println( "100 < 80: " + (100 < 80) ); //false (100이 80보다 작다)
		System.out.println( "50 < 80: " + (50 < 80) ); //true (50이 80보다 작다)
		
		//크거나 같다.
		System.out.println( 100 >= 100 ); //true (100은 100보다 크거나 같다)
		System.out.println( 100 >= 80 );  //true (100은 80보다 크거나 같다)
		System.out.println( 50 >= 80);	  //false(50은 80보다 크거나 같다)
		
		//작거나 같다.
		System.out.println( 100 <= 100 ); //true (100은 100보다 작거나 같다)
		System.out.println( 100 <= 80 );  //false (100은 80보다 작거나 같다)
		System.out.println( 50 <= 80);	  //true (50은 80보다 작거나 같다)

		System.out.println("------------------------");
		
		//프로그램은 좌측 기준 (크다 기호) - 비교연산자의 해석은 기호를 중심으로 좌측이 기준이 되어 해석을 하게 됨
		System.out.println( 100 > 80 ); //100이 80보다 크다
		System.out.println( 100 > 80 ); //80이 100보다 작다 - 프로그램상 잘못된표현
		
		System.out.println( 100 < 80 ); //100이 80보다 작다
		System.out.println( 100 < 80 ); //80이 100보다 크다 - 프로그램상 잘못된표현

	}

}
