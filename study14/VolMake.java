package study14;
//캡슐화, 상속(implements), 다형성(오버레이딩),추상화(interface)
public class VolMake implements VolService{

	//멤버변수, 인스턴스변수
	private int volLevel; //기본 값 0이 자동 세팅됨
	public VolMake() {
		volLevel = 1;
	}
	@Override
	public void volUp(int level) {
		this.volLevel += level;	
	}

	@Override
	public void volDown(int level) {
		this.volLevel -= level;
	}
	
	public int getVolLevel() {
		return volLevel;
	}
	public void setVolLevel(int volLevel) {
		this.volLevel = volLevel;
	}
	

	
}
