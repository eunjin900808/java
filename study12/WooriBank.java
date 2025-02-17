package study12;

class WooriBankInfo{
	String branchName = "강남지점";			//멤버변수, 인스턴스변수
	String branchLocation = "서울시 서초구 123";
	
	// 생성자 특징
	//(1) new 키워드를 통해 객체 생성시 자동 실행되는 메소드
	//(2) static or 리턴 타입이 붙지 못한다 (void 가 내장되어 있음)
	//(3) 클래스 이름과 동일한 이름으로 형성함
	//(4) 일반메소드 처럼 호출 불가
	WooriBankInfo(){
		System.out.println("<< 우리은행 >>");
	}
	WooriBankInfo(String name){
		this.branchName = name; //branchName = "구리역점"
		System.out.println("<< 우리은행 >>");
	}
	WooriBankInfo(String name , String location){
		this.branchName = name;
		this.branchLocation = location;
		System.out.println("<< 우리은행 >>");
	}
	
	// 기본 값 :: 기본생성자는 생략가능
	// WooriBankInfo(){ }
}

public class WooriBank {
	
	WooriBank(){}
	
	public static void main(String[] args) {
		
//		참조클래스 	  참조변수 	 = new(키워드) 생성자;
//		생성자가 들어가 있는 클래스를 객체처리한다.
		WooriBankInfo wooribank1 = new WooriBankInfo();
		System.out.println("지점이름 : " + wooribank1.branchName);
		System.out.println("지점위치 : " + wooribank1.branchLocation);
		System.out.println("-----------------------");
		
		WooriBankInfo wooribank2 = new WooriBankInfo("구리역점");
		wooribank2.branchLocation ="구리시 인창동";
		System.out.println("지점이름 : " + wooribank2.branchName);
		System.out.println("지점위치 : " + wooribank2.branchLocation);
		System.out.println("-----------------------");
		
		WooriBankInfo wooribank3 = new WooriBankInfo("부산역점","부산시 해운대구");
		System.out.println("지점이름 : " + wooribank3.branchName);
		System.out.println("지점위치 : " + wooribank3.branchLocation);
		
	
	}
}
