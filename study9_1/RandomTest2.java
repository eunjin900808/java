package study9_1;

import java.util.Random;

public class RandomTest2 {

	public static void main(String[] args) {
		
		Random rn = new Random();
		System.out.println(rn.nextInt());
		//0 ~ 99
		System.out.println(rn.nextInt(100));
		//0 ~ 44
		System.out.println(rn.nextInt(45));
		//1 ~ 45
		System.out.println(rn.nextInt(45)+1); //0부터 쓰는것이기때문에 46이 아니라 +1을 써준다
		
		System.out.println(rn.nextBoolean());	//true, false
		System.out.println(rn.nextDouble());
		System.out.println(rn.nextFloat());
		System.out.println(rn.nextLong());
		
		System.out.println("---------------------------------------");
		
		System.out.println(rotto());
	}
	
	public static String rotto() {
		Random rn = new Random();
		String rotto = "";
		for(int i =0;i<=6;i++) {
			rotto +=(rn.nextInt(45)+1)+" ";	
		}
		//trim() 메소드 : 앞뒤공백제거
		rotto = rotto.trim();
		return rotto;
	}

}
