package study4;

public class Test5 {

	public static void main(String[] args) {
		
		int score = 105;
		String str ="";
		
		//0 미만 이거나 100을 초과한 경우
		if(score < 0 || score > 100) {
			str = "0~100로 입력해주세요.";
		}else{
			str = "정상입력";
		}
		System.out.println(str);
		
		//0 이상이고 100이하
		if(score >= 0 && score <= 100) {
			str = "정상입력";
		}else {
			str = "0~100로 입력해주세요.";
		}
		System.out.println(str);
		
		//잘못된 세팅
		//(1) 88 -> 정상입력
		//(2) 150 -> 정상입력
		if(score >= 0 || score <= 100) {
			str = "정상입력";
		}else {
			str = "0~100로 입력해주세요.";
		}
		System.out.println(str);
		
		
	}

}
