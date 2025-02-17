package study8;

public class Test1 {

	public static void main(String[] args) {
		int[] score = {60,70,80,68,78}; //0 ~ 4
		int sum = arraySum(score);
		int avg = sum/score.length;
		System.out.println("배열값 합계: "+sum+" 입니다.");
		System.out.println("배열값 평균: "+avg+" 입니다.");
		
		String[] subject = {"java","spring","react"};
		arrayString(subject);
	}
	
	public static int arraySum(int[] array) {
		int sum = 0;
		for(int i= 0;i <array.length;i++) {	
			sum += array[i];
		}
		return sum;
	}
	
	public static void arrayString(String[] args) {
		for(int i= 0;i <args.length;i++) {	
			System.out.println(args[i]);
		}
	}

}
