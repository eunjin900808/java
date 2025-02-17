package study9_1;

public class MaxTest1 {

	public static void main(String[] args) {
		
		int a1 = 99;
		int a2 = 95;
		int a3 = 150;
		int a4 = 999;
		int maxNumber = Math.max(a1,a2);
		
		System.out.println(maxNumber);
		System.out.println("-----------------------------");
		System.out.println(Math.min(a1,
				 		   Math.min(a2,
				 		   Math.min(a3, a4))));
		System.out.println("-----------------------------");
		System.out.println(myMin(88, 55));
		System.out.println("-----------------------------");
		
//		int maxNumber = Math.max(a1, a2, a3); //max 메소드는 2개만 비교
		int maxNumber1 = Math.max(a1, Math.max(a2, a3));//괄호안에있는것 먼저 실행
		System.out.println(maxNumber1);

		int maxNumber2 = Math.max(a1,
						 Math.max(a2,
						 Math.max(a3, a4)));
		System.out.println(maxNumber2);
		
		System.out.println("-----------------------------");
//		-----------------------------------------------------------------
		int maxNumber3 = myMax3(a1,a2,a3);
		System.out.println(maxNumber3);
		

	}
	//사용자 메소드; 매개변수 : 외부 데이터 값을 받는 변수
	public static int myMax3(int n1,int n2,int n3) {
		int max = Math.max(n1, Math.max(n2, n3));
		return max;
	}
	public static int myMax4(int n1,int n2,int n3,int n4) {
		int max = Math.max(n1, Math.max(n2, Math.max(n3,n4)));
		return max;
	}
	public static int myMax5(int n1,int n2,int n3,int n4,int n5) {
		int max = Math.max(n1, Math.max(n2, Math.max(n3, Math.max(n4, n5))));
		return max;
	}
	
	public static int myMin(int a, int b) {
//		int min = 0;		
//		if(a > b) {
//			min = b;
//		}else if(a < b) {
//			min = a;
//		}else {
//			min = a;
//		}
		int min1 = (a < b)? a : b;

		return min1;
	}
	
	

}
