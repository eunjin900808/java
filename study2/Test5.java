package study2;

/**
 * 삼항연산자 {학습}
 */
public class Test5 {

	public static void main(String[] args) {
		
		//예제1 : 영어점수가 60점 이상은 합격, 반대는 불합격
		int eng = 90;
		
		//(조건문)?true:false
		System.out.println( eng >= 60); //true
		System.out.println( (eng >= 60)?"합격":"불합격" );
		System.out.println( (eng >= 60)?"잘했음":"노력을 요함" );		
		System.out.println( (eng < 60)?"불합격":"합격" );
		System.out.println("-------------------------");
		
		//예제2
		System.out.println( eng==100 );//false
		System.out.println( (eng==100)?"만점":"만점아님");
		
		System.out.println( eng!=100 );//true
		System.out.println( (eng!=100)?"만점아님":"만점");
		System.out.println("-------------------------");
		
		//예제3 => 특정 숫자가 5의 배수인지를 출력
		//		  5로 나눈 나머지 값이 0이면 5의 배수임
		int nm = 84;
		int result = nm%5; //0이면 5의 배수임
		System.out.println((result==0)?"5의 배수임":"5의 배수가 아닙니다");
		
		// 7의 배수여부
		int result2 = nm%7; //0이면 7의 배수임
		System.out.println((result2==0)?"7의 배수임":"7의 배수가 아닙니다");
		
		//예제4
		int song = 95; // 노래방 점수
		int time = 30; // 남은 시간
		int addTime = (song>=90)?10:5; // addTime =5;
		time = time+addTime;
		System.out.println("노래점수가 " +song+ "점 으로 " +addTime+ "분 연장되었습니다.");
		System.out.println("총" +time+ " 분 남았습니다.");
		
		
	}

}
