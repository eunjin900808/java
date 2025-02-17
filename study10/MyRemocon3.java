package study10;

public class MyRemocon3 {
	
	boolean pow = false;//전원
	int temp = 20; 		//온도
	char wind = 'A';	//바람세기(A:약풍, B:중풍, C:강풍)
	char drive = 'A';	//운전 (A:난방, B:냉방, C:송풍, D:제습)
	
	public void pow() {
		pow = !pow;
	}
	
	public void tempUp() {
		if(temp < 30) {
			temp++;			
		}
	}
	
	public void tempDown() {
		if(temp > 10) {
			temp--;			
		}
	}
	
	public void setWind() {
		//바람세기(A:약풍, B:중풍, C:강풍)
		wind++;
		if(wind == 'D') {
			wind = 'A';
		}
	}
	
	public void setDrive() {
		drive++;
		if(drive == 'E') {
			drive = 'A';
		}
	}
	
	public void setTemp25() {
		temp = 25;
		drive = 'C';
	}

}
