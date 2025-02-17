package study10;

public class MyBook1 {

	public static void main(String[] args) {
	
		String message = "객체지향";//지역변수는 다른클래스에서 부를수없음
		
		BookInfo mk = new BookInfo();
		System.out.println("제목: "+mk.title);
		System.out.println("가격: "+mk.price);
		
		mk.price = 15000;
		mk.title = "자바교재";
		System.out.println("제목: "+mk.title);
		System.out.println("가격: "+mk.price);

	}

}
