package myThread;

public class MyThreadTest3 extends Thread{

	public void run() {
		for(int i = 1; i<5; i++) {
			System.out.println("호떡" + i + "개 먹고");
			try {
				// 지연시간
				Thread.sleep(300); //1000 -> 1초
			}catch(Exception e) { }
		}
	}
	
	public static void main(String[] args) {
		
		MyThreadTest3 my3 = new MyThreadTest3();
		my3.start();
		for(int i = 1; i<5; i++) {
			System.out.println("꿀떡" + i + "개 먹고");
			try {
				// 지연시간
				Thread.sleep(300); //1000 -> 1초
			}catch(Exception e) { }
		}

	}

}
