package study12;

public class Books1004 {

	int price = 10000;
	String bookName = "";
	
	Books1004(){ }//기본형 생성자
	
//	Books1004(String a) { //오버로딩
//		bookName = a;
//	}
	Books1004(String bookName) {
		this.bookName = bookName;
	}
//	Books1004(String a, int b) {
//		bookName = a;
//		price = b;
//	}
	Books1004(String bookName, int price) {
		this.bookName = bookName;
		this.price = price;
	}
	
	public static void main(String[] args) {
		
		// 기본형 생성자 부재시 오류발생
		Books1004 books = new Books1004();
		
		Books1004 java = new Books1004("자바의 첫걸음");
		Books1004 linux = new Books1004("리눅스 마스터",35000);
		
		System.out.println("My Book : "+java.bookName +", 가격 : "+java.price);
		System.out.println("Your book : "+linux.bookName +", 가격 : "+linux.price);

	}

}
