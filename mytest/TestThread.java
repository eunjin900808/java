package mytest;

/*
 * Thread : 멀티스레드(동시실행)
 */
//class Player extends Thread{
//	int num;
//	
//	public Player(int num) {
//		this.num = num;
//	}
//	
//	public void run() {
//		int cnt = 0;
//		int lastCnt = 100;
//		while(cnt < lastCnt) {
//			cnt += 5;		
//			if(cnt%30 == 0) {
//				num += 1;
//				System.out.println("("+num+"번 반복문)" + cnt +"M 통과");
//			}
//			try {
//				Thread.sleep(100);
//			}catch(Exception e) { }
//		}
//		System.out.println("\n** "+num+"번 반복문 종료**");
//	}
//}
public class TestThread  extends Thread{
		
	int number;
	public TestThread(int number) {
		this.number = number;
	}
	public void run() {
		
	for(int i = 0; i<=100; i++) {
		if(i%30 == 0) {
			System.out.print("("+ number+"번)"+i+"M ");
		}
		try{
			Thread.sleep(20);	//0.02초
		}catch (Exception e) {}
	}
	System.out.println("\n("+ number+"번) 회전이 끝났습니다.");
}

	public static void main(String[] args) {
			
		TestThread t1 = new TestThread(1);
		TestThread t2 = new TestThread(2);
		TestThread t3 = new TestThread(3);
		t1.start();
		t2.start();
		t3.start();
//		System.out.println("@@ 시작 @@0");
//
//		Player p1 = new Player(0);
//		
//		System.out.println();
//		p1.start();

		

	}

}
