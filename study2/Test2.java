package study2;

public class Test2 {

	public static void main(String[] args) {
		
//		"=" 기호를 대입연산자 라고 부름
		int score1 = 100;
		System.out.println("숫자 변수인 score1에게 100 이라는 값이 대입됐음= " + score1);
		String myName = "홍길동";
		System.out.println("문자열 변수인 myName에게 홍길동이라는 값이 대입되었음= " + myName);
		int score2 = 10+20+30;
		System.out.println(score2);
		
		//누적에 대한 의미
		int number = 100;
		System.out.println("초기 값: "+number);
		
		number = number + 50;
		System.out.println("50증가: "+number);
		
		number = number + 80;
		System.out.println("80증가: "+number);

		number = number - 30;
		System.out.println("30가감  "+number);
		
		number = number * 2;
		System.out.println("곱셈처리: "+number);
		
		System.out.println("---------------");
		
		//예제3) 누적
		int money = 1000;
		System.out.println(money);//1000
		
		money += 100; //money = money + 100;
		System.out.println(money);//1100
		
		money += 200;
		System.out.println(money);//1300
		
		money -= 40; //money = money - 40;
		System.out.println(money);//1260
		
		money =- 30; //money = -30; -30으로 인식
		System.out.println(money);
		
		money =+ 30; //money = +30; 30으로 인식
		System.out.println(money);
		
//		money =* 30; //오류	
		
		System.out.println("---------------");
		
		//{4} 증감연산자, 가감연산자
		//++ , --
		
		int a = 1;
		System.out.println(a);//1
		
		++a;//전위연산 a=1+a;
		System.out.println(a);//2
		++a; //3
		++a; //4
		System.out.println(a);//4
		
		a++;//후위연산 a=a+1;
		System.out.println(a);//5
		
		a--;
		System.out.println(a);//4
		a--; // 1가감  3
		--a; // 1가감  2
		System.out.println(a);//2;

//		a**; 없는 표현식
		System.out.println("---------------");
		
		int b =1;
		b++; //스스로 1증가
		System.out.println(b);//2
		
		b = 1;
		int c = ++b;	//연산처리 후 값을 넘김
		System.out.println(b + "," + c);// b=2; c=2;
		
		b = 1;
		c = b++;	//값을 넘기고 연산처리
		System.out.println(b + "," + c);// b=2; c=1;
		
		
	}

}
