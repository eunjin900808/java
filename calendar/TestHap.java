package calendar;

abstract class Test101{ //추상클래스
	public abstract void hap(); //명세처리
}

interface Test102{ //인터페이스(파일)
	public void hap(); //명세처리
}

class MyHap extends Test101{
	
	MyHap(){ }//생략가능 기본적으로 되어있음
	
	int a =10; //멤버변수, 인스턴스변수
	final int b = 20; //멤버변수, 인스턴스변수, 종단(상수)변수
	static int c = 30; //멤버변수, 클래스(전역, 공유)변수
	static final int d = 100; //멤버변수, 클래스(전역, 공유)변수, 종단(상수)변수
	
	@Override // @ (어노테이션) :시스템 주석
	public void hap() {
		System.out.print(a+b);
	}
}

class MyHap2 implements Test102{

	@Override//다형성(오버라이딩)
	public void hap() {
		System.out.println(1000+200);
	}
	
	//다형성(오버로딩)
	public void hap(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	
}

public class TestHap {

	public static void main(String[] args) {

 //참조클래스 참조변수 = new 생성자;
		MyHap my1 = new MyHap(); //인스턴스(객체)화
		
		my1.a = 90;
//		my1.b = 80; //상수변수

		MyHap.c =5000; //클래스변수
//		MyHap.d =1000; //상수변수
	}

}
