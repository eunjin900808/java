package study4;

public class Test7 {

	public static void main(String[] args) {
		String name = "김철수";
		int kor = 20;
		String atr = "";
		
		if(kor <= 100 && kor >= 90) {
			atr = "A학점";
		}else if(kor <90 && kor >= 80) {
			atr = "B학점";
		}else if(kor < 80 && kor >= 70) {
			atr = "C학점";
		}else if(kor < 70 && kor >= 60) {
			atr = "D학점";
		}else if(kor < 60 && kor >=0){
			atr = "F학점";
		}else {
			atr = "잘못된 점수";
		}
		System.out.println(name+"의 점수는 "+kor+"점 으로 "+atr+" 입니다.");

	}

}
