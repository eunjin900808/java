package study10;

public class Student1 {

	public static void main(String[] args) {
//		int math =0;
	//	참조클래스		참조변수		 = 객체처리
		StudentInfo studentInfo1 = new StudentInfo();
		studentInfo1.eng = 90;
		studentInfo1.kor = 80;
		studentInfo1.name = "홍길동";
//		math = 100;
		System.out.println("이름: "+studentInfo1.name+", 영어점수: "+studentInfo1.eng+", 국어점수: "+studentInfo1.kor);
		
		StudentInfo studentInfo2 = new StudentInfo();
		studentInfo2.eng = 60;
		studentInfo2.kor = 40;
		studentInfo2.name = "김철수";
//		math = 70;
		System.out.println("이름: "+studentInfo2.name+", 영어점수: "+studentInfo2.eng+", 국어점수: "+studentInfo2.kor);

		System.out.println("---------------------------------------");
//		int hong_sum = studentInfo1.eng +studentInfo1.kor;
//		int kim_sum = studentInfo2.eng +studentInfo2.kor;
		System.out.println("홍길동 총점: " + studentInfo1.hap());
		System.out.println("김철수 총점: " + studentInfo2.hap());
		
		System.out.println("홍길동 평균: " + studentInfo1.avg());
		System.out.println("김철수 평균: " + studentInfo2.avg());
	}

}
