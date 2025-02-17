package study8;

public class Test3 {

	public static void main(String[] args) {
		int[] scores = {60,70,80,68,78};
		int sum = hap1(scores);
		int avg = avg1(scores);
		System.out.println("(합계 : "+sum+")");
		System.out.println("(영어점수의 합계 : "+sum+"점)");
		System.out.println("(국어점수의 합계 : "+sum+"점)");
		System.out.println("(평균:"+avg+")");
		//(합계 : 356)
		//(평균 : 71)
		//(영어점수의 합계는 : 356점)
	}
	
	public static int hap1(int[] ss) {
		int sum = 0;
		for(int i =0; i < ss.length; i++) {
			sum+=ss[i];// 0 1 2 3 4
		}
		return sum;
	}
	public static int avg1(int[] ss) {
		int avg = hap1(ss)/ss.length;
		return avg;
	}


}
