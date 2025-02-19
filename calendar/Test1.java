package calendar;

import java.util.Calendar;

public class Test1 {

	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance(); //날짜 클래스의 인스턴스 처리

		//100일 후
		cal.add(Calendar.DATE, 100);

		//3년 후
//		cal.add(Calendar.YEAR, 3);
		
		//18개월 후
//		cal.add(Calendar.MONTH, 18);
				
		int yy = cal.get(Calendar.YEAR);
		int mm = cal.get(Calendar.MARCH); // 0~ 11
		int dd = cal.get(Calendar.DATE);
		
		int hh = cal.get(Calendar.HOUR_OF_DAY);
		int mi = cal.get(Calendar.MINUTE);
		int ss = cal.get(Calendar.SECOND);
		System.out.println(yy+"년 "+(mm+1)+"월 "+dd+"일");
		System.out.println(hh+":"+mi+":"+ss);
		
		//오전/오후 (am/pm) -> 0:오전, 1:오후
		int ampm = cal.get(Calendar.AM_PM);
		if(ampm == 0) {
			System.out.println("오전");
		}else {
			System.out.println("오후");
		}
		
		//요일( 1:일, 2:월, 3:화, ~ 7:토 )
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
//		if(dayOfWeek == 2) {
//			System.out.println("월요일");
//		}else if(dayOfWeek == 3) {
//			System.out.println("화요일");
//		}else if(dayOfWeek == 4) {
//			System.out.println("수요일");
//		}else if(dayOfWeek == 5) {
//			System.out.println("목요일");
//		}else if(dayOfWeek == 6) {
//			System.out.println("금요일");
//		}else if(dayOfWeek == 7) {
//			System.out.println("토요일");
//		}else if(dayOfWeek == 1) {
//			System.out.println("일요일");
//		}
		String str = "";
		switch(dayOfWeek) {
		case 1: str = "일요일";
		break;
		case 2: str = "월요일";
		break;
		case 3: str = "화요일";
		break;
		case 4: str = "수요일";
		break;
		case 5: str = "목요일";
		break;
		case 6: str = "금요일";
		break;
		case 7: str = "토요일";
		break;
		}
		System.out.println(str); // 4 -> 수요일
		
		System.out.println("올해의 몇번째 날 : " +cal.get(Calendar.DAY_OF_YEAR));
		System.out.println("올해의 몇번째 주 : " +cal.get(Calendar.WEEK_OF_YEAR));
		System.out.println("이달의 몇번째 주 : " +cal.get(Calendar.WEEK_OF_MONTH));
		System.out.println("이번달의 마지막 날짜 : " +cal.getActualMaximum(Calendar.DATE));
		

	}

}
