package calendar1;

import calendar.Test4;

public class Test1004 {

	public static void main(String[] args) {

		String d1 = "2024-01-25";
		String d2 = "2025-07-07";
		
		long t1 = Test4.myDateUnixTime(d1);
		long t2 = Test4.myDateUnixTime(d2);
		
		long min = t2-t1;
		int result = (int)(min/(60*60*24));
		result = Math.abs(result);
		
		System.out.println("두 날짜의 차이는 "+result+"일 입니다.");

	}

}
