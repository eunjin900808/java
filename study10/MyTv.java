package study10;

public class MyTv {

	public static void main(String[] args) {
		
		MyRemocon tv = new MyRemocon();
		
		System.out.println(tv.power); //false;
		tv.power(); //파워 on
		System.out.println(tv.power); //true;
		tv.channel = 11;
		System.out.println(tv.channel);//11
		tv.channelDown();
		System.out.println(tv.channel);//10
		tv.channelUp();//11
		tv.channelUp();//12
		System.out.println(tv.channel);//12
		tv.power();//t -> f
		System.out.println(tv.power); //false;

	}

}
