package study10;

public class MyBook2 {

	public static void main(String[] args) {
		
		BookInfo book = new BookInfo();
		System.out.println(book.title);
		System.out.println(book.price);
		
		book.title = "HTML교재";
		book.price = 15000;
		System.out.println(book.title);
		System.out.println(book.price);
		
		

	}

}
