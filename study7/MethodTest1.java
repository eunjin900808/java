package study7;

public class MethodTest1 {

	/**
	 * 자바프로그램은 실행 시 main 메소드만 실행함
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		// scriptProgram메소드를 호출한다.
		scriptProgram();
		System.out.println("------------------------------------");
		// dbProgram 메소드를 호출한다.
		dbProgram();

	}
	public static void scriptProgram() {
		
		System.out.println("jacascript");
		System.out.println("jQuery");
		System.out.println("react");
		System.out.println("vue");
	}
	
	public static void dbProgram() {
		System.out.println("oracle");
		System.out.println("mysql");
		System.out.println("maria-db");
		System.out.println("mssql");
		System.out.println("db2");
		System.out.println("mongo-db");
	}

}
