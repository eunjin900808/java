package study10;

public class Test1 {

	public static void main(String[] args) {
		
		double a1 = 1.123456;
//		//1.12
//		//1.123
//		
//		//(1) 문자타입 전환 후 문자열 메소드 substring()를 이용하여 세팅 가능
////		String s1 = a1 +"";		//1.123456 ; 편법 야매;;
//		String s1 = Double.toString(a1);	//정식 표현법
//		System.out.println(s1); // 1.123456
//		System.out.println(s1.substring(0,4)); // 1.12
//		
//		double a2 = Double.parseDouble(s1.substring(0,4));
//		System.out.println(a2);

		double result = myPow(a1,3);
		System.out.println(result);
		
	}
	
	// 12.12178 , 3 (소수점포함된 숫자 , 자리수)
	
	public static double myPow(double dd, int nn) {
//		double a1 = 1.123456;
//		System.out.println(a1);
		
		//소수점 아래 2자리까지 표현 //1.12
//		double ret1 = a1* 100;
//		double ret1 = a1* Math.pow(10, 2);
		int p = (int)Math.pow(10, nn);
//		double ret1 = a1*p;
		double ret1 = dd*p;
//		System.out.println(ret1);
		
		// 112.3456 -> 112/100 -> 1.12
//		double ret2 = (int)ret1/(double)100;
		double ret2 = (int)ret1/(double)p;
//		System.out.println(ret2);
		
//		Math.pow(10, 1); // 10
//		Math.pow(10, 2); // 10*10
//		Math.pow(10, 3); // 10*10*10
		
		return ret2;
	}

}
