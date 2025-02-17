package study8;

public class VoidTest2 {

	public static void main(String[] args) {
		
		int[] scores = {60,70,80,68,78};
		hap1(scores);
		hap2(scores);
		hap3(scores);
		avg1(scores);
		//(합계 : 356)
		//(평균 : 71)
		//(영어점수의 합계는 : 356점)
	}
	
	public static void hap1(int[] ss) {
		int sum = 0;
		for(int i = 0; i<ss.length; i++) {
			sum += ss[i];
		}
		System.out.println("(합계:"+sum+")");
	}
	public static void hap2(int[] ss) {
		int sum = 0;
		for(int i = 0; i<ss.length; i++) {
			sum += ss[i];
		}
		System.out.println("(영어점수의 합계:"+sum+"점)");
	}
	public static void hap3(int[] ss) {
		int sum = 0;
		for(int i = 0; i<ss.length; i++) {
			sum += ss[i];
		}
		System.out.println("(국어점수의 합계:"+sum+"점)");
	}
	public static void avg1(int[] ss) {
		int sum = 0;
		for(int i = 0; i<ss.length; i++) {
			sum += ss[i];
		}
		int avg = sum/ss.length;
		System.out.println("(평균:"+avg+")");
	}
	
	

}
