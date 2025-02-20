package calendar;

import java.util.Calendar;

public class Test4 {

	public static long myDateUnixTime(String date) { //매개변수
		
		Calendar cal = Calendar.getInstance();
		String[] arr = date.split("-");
		
		int y = Integer.parseInt(arr[0]);
		int m = Integer.parseInt(arr[1]);
		int d = Integer.parseInt(arr[2]);

		cal.set(y, (m-1), d); //시점세팅
		
		long unix = cal.getTimeInMillis()/1000;
		
		return unix;
	}
	
	public static void main(String[] args) {
		
		String date1 = "2025-02-26";
		String date2 = "2025-02-23";
		
		long unix1 = Test4.myDateUnixTime(date1);
		long unix2 = Test4.myDateUnixTime(date2);
		
		long min = unix2 - unix1;
		int result =(int)(min/(60*60*24));
		
		//절대 값 메소드
		result = Math.abs(result);
		
		System.out.println(date1+"과 "+date2+"는 "+result+"일 차이");
		
		//2025-02-24 와 2025-02-26 는 2일 차이 입니다

	}

}
