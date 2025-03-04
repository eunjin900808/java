package myThread;

public class MyThreadTest1 {

	public static void main(String[] args) {
		//예제1)
//		for(int i = 1; i<=10; i++) {
//			System.out.println("번호 " + i);
//		}
//		
//		try {
//			// 지연시간
//			Thread.sleep(500); //1000 -> 1초
//		}catch(Exception e) { }
		
		
		//예제2)
		for(int i = 1; i<5; i++) {
			System.out.println("호떡" + i + "개 먹고");
		}
		
		try {
			// 지연시간
			Thread.sleep(300); //1000 -> 1초
		}catch(Exception e) { }

		for(int i = 1; i<5; i++) {
			System.out.println("꿀떡" + i + "개 먹고");
		}
		
		try {
			// 지연시간
			Thread.sleep(300); //1000 -> 1초
		}catch(Exception e) { }
		
		

	}

}
