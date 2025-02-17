package study10;

public class TypeTest1 {

	public static void main(String[] args) {
		
		System.out.println( (double)67/3);	//22.333333333333332
		System.out.println( 67/(double)3);	//22.333333333333332
		System.out.println( 67/3.0);		//22.333333333333332
		System.out.println( 67.0/3);		//22.333333333333332
		System.out.println( 67.0/3.0);		//22.333333333333332

		System.out.println("--------------------------------------");

		System.out.println(67/3);		//22
		int a =67;
		int b =3;
		double result = a/b;
		System.out.println(result);		//22.0
		result = (double)(a/b);			//22 -> 22.0
		System.out.println(result);		//22.0
		result = (double)a/b;			//67.0/3
		System.out.println(result);		//22.333333333333332
		
		System.out.println("--------------------------------------");
		
		int i = 55;
		int j = 7;
		int ret1 = i*j;
		double ret2 = i*j;
		System.out.println(ret1);	//385
		System.out.println(ret2);	//385.0
		
		System.out.println("--------------------------------------");
		
		double d1 = 550000.0;
		double d2 = 7000.7;
		double ret3 = d1*d2;
		System.out.println(ret3);
		
//		int ret4 = d1*d2;		//문법 error ; 용량 차이
		int ret4 = (int)(d1*d2);
		System.out.println(ret4);
		
	}

}
