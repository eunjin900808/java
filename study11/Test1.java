package study11;

public class Test1 {

	int a;		//맴버변수, 인스턴스변수
	int b;
	String c;
	int hap() {
		System.out.println(">> ");
		return a+b;
	}
	void setA(int z) {
		System.out.println(">> ");
		if(z > 100 || z < 0) {
			a = 0;
		}else {			
			a = z;
		}
//		return "a"; error
	}
	
	public static void main(String[] args) {
//		자바에서 객체란? : 메모리에 올라가있는 클래스를 의미
//		객체를 만드는 방법 : new 라는 키워드를 통해서(new 뒤에 클래스)
//		메모리에 올라가야만이 사용할수있는 상태가 된다
		int a = 100; // 지역변수
  //참조클래스 참조변수 = new(키워드) 생성자;
		Test1 hong = new Test1(); 	//인스턴스처리
		Test1 kim  = new Test1();	//인스턴스처리
		
// 참조클래스에서 a 라는 변수의 존재유무 확인 후 주요 메모리에있는 있는 변수에 접근함
		hong.a =50;
		hong.setA(50);
		hong.b = 90;
		
		kim.a = 30;
		kim.b = 40;
		
		System.out.println("홍의 합계:"+hong.hap());
		System.out.println("김의 합계:"+kim.hap());

	}

}
