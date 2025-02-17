package study2;

public class Test6 {

	public static void main(String[] args) {
		
		//실습1) 온도가 0보다 작으면 영하, 크면 영상으로 출력
		int temp = 0;
		
		String result1 = (temp >= 0)?"영상":"영하";
		System.out.println("현재 기온은 "+result1+" "+temp+"도 입니다");
		
		String result2 = (temp > 0)?"영상":(temp < 0)?"영하":"";
		System.out.println("현재 기온은 "+result2+" "+temp+"도 입니다");
		
		//실습2) 성별 출력 (1:남성, 2:여성)
		int gender = 7;
		String result3 = (gender == 1?"남성":"여성"); //여성
		String result4 = (gender == 1?"남성":(gender == 2)?"여성":"잘못된번호");
		System.out.println("입력된 숫자는 "+gender+"로 "+result3+"입니다");				
		System.out.println("입력된 숫자는 "+gender+"로 "+result4+"입니다");		
	
		//실습3) 짝, 홀수 => 2로 나누어서 나머지 값이 0이면 짝수, 1이면 홀수
		int number = 10;
		String result5 = (number%2 == 0)?"짝수":"홀수";
		System.out.println("입력된 숫자는 "+number+"로 "+result5+" 입니다."); 
		
		System.out.println("---------------------------");
		
		//실습4) 오전/오후
		//지금 시간은 13시로 오후 입니다.
		int hh = 13; // 13시 :: 0 ~ 23
		String time = (hh - 12) >= 0?"오후":"오전";
		System.out.println("지금 시간은 "+hh+"시로 "+time+"입니다");
		
		//13 =>1, 15=>3, 9=>9, 3=>3
		//지금 시간은 오후 1시 입니다.
		int n2 = (hh-12) > 0? hh-12 : hh;
		System.out.println("지금 시간은 "+time+" "+n2+"시 입니다.");
		
		System.out.println("---------------------------");
		
		//실습5) 성적 출력 - 우수()80이상, 보통(60점이상),노력
		// 68점 득점으로 보통에 해당됩니다.
		int score = 68;
		
		String result6 = (score >= 80)?"우수":
						 (score >= 60)?"보통":"노력";
		System.out.println(score+"점 득점으로 "+result6+"에 해당됩니다.");
	
		
	}

}
