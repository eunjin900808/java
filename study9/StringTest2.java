package study9;

public class StringTest2 {

	public static void main(String[] args) {
		String a1 = "java";
		String a2 = "Java";
		
		if( a1.equals(a2)) {
			System.out.println("같음");
		}else {
			System.out.println("다름");
		}

		if( a1.toUpperCase().equals(a2.toUpperCase())) {
			System.out.println("같음");
		}else {
			System.out.println("다름");
		}
		
		a2 ="html";
		
		String A2 = "html";

	}

}
