package study4;

public class Test1 {

	public static void main(String[] args) {
		
		//실습예제1)
		int age = 15;
		if (age >= 20) {
			System.out.println("23세는 성인이므로 담배 판매 가능");
		}else {
			System.out.println("15세는 미성년자이므로 담배 판매 불가능");			
		}
		
		if ( age < 20) {
			System.out.println("15세는 미성년자이므로 담배 판매 불가능");						
		}else {
			System.out.println("23세는 성인이므로 담배 판매 가능");			
		}
		
		// System.out.println 하나만 사용, 변수의 적극 활용
		String msg1 = "";
		String msg2 = "";
		if (age >= 20) {
			msg1 = "성인";
			msg2 = "가능";
		}else {
			msg1 = "미성년자";
			msg2 = "불가능";
		}
		System.out.println(age+"세는 "+msg1+"이므로 담배 판매 "+msg2);
	
		String message = (age>=20)?
				age+"세는 "+msg1+"이므로 담배 판매 가능":age+"세는 미성년자이므로 담배 판매 불가능";
		System.out.println(message);
		
		System.out.println("----------------------------------");
		
		
		//실습예제2)
		int year1 = 2005;
		int year2 = 2025;
		int result = year2 - year1; //
		
		if( (year2-year1) >= 20 ) {
		//if( result >= 20 ) {
			System.out.println(result+"세는 성인이므로 담배 판매 가능");
		}else {
			System.out.println(result+"세는 미성년자이므로 담배 판매 불가능");
		}
		
		
		//실습예제3)
		int money = 1200;
		int price = 1500;
		String goods ="빼빼로";
		
		int result3 = money - price;//-300
		
		if(result3 >= 0) {
			System.out.println(goods+"를 사고"+result3+"원이 남았습니다");
		}else {
			result3 = result3 * -1;//양수로 전환
			System.out.println(goods+"를 사지 못했습니다. "+result3+"원이 모자름");
		}
		
		
	}

}
