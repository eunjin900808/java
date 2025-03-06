package myThread;

public class MyThreadLotto extends Thread{
	
	public void run() {
		for(int i = 0; i <2; i++) {	//2번 회전
			int z = (int)Math.ceil(Math.random()*45);			
			System.out.print(z+" ");
			try {
				sleep(2000);	//2초
			}catch(Exception e){  }
		}
		
	}
	/*
	 * 멀티스레드 형식의 실행
	 * 인스턴스(객체)처리 후 각자의 반복문이 동시에 실행 됨
	 */

	public static void main(String[] args) {
		
		MyThreadLotto lotto1 = new MyThreadLotto();
		MyThreadLotto lotto2 = new MyThreadLotto();
		MyThreadLotto lotto3 = new MyThreadLotto();
		lotto1.start();	// 2번
		lotto2.start();	// 2번
		lotto3.start();	// 2번

	}

}
