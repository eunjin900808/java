package study10;

import java.nio.channels.Channel;

public class MyTv2 {

	public static void main(String[] args) {
		
		MyRemocon2 con = new MyRemocon2();
		
		con.power(); //true
		System.out.println("전원:"+con.power);
		System.out.println("채널:"+con.channel);
		con.channelUp();
		con.channelUp();
		System.out.println("채널:"+con.channel);//2
		con.setChannel(99);
		System.out.println("채널:"+con.channel);//99
		con.channelUp();
		System.out.println("채널:"+con.channel);//100
		con.channelUp();//100
		con.channelUp();//100
		System.out.println("채널:"+con.channel);//100
		con.setChannel(150);
		System.out.println("채널:"+con.channel);//0
		con.channelDown();
		System.out.println("채널:"+con.channel);//100
		con.channelDown();
		System.out.println("채널:"+con.channel);//99
		con.power();
		System.out.println("전원:"+con.power);
		
		

	}

}
