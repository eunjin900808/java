package study3;

// 이름바꾸기 ArrayTest1 => f2

/**
 * 배열 (Array)
 */
public class ArrayTest1 {

	public static void main(String[] args) {
		
		int ss= 90;
		// 배열(형식) : 변수명 하나로 여러 값을 설정하는 경우 사용  
		int[] scores = {90,100,98,46};
		//int{} aa = {12,33};
		//int[] bb = [88,55];
		String[] names = {"홍길동","만수르","이만수"};
		//다른 타입의 값 설정 불가
//		String[] cc = {"aa","bb",11};
		//Index 번호는 0번부터
		System.out.println(scores[0]);
		System.out.println(scores[1]);
		System.out.println(scores[2]);
		System.out.println(scores[3]);
		System.out.println(scores.length); //배열 요소 개수
		
//		System.out.println(scores[-1]); error
//		System.out.println(scores[4]); error
		
		//배열 값 변경
		scores[0] = 99;
		System.out.println("scores[0] : "+scores[0]);
		
		//scores 변수 값들의 합계 / 평균
		int sum1 = scores[0] + scores[1] + scores[2] + scores[3];
		int avg1 = sum1 /scores.length;
		System.out.println("합계 : "+sum1);
		System.out.println("합계 : "+avg1);
		
		int sum2 = 0;
		sum2 += scores[0];
		sum2 += scores[1];
		sum2 += scores[2];
		sum2 += scores[3];
		System.out.println("합계 : "+sum2);
		
		int a = 1;
		a += 1;
		a += 3;
		System.out.println(a);
		

		
	}

}
