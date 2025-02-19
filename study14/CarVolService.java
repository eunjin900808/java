package study14;

public interface CarVolService extends VolService{
	
//	public void volUp(int level);
//	public void volDown(int level);
	
	public void volOff();	//볼륨 꺼 버림
	public void volPause();	//잠시 멈춤
	public void volResume();//볼륨 재시작
}
