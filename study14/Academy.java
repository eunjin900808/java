package study14;

abstract class MySubject{
	abstract void subjectName();
}

class Java extends MySubject {
	// @ : 어노테이션이라고 부름 : 시스템 주석
	//오버레이드 어노테이션
	@Override
	void subjectName() {
		System.out.println("자바프로그램");
	}
	
}

class Spring extends MySubject{
	@Override
	void subjectName() {
		System.out.println("스프링프레임워크");
	}
}

public class Academy {

	public static void main(String[] args) {
		
		Java java =new Java();
		Spring spring = new Spring();
		java.subjectName();
		spring.subjectName();

	}

}
