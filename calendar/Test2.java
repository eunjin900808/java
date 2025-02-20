package calendar;

import java.util.Calendar;

public class Test2 {

	public static void main(String[] args) {
		
		//풀어보기1
		String str = "2025-12-25";
		Calendar cal = Calendar.getInstance();
		
		long unix1 = cal.getTimeInMillis()/1000; //오늘 날짜
		
		String[] ars = str.split("-");
		int y1 = Integer.parseInt(ars[0]);
		int m1 = Integer.parseInt(ars[1]);
		int d1 = Integer.parseInt(ars[2]);
		
		cal.set(y1, (m1-1), d1);
		
		long unix2 = cal.getTimeInMillis()/1000; //넘어온 날짜
		long min = unix2-unix1;
		long result = min/(60*60*24);
		
		//60*60*24 -> 1일
		System.out.println("결과 초 : "+ min);
		System.out.println("결과 일 : "+ result);
		// 넘어온 날짜(str)의 유닉스시간을 얻음
		// 오늘 날짜의 유닉스 시간을 얻음
		// 차이를 얻어내고 날짜계산을 한다.

	}

}
