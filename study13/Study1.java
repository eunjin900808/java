package study13;

public class Study1 {

	public static void main(String[] args) {

		Person1 p1 = new Person1();	//인스턴스 처리
		p1.name = "홍길동";
		p1.age = 30;
		p1.height = 170;
//		p1.weight = 70;
		p1.setWeight(70);
		
		System.out.println(p1.name);
		System.out.println(p1.height);
		System.out.println(p1.getWeight());

	}

}
