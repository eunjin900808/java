package study10;

public class MyAircon {

	public static void main(String[] args) {
		
		MyRemocon3 con = new MyRemocon3();
		
		//전원
		con.pow(); //pow :: false -> true
		System.out.println(con.pow);
		
		//온도 2증가
		System.out.println("현재온도:"+con.temp);//20
		con.tempUp();//21
		con.tempUp();//22
		System.out.println("현재온도:"+con.temp);//22
		
		System.out.println("운전상태:"+con.drive);//A (난방)
		//운전선택 (난방 -> 냉방)
		con.setDrive();
		System.out.println("운전상태:"+con.drive);//B (냉방)
		
		
		System.out.println("바람세기:"+con.wind);//A
		//바람세기 (약풍(A) ->중풍(B))
		con.setWind();
		System.out.println("바람세기:"+con.wind);//B
		
		//실내온도
		con.setTemp25();
		System.out.println("현재온도:"+con.temp);
		System.out.println("운전상태:"+con.drive);//C
		

	}

}
