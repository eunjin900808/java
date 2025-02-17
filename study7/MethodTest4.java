package study7;

public class MethodTest4 {

	public static void main(String[] args) {
		
		String name = memberName();
		String gender = memberGender();
		String year = memberYear();
		
		String str = "";
		if(gender.equals("M")) {
			str = "남자";
		}else {
			str = "여자";
		}
				
//		int age = 2025-year;//year 변수는 string 이기때문에 연산처리가되지않는다
		int age = 2025 - Integer.parseInt(year);// 형변환 string -> integer
		
		System.out.println("이름: "+name);
		System.out.println("성별: "+str);
		System.out.println("년도: "+year);
		System.out.println("나이: "+age);
	}
	
	public static String memberName() {
		// return : 호출한 위치에 던진다.
		return "홍길동";
	}
	
	public static String memberGender() {
		return "M";
	}
	
	public static String memberYear() {
		return "1998";
	}
	

}
