package study7;

public class MethodTest9 {

	public static void main(String[] args) {
		
		String name = "홍길동";
		int eng = 90;
		int kor = 80;
		int math =100;
		
		System.out.println("합(영+국): "+hap(eng, kor));
		System.out.println("합(영+국+수): "+hap(eng, kor, math));
		System.out.println("합(영+국+수+이름): "+hap(eng, kor, math, name));
//		System.out.println(hap(math)); //메서드 개수가맞지않으면 오류 error
//		System.out.println(hap(kor, math, name, eng));//메서드 순서가 맞지않으면 오류 error

	}
	
	public static int hap(int a,int b) { //매개변수 2개
		return a + b;
	}
	public static int hap(int a, int b, int c) { //매개변수 3개
		return a + b + c;
	}
	public static int hap(int a, int b, int c, String d) {
		return a + b + c;
	}

}
