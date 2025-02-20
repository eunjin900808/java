package calendar;

import java.util.Calendar;

public class Test6 {

	public static void main(String[] args) {
		
		String data = "1740032633294";
		
		Calendar cal = Calendar.getInstance();
		// (1) data 변수의 Long 타입 변환
		// (2) 초단위로의 변환
		long unix1 = Long.parseLong(data)/1000; 
	
		// (3) 60일을 초단위로 계산함
		int plus = (60*60*24)*60;
		
		// (4) 초단위로 변환된 결과 값과 합산함
		long unix2 = unix1 + plus;
		// 초단위 결과에서 실제 유닉스타임의 크기로 늘림
		unix2 = unix2*1000;
		
		// (5) setTimeInMillis() 로 시점 변환
		cal.setTimeInMillis(unix2);

		// (6) get() 메소드를 통해 년월일을 가져옴 
		int yy = cal.get(1);
		int mm = cal.get(2);  // 0 ~ 11
		int dd = cal.get(5);
		
		System.out.println( yy+"-"+(mm+1)+"-"+dd );

	}

}
