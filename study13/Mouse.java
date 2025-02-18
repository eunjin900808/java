package study13;

class Prodeuct {
	
	//캡슐화(접근지정자) - 변수와 메소드에게만 적용
	private String name = "생산품명";
	private int price;
	private String maker = "한국";
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getMaker() {
		return maker;
	}
	public void setMaker(String maker) {
		this.maker = maker;
	}
	
	//자동 실행 불가
	public static void main(String[] args) {
		System.out.println("111");
	}
}

//클래스에 붙은 public : 일반클래스(메인클래스) 라는 의미
public class Mouse extends Prodeuct {

	// 부모클래스의 메소드를 오버라이딩
	public void setPrice(int price) {
		if(price < 1000 ) {
			price = 1000;
		}else if(price > 10000) {
			price = 10000;
		}
			// 부모클래스의 메소드를 실행 (this.price = price;)
			super.setPrice(price);
	}
	
	public Mouse() {}
	
	//생성자 오버로딩
	public Mouse(String name, int price, String maker) {
		setName(name);
		setPrice(price);
		setMaker(maker);
		
	}
	public void input(String name, int price, String maker) {
		setName(name);
		setPrice(price);
		setMaker(maker);
		
	}
	public void print() {
		System.out.println(getName()+","+getPrice()+","+getMaker());
	}
	
	public static void main(String[] args) {
		Mouse mouse1 = new Mouse("파란마우스", 300, "미국");
		Mouse mouse2 = new Mouse("검정마우스", 20000, "한국");
		
		
//		Mouse mouse1 = new Mouse(); //인스턴스 생성
//		Mouse mouse2 = new Mouse(); //인스턴스 생성
//		mouse1.input("파란마우스", 5000, "미국");
//		mouse2.input("검정마우스", 6000, "한국");
		
		mouse1.print();
		System.out.println("---------------");
		mouse2.print();
	}
}
