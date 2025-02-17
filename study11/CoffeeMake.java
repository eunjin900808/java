package study11;

public class CoffeeMake {

	public static void main(String[] args) {
		
		CoffeInfo coffee1 = new CoffeInfo();
		CoffeInfo coffee2 = new CoffeInfo();

		coffee1.name ="아메리카노";
//		coffee1.price = 3000;
		coffee1.setPrice(3000);
		
//		coffee1.maker = "가나";
//		CoffeInfo.maker = "가나";
		CoffeInfo.setMaker("가나");
		
		coffee2.name ="바닐라라떼";
		coffee2.price = 4500;
//		coffee2.maker = "브라질";
		CoffeInfo.maker = "브라질";
		
		System.out.println(coffee1.name +","+ CoffeInfo.maker);
		System.out.println(coffee2.name +","+ CoffeInfo.maker);
		
		
	}

}
