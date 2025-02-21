package pattern;

public class MemberCheck {

	public static void main(String[] args) {
		
		//아이디 (영문+숫자) 6 ~ 12
		String userid = "test1212";	//true	//true
		userid = "7test112";	//true	//false
		
//		String ptn1 = "[0-9a-zA-Z]{6,12}";
		String ptn1 = "[a-zA-Z]{1}[0-9a-zA-Z]{5,11}";
		System.out.println("아이디 : "+userid.matches(ptn1));
		
		//암호 (영문+숫자+특수문자(#,%,@,-,_,.)) 8 ~ 20
		String pass = "a1234--_@#abc$";	//true
		
		String ptn2 ="[0-9a-zA-Z-_@#$]{8,30}";
		System.out.println("암호 : "+pass.matches(ptn2));
		
		//이름 (영문+한글) 2 ~ 20
		String name = "김철수";
		
		String ptn3 = "[가-힣A-Za-z]{2,20}";
		System.out.println("이름 : "+name.matches(ptn3));
		
		//생일 2000-12-25
		String date = "1998-02-20";
		String ptn4 = "[0-9]{4}-[0-9]{1,2}-[0-9]{1,2}";
		System.out.println("날짜 : "+date.matches(ptn4));
		
		//성별 M or F
		String gender = "M";
		String ptn5 = "(M|F){1}";
		System.out.println("성별 : "+gender.matches(ptn5));
		
		//핸드폰번호 010(011)-1234-1234
		String phone = "010-1234-1234";
		String ptn6 = "(010|011)-[0-9]{4}-[0-9]{4}";
		System.out.println("폰번호 : "+phone.matches(ptn6));
		
		//이메일 aa@naver.com
		//아이디@도메인명.com(co.kr)(.net)
		String email = "test11@naver.com";
		String ptn7 = "[a-zA-Z]{1}[0-9a-zA-Z]{5,11}@[a-zA-Z0-9]+\\.[a-zA-Z0-9]+";
		System.out.println("이메일 : "+email.matches(ptn7));
		
		
		//문자열에 숫자 포함 여부
		String str = "문자열에 0 숫자 포함 여부"; //true
		str = "abcdef";	//false
		str = "1";	//true
		String ptn8 = ".*[0-9]+.*";
		System.out.println("숫자포함여부 : "+str.matches(ptn8));
		
		//IP주소 확인 >>- CMD화면에서 IP주소 찾는법 : ipconfig
		//192.168.0.63	//0.0.0.0 ~ 255.255.255.255
		//숫자 (1~3).
		
		String ip = "192.168.0.63";	//true
		ip = "192,168.0.63";	//false
		
		String ptn9 = "[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}";
		System.out.println("IP : "+ip.matches(ptn9));
		
		
		//한글아닌 값이 1개 이상 있어야 함 (전체값이 한글만으로는 안됨)
		String str10 = "자바스크립트";	//false
		str10 = "자바스크립트100";	//true
		str10 = "1234567";	//true
		
		//"^"가 정규표현식 사이에 끼어있으면 not 의 의미
		//"^"가 정규표현식의 맨 앞에 설정 되었으면 start 의 의미
		String ptn10 = ".*[^가-힣]+.*";
		System.out.println("한글포함여부:"+str10.matches(ptn10));
		
		
		//
	}
	

}
