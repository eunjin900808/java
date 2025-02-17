package study7;

public class MethodTest6 {

	public static void main(String[] args) {

//		System.out.println("회원님의 나이는 "+age()+"세로 "+method1()+"이며 "+method2()+"년생입니다.");
		int age = age();
		String str = method1();
		int year = method2();
		System.out.println("회원님의 나이는 "+age+"세로 "+str+"이며 "+year+"년생입니다.");
	}
	
	public static int age() {
		return 23;
		
	}
	
	// "성인" 또는 "미성년" 값이 리턴
	public static String method1(){
		String str = "";
		if(age() >= 20) {
			str = "성인";
		}else {
			str = "미성년";
		}
//		return str;
		return (age()>=20)?"성인":"미성년";	
	}
	
	// 출생년도가 리턴이 되는 메소드
	public static int method2() {
		int year = 2025-age();
//		return year;
		return 2025-age();
	}

}
