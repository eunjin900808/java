package study11;

class score{
	int kor; //멤버변수,인스턴스변수
	int eng;
	int hap;
	int avg;
	public void setKor(int kor) { //매개변수
		//인스턴스변수 = 매개변수;
		this.kor = kor;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public void setHap() {
		hap= kor+eng;
//		this.hap = this.kor + this.eng;
	}
	public void setAvg() {
		avg = hap/2;
	}
}
public class VariableExam {

	public static void main(String[] args) {

		score score =new score();
		
		score.setKor(100);
		score.setEng(90);
		score.setHap();
		score.setAvg();
		
		System.out.println("합계:"+score.hap);
		System.out.println("평균:"+score.avg);

	}

}
