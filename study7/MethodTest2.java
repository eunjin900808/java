package study7;

public class MethodTest2 {

	public static void main(String[] args) {
		
		//메소드 호출
		System.out.println("=프로그램 교제=");
		programBooks();
		System.out.println("=데이터베이스 교제=");
		databaseBooks();

	}
	
	public static void programBooks() {
		System.out.println("1.자바의 첫걸음 - 30000원");
		System.out.println("2.스크립트의 이해 - 35000원");
	}
	
	public static void databaseBooks() {
		System.out.println("1.오라클 그대로 따라하기 - 35000원");
		System.out.println("2.스키마란 무엇인가 - 20000원");
	}

}
