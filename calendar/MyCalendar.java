package calendar;

import java.util.Calendar;

public class MyCalendar {

	public static long getDateUnixtime(String date) {
		
		Calendar cal = Calendar.getInstance();
		
		String[] str = date.split("-");
		//String -> Integer
		int yy = Integer.parseInt(str[0]);
		int mm = Integer.parseInt(str[1]);
		int dd = Integer.parseInt(str[2]);
		cal.set(yy,(mm-1),dd);
		
		//특정날짜의 유닉스시간
		return cal.getTimeInMillis();
	}
	
	public static int dateDif1(String date) {
//		풀어보기3)
		
		//형식체크(생략) 2025-12-25
		//Calendar 클래스의 인스턴스화
		Calendar cal = Calendar.getInstance();
		//오늘(지금)의 유닉스시간
		long unix1 = cal.getTimeInMillis();
		
		//특정날짜의 유닉스시간
		long unix2 = getDateUnixtime(date);
		
		//두 날짜의 차이를 계산
		//1초 -> 1000 ==> 1000/1000 ->1
		int min = (int)((unix2/1000) - (unix1/1000));
		
		int result = min/(60*60*24);
		
		result = Math.abs(result);
		return result;
	}
	
	public static int dateDif2(String date1, String date2) {
//		풀어보기4)
		long unix1 = getDateUnixtime(date1);
		long unix2 = getDateUnixtime(date2);
		
		int min = (int)((unix2/1000) - (unix1/1000));
		int result = min/(60*60*24);
		result = Math.abs(result);
		
		return result;
	}
	
	public static void main(String[] args) {

		// 수능일의 D-Day 설정
		String date1 = "2025-11-14";
		System.out.println("수능일은 "+date1+"으로 "+dateDif1(date1)+"일 남았습니다");
		
		System.out.println("두 날짜 차이 : "+dateDif2("2022-01-01", "2022-01-03")+"일");
		
	}

}
