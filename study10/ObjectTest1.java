package study10;

public class ObjectTest1 {

	int a = 10;	//멤버변수, 인스턴스(객체)변수
	int b = 20;
	String c = "java";
	
	public static void main(String[] args) {
		
		int i = 100; // local(지역)변수
		System.out.println(i);
		
		/*
		 * new : 객체 처리하는 키워드
		 */
		
	//	참조클래스		참조변수		 = new 생성자;
		ObjectTest1 objectTest1  = new ObjectTest1(); //인스턴스(객체)처리
		System.out.println(objectTest1.a);
		System.out.println(objectTest1.b);
		System.out.println(objectTest1.c);

	}

}
