package study6;

public class MeTest1 {

	public static void main(String[] args) {
		
		String name = "뻐꾸기";
		int point = 1000;
		point +=300;
		point -=20;
		System.out.println("현재 "+name+"님의 보유포인트는 "+point+"P 입니다.");

		int yy = 1998;
		int mm = 8;
		int dd = 21;
		String ang = (mm<=10)?"0":"";
		String b = yy+"/"+ang+mm+"/"+dd;
		int c = 2025 - yy+1;
		String ss= "";
		if(mm >=3 && mm <=5) {
			ss="봄";
		}else if(mm>=6 && mm<=8) {
			ss="여름";
		}
		System.out.println("회원님의 생일은 "+b+"로 올해"+c+"세이고 "+ss+"에 태어났습니다.");
		
		for(int i = 0;i <=23;i++) {
			System.out.print(i+" ");
		}
		
	}
	
	

}
