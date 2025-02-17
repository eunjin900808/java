package study10;

public class MyRemocon2 {

	boolean power = false;
	int channel =0;
	
	public void power() { // f->t
		power = !power;
	}
	
	public void setChannel(int c) {
		if(c<0 || c>100) {
			channel = 0;
		}else {
			channel = c;
		}
	}
	
	public void channelUp() {
		if(channel < 100) {
			channel++;					
		}
	}
	
	public void channelDown() {
		channel--;
		if(channel == -1) {
			channel = 100;
		}
	}
	
}
