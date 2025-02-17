package study10;

public class MyRadio {

	public static void main(String[] args) {
		
		MyRemocon radio = new MyRemocon();
		radio.power();
		System.out.println(radio.power);
		radio.channelUp();
		radio.channelUp();
		radio.channelUp();
		System.out.println(radio.channel);
		radio.channelDown();
		System.out.println(radio.channel);
		radio.channel=91;
		System.out.println(radio.channel);
		radio.power();
		System.out.println(radio.power);
		
	}

}
