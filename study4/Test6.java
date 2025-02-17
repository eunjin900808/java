package study4;

public class Test6 {

	public static void main(String[] args) {
		
		//풀어보기1) 시간체크 (정상적인 시간인지 체크한다.)----------------------------------------------
		byte t1 = 23; // 0 ~ 23시
		byte t2 = 25; // 0 ~ 59분
		byte t3 = 50; // 0 ~ 59초
//		String what = "";
		
//		if(t1 >= 0 && t1 <= 23 && t2 >= 0 && t2 <= 59 && t3 >= 0 && t3 <= 59) {
//			what = "올바른";
//		}else {
//			what = "잘못된";
//		}
//			System.out.println(t1+"시 "+t2+"분 "+t3+"초는 "+what+" 시간입니다." );
		
		String msg= "";
		//시각적인 효과로 괄호로 묶어주는게 좋음
		if((t1 >= 0 && t1 <= 23)&&(t2 >= 0 && t2 <= 59)&&(t3 >= 0 && t3 <= 59)) {
			msg = "올바른";
		}else {
			msg = "잘못된";
		}			
			System.out.println(t1+"시 "+t2+"분 "+t3+"초는 "+msg+" 시간입니다." );
		
		
		System.out.println("-------------------------------------------");
		//풀어보기2)-----------------------------------------------------------------------
		t1 = 17;  // 시 6 ~ 8 ; 9		; 9		;10~14
		t2 = 49; // 분 	  x  ; 0~30 ; 31~59 ;
		t3 = 30; // 초   x	 ; x
		
		String str = "무효"; 

		if(t1 >=6 && t1 <=8) {
			str = "출석";
		}else if(t1 == 9){
			if(t2 >= 0 && t2 <= 30) {
				str = "출석";
			}else {
				str = "지각";
			}
		}else if(t1 > 9 && t1 < 14) {
			str = "지각";
		}else if(t1 >= 14 && t1 <= 17) {
			if(t2 >= 0 && t2 <= 50) {
				str = "결석";
			}
		}
		System.out.println(t1+"시 "+t2+"분 "+str+" 입니다.");
		
		
		
		System.out.println("-------------------------------------------");
		//풀어보기3)-----------------------------------------------------------------------
		
		int number = 99;
		String msg1 = "";
		String msg2 = "";
		if ( number%2 == 0 ) {
			msg1 = "짝수";
		}else {
			msg1 = "홀수";
		}
		if( number%10 == 0 ) {
			msg2 = "맞습니다";
		}else {
			msg2 = "아닙니다";
		}
		System.out.println(number+"는 "+msg1+"이고 10의 배수가"+msg2);
	}

}
