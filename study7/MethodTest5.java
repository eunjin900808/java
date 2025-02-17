package study7;

public class MethodTest5 {

	public static void main(String[] args) {
		message();
		System.out.println("이름: " + name());
		System.out.println("합계: " + hap());
		System.out.println("평균: " + avg());
		System.out.println("결과: " + ((pass() == true)?"합격":"불합격"));

	}
	
	//void : 리턴 처리를 안한다고 선언
	public static void message() {
		System.out.println("=학생점수공개=");
//		return "";
	}
	
	public static String name() {
		
		return "홍길동";
//		return 100; error
	}
	
	/*
	 * 정수타입
	 * byte(-128~127) < short(-32000~32000) < int(-21억~21억) < long
	 */
	public static int eng() {
		int eng = 98;
		return eng;
	}
		
	public static short math() {
		short math = 78;
		return math;
	}

	public static byte kor() {
		byte kor = 96;
		return kor;
	}
	
	public static int hap() {
		int hap = eng() +kor() +math();
		return hap;
	}
	
	public static double avg() {
		double avg = hap() / 3;
		return avg;
	}
	
	//true or false
	public static boolean pass() {
		//60이상은 true / false
//		System.out.println(100 > 60); //true
		boolean result = avg() >=60;
		return result;
	}
	
//	public static byte age() {
//		byte age = 130;
//		return age;
//	}
	
	
	
	
}
