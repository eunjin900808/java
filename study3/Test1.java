package study3;

public class Test1 {

	public static void main(String[] args) {
		
		int count = 1;
		//1증가
		count = count + 1;
		count += 1;
		count++;
		
		//3증가
		count = count + 3;
		count += 3;
		
		// count 값은 10입니다.
		System.out.println("count 값은 "+count+"입니다.");
		
		//3항 연산
		//100보다 크다 또는 작다 또는 같다.
		int number = 100;
		String result = (number > 100)?"크다":"작다";
		//90은 100보다 작다.
		System.out.println(number+"은 100보다 "+result+".");
		
		String result1 = (number > 100)?"보다 크다":
						 (number < 100)?"보다 작다":"과 같다";
		System.out.println(number+"은 100"+result1+".");
		
		//학점(A,B,C,D,F)
		int math = 98;
		String result2 = (math >= 90)?"A":
						 (math >= 80)?"B":
						 (math >= 70)?"C":
					     (math >= 60)?"D":"F";
		System.out.println("수학점수는 "+math+"점 으로 "+result2+"학점 입니다.");
		
		//예1) 조건이 1개인 경우 (조건)?참:거짓;
		
		//예2) 조건이 2개인 경우 (조건1)?참:(조건2)?참:거짓;
		
		//예3) 조건인 3개인 경우 (조건1)?참:(조건2)?참:(조건3)?참:거짓;
		

	}

}
