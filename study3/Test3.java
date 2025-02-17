package study3;

public class Test3 {

	public static void main(String[] args) {
		
		boolean bn1 = true;
		System.out.println(bn1);
		boolean bn2 = false;
		System.out.println(bn2);
		System.out.println(bn2==true);
		
		System.out.println("--------------------------");
		
		boolean bn3 = 10 < 20;
		System.out.println(bn3);
		System.out.println(10<20);
		
		boolean bn4 = 10==10;
		System.out.println(bn4);
//		String s1 = 10 < 20;
		
		
//		boolean bn3 = 123;
//		boolean bn4 = 'c';
//		boolean bn5 = "true";
		
		
		System.out.println("--------------------------");
		
		//상수(변수)
		String color = "blue"; //초기선언(설정)
		color = "red"; //변수 값의 재정의
		System.out.println(color); //red

		//상수처리된 변수
		final int eng = 100;
		System.out.println(eng);//사용가능
//		eng = 90; 변수 값의 재정의 불가
		
		final boolean b1 = true;
//		b1 = false; 변수 값의 재정의 불가
		
		final String SCHOOL_NAME = "하이미디어 고등학교";
		String name = "홍길동";
		System.out.println(SCHOOL_NAME+" "+name);
		
		name = "김철수";
		System.out.println(SCHOOL_NAME +" "+name);
		
		name = "최영희";
		System.out.println(SCHOOL_NAME+" "+name);
		
	}

}
