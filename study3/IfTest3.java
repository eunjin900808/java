package study3;

public class IfTest3 {

	public static void main(String[] args) {
		//예제1)
		int age = 15;
		
		if(age >= 20) {
			System.out.println("20세 이상으로 담배판매가 가능합니다");
		}else {
			System.out.println("미성년자 이므로 담배를 판매할 수 없습니다");
		}

		//예제2)
		int bithYear = 1999;
		
		if( bithYear <= 2006) {
			System.out.println("20세 이상으로 담배판매가 가능합니다");			
		}else {
			System.out.println("미성년자 이므로 담배를 판매할 수 없습니다");
		}
		
		//예제3)
		int money = 2000;
		int price = 1500;
		String goods ="빼빼로";
		
		int result3 = money - price;
		
		if(result3 >= 0) {
			System.out.println(goods+"를 사고"+result3+"원이 남았습니다");
		}else{
			System.out.println(goods+"를 사지 못했습니다.");
		}
		
		
		
		}

}
