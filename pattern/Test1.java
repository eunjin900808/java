package pattern;

public class Test1 {

	/*
	 * matches(): 패턴 검사 메소드
	 */
	public static void main(String[] args) {
		
		////예제1 (단 한개의 문자만 허용)
		String text = "홍";	//true
		text = "A";		//true
		text = "AA";	//false; 단 하나의 문자만 허용
		text = "";		//false; 공백 허용안됨
		text = " ";		//true; 빈공간(한칸)은 문자한개로 인식
		text = "  ";	//false;
		text = "#";		//true; 허용된 특수문자
		text = "/";		//true;
//		text = "\";		//오류 ;
		text = "\\";	//true ; \\는 한개로 인식
		String pattern = ".";
		
		//"문자(열)".matches
		System.out.println("1번 : "+text.matches(pattern));
//		System.out.println("홍".matches(pattern)); // 맞는 형식
//		System.out.println(pattern.matches(text)); //잘못된 형식
		
		//예제2 (문자가 1개 이상)
		String text2 = "사전구매"; //true
		text2 = "전"; 	//true
		text2 = ""; 	//false
		
		String pattern2 = ".+";//"이상"의 의미
		System.out.println("2번 : "+ text2.matches(pattern2));
		
		//예제3 (시작 문자열(단어)를 체크)
		String text3 = "정보처리 산업기사"; //true
		text3 = "정보처리";	//true
		text3 = "정보처";		//false ; "정보처리"라는 단어로 시작하지 않았음
		text3 = "정바처리";	//false
		
		// ^ : 뒤에 올 "문자(열)"로 시작
		// 정보처리라는 단어로 시작해야하고 뒤의 문자가 1개 이상 올 수가 있다.
		String pattern3 = "^정보처리.*";
		System.out.println("3번 : "+ text3.matches(pattern3));
		
		//예제4
		String text4 = "yellow"; //true
		text4 = "red";		//true
		text4 = "banana";	//true
		text4 = "sky";		//false
		text4 = "b";		//true
		text4 = "a";		//false
		
		//r 또는 y 또는 b로 시작되는 문자(열)
		String pattern4 = "^(r|y|b).*";
		System.out.println("4번 : "+ text4.matches(pattern4));
		
		//예제5 (html 또는 java 또는 oracle로 시작하는 문자열)
		String text5 = "html css java"; //true
		text5 = "java";			//true
		text5 = "oracle 수업";	//true
		text5 = "css oracle";	//false
		
		
		String pattern5 = "^(html|java|oracle).*";
		System.out.println("5번 : "+ text5.matches(pattern5));
		
		//예제6 (html 또는 java 또는 oracle로 시작하는 문자열)
		String text6 = "html css java"; //true
		text6 = "java";			//false
		text6 = "oracle 수업";	//true
		text6 = "css oracle";	//false
		
		String pattern6 = "^(html|java|oracle).+";
		System.out.println("6번 : "+ text6.matches(pattern6));;
		
		//예제7 (html 또는 java 또는 oracle로 시작하는 문자열)
		String text7 = "html css java"; //false
		text7 = "java";			//false
		text7 = "oracle 수업";	//false
		text7 = "css oracle";	//false
		text7 = "java ";		//true
		
		String pattern7 = "^(html|java|oracle).";
		System.out.println("7번 : "+ text7.matches(pattern7));
		
		//예제8 - 날짜(형식) 체크 (예 : 2025-05-20)
		String date8 = "2025-02-15";	//true
		date8 = "2025/02/15";	//false : "-"기호의 누락
		date8 = "aaaa-09-25";	//false : 년도의 문자처리 오류
		
		//[숫자]{개수범위}
		String pattern8 = "[0-9]{4}-[0-9]{1,2}-[0-9]{1,2}";
		
		System.out.println("8번 : "+ date8.matches(pattern8));
		
		if(date8.matches(pattern8)) {
			System.out.println("올바른 날짜형식");
		}else {
			System.out.println("올바른 날짜형식이 아님");
		}
		
		//예제9 - 주민등록번호 체크
		//숫자 6자리 - 숫자7자리 / [1~4]
		String text9 = "801225-1012345"; //true
		text9 = "801225-5012345";	//false
		text9 = "801225-101234";	//false
		
		String pattern9 = "[0-9]{6}-[1-4]{1}[0-9]{6}";
		System.out.println("9번 : "+ text9.matches(pattern9));
		
		//예제10 - 영어점수 체크
		//숫자 1 ~ 3
		String eng = "99";
		String pattern10 = "[0-9]{1,3}"; //1개 ~ 3개
		System.out.println("10번 : "+ eng.matches(pattern10));
		
		//예제11 - 한글만 허용 ( 2 ~ 20 )
		String name = "홍길동"; //true
		name = "홍길동 ";		//false
		String pattern11 = "[가-힣]{2,20}";
		System.out.println("10번 : "+ name.matches(pattern11));
		
		
		
	}

}
