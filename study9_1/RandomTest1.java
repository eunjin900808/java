package study9_1;

public class RandomTest1 {

	public static void main(String[] args) {
		
		int a1 = (int)0.1234; // 형변환을 하게 되면 소수점 자리를 버림 -> 0
		int a2 = (int)21.1234; // 형변환을 하게 되면 소수점 자리를 버림 -> 21
		System.out.println(a1 + " " + a2);
		
		// 1 ~ 45 사이의 랜덤 값
		int r0 = (int)(Math.random()*45)+1; //Math 자체가 실수타입이기때문에 형변환해줘야함
		System.out.println(r0);

		rotto1();
	}
	
	public static void rotto1() { //return 키워드가 없는 메소드
		//로또
		int r1 = (int)(Math.random()*45)+1;
		int r2 = (int)(Math.random()*45)+1;
		int r3 = (int)(Math.random()*45)+1;
		int r4 = (int)(Math.random()*45)+1;
		int r5 = (int)(Math.random()*45)+1;
		int r6 = (int)(Math.random()*45)+1;
		System.out.println(r1+" "+r2+" "+r3+" "+r4+" "+r5+" "+r6+" ");
	}
	
	public static String rotto7() { //return 키워드가 무조건 존재
		// 1~45 사이의 랜덤 값
		int r1 = (int)(Math.random()*45)+1;
		int r2 = (int)(Math.random()*45)+1;
		int r3 = (int)(Math.random()*45)+1;
		int r4 = (int)(Math.random()*45)+1;
		int r5 = (int)(Math.random()*45)+1;
		int r6 = (int)(Math.random()*45)+1;
		String rotto = r1+" "+r2+" "+r3+" "+r4+" "+r5+" "+r6;
		return rotto;
	}

}
