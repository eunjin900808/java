package study1;

public class Test3 {

	public static void main(String[] args) {
	String welcome= "안녕하세요?";
	String message = "변수란 무엇인가?";
//	System.out.println(welcome);
//	System.out.println("welcome"); //변수의기능상실(일반문자취급)
	System.out.println(welcome);
	System.out.println(message);

	int kor = 80;
	int eng = 100;
	System.out.println(kor);
	System.out.println(eng);
	System.out.println("------------");
	
	//초기변수 세팅은 변수 타입의 무조건 설정
	String mycolor = "blue";
	System.out.println(mycolor);
	
	//변수값의 재설정(타입설정 불가)
	mycolor = "red";
	System.out.println(mycolor);
	
	//변수값의 재설정
	mycolor ="yellow";
	System.out.println(mycolor);
	
	System.out.println("------------");
	
	//문법오류 :: 변수타입의 중복선언
//	String mycolor = "green";
	
//	String class = "abc"; 예약어 오류 - class는 예약어이기 때문에 변수명으로 못쓴다
	
//	String public = "abc"; 예약어 오류
	
//	String name = '홍길동'; 문자열의 홑따옴표 처리 불가
	
//	String eng1 = 100; 문자열은 반드시 쌍따옴표 처리를 해야한다
	
	String book = "자바의 첫걸음";
	System.out.println(book);
	
//	int age = "55"; 숫자타입은 쌍따옴표 불가
	int weight = 300;
	System.out.println(weight);
//	int public = 80; 예약어 오류
//	int #number = 77; 특수문자 오류
	int number = 77;
	System.out.println(number);
//	int 7number = 77; 변수이름의 첫글자는 무조건 영문이어야한다
	int num7ber = 77; //정상
	System.out.println(num7ber);
	int number_7 = 77; //정상
	System.out.println(number_7);
	
	String lotte_tower_height = "555m";
	System.out.println(lotte_tower_height);
	String 풀스택개발과정은 = "6개월입니다.";//변수명 한글로 가능하지만 쓰지않는다
	System.out.println(풀스택개발과정은);
	String 하이미디어 = "Hi~~~!!!";
	System.out.println(하이미디어);
	int 하이 = 333;
	System.out.println(하이);
	int namsan = 470;
	System.out.println(namsan);
//	int mamsan = 480; 변수명 중복 사용불가
//	String _name ="감자탕"; 변수이름의 첫글자는 무조건 영문
//	String 44Size = "희망사항"; 변수이름의 첫글자는 무조건 영문
	String lucky7 = "행운";
	System.out.println(lucky7);
//	System.out.println(풀스택개발자과정은);
	
	
	
	
	
	}
}
