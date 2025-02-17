package study1;

public class Test6 {
	//변수 활용
	public static void main(String[] args) {
		
		//실습1
		String fruit = "사과";
		int price = 500;
		//사과의 가격은 500원 입니다.
		System.out.println(fruit + "의 가격은 " +price+ "원 입니다.");
		
		//실습2
		int eng = 90;
		int math = 100;
		System.out.println("영어 "+eng+" 수학 "+math);
		
		//실습3
		System.out.println("영어("+eng+"), 수학("+math+")");
		
		//실습4
		System.out.println("영어:"+eng);
		System.out.println("수학:"+math);
		System.out.println("합계:"+(eng+math));
		System.out.println("평균:"+(eng+math)/2);
	}

}
