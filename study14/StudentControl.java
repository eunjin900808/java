package study14;

abstract class StudentService{
	abstract public int sum();
	
}
class StudentImpl extends StudentService{
	private String name;
	private int eng;
	private int kor;
	
	public int sum() {
		return eng+kor;
	}
	
	//--> GET/SET
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
}

public class StudentControl extends StudentImpl{
	
	public void input(String name, int eng, int kor) {
		setName(name);
		setEng(eng);
		setKor(kor);
	}
	public void output() {
		System.out.println("이름 : "+getName());
		System.out.println("영어 : "+getEng());
		System.out.println("국어 : "+getKor());
		System.out.println("합계 : "+sum());
	}


	public static void main(String[] args) {

		StudentImpl s1 = new StudentImpl();
		
//		s1.setName("손흥민");
//		s1.setEng(100);
//		s1.setKor(90);
//		System.out.println("이름 : "+s1.getName());
//		System.out.println("영어 : "+s1.getEng());
//		System.out.println("국어 : "+s1.getKor());
//		System.out.println("합계 : "+s1.sum());
		
		StudentControl s2 = new StudentControl();
		StudentControl s3 = new StudentControl();
		
		s2.input("손흥민",100,90);
		s3.input("차범근",90,80);
		
		s2.output();
		System.out.println("-------------");
		s3.output();
		

	}

}
