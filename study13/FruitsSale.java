package study13;

public class FruitsSale extends CherryInfo{

	//멤버변수, 클래스(전역)변수
	//공유메모리에 올라감
	static String maker = "한국";
	
	public static void main(String[] args) {
		
//		CherryInfo cherry = new CherryInfo();
		FruitsSale cherry = new FruitsSale();
		
		System.out.println(FruitsSale.maker);
		
		System.out.println(cherry.price); //5000
		cherry.discount();
		System.out.println(cherry.price); //4500

	}

}
/*
 * {상속}
 * -상속설정은 자식클래스에서 행함 (extends)
 * -상속설정을 부모클래스는 모름 (상속관련 설정 없음)
 * 
 * 부모클래스 / 자식클래스
 * 상위클래스 / 하위클래스
 * 슈퍼클래스 / 자식클래스
 * (super) / (this)
 * 
 */
