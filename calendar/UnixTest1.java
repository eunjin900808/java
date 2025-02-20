package calendar;

import java.util.Calendar;

public class UnixTest1 {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		cal.set(2025, 11,25); //2025-21-25 현시간

		// 1000/1000 -> 1		
		long unixTime = cal.getTimeInMillis();
		int time = (int)unixTime/1000;
		
		System.out.println(unixTime);
		System.out.println(time);
		//예) abc.jpg --> 1740019205281.jpg
		
		//1766630782518
		//1
		cal.setTimeInMillis(1166630782518L);
		
		int yy = cal.get(Calendar.YEAR);
		int mm = cal.get(Calendar.MONTH);
		int dd = cal.get(Calendar.DATE);
		
		System.out.println(yy+"-"+(mm+1)+"-"+dd);
		
		System.out.println("--------------------------");

		Calendar cal2 = Calendar.getInstance();
		
		String data ="1177730782518";
		//2025년 1월 10일이고 31일까지 있습니다.
//		int time2 = Integer.parseInt(data); //예외사항발생
		long unixtime = Long.parseLong(data);
		
		cal2.setTimeInMillis(unixtime);
		
		int yy2 = cal2.get(Calendar.YEAR);
		int mm2 = cal2.get(Calendar.MONTH);
		int dd2 = cal2.get(Calendar.DATE);
		
		int lastday2 = cal2.getActualMaximum(Calendar.DATE);//마지막날짜
		
		System.out.println(yy2+"년 "+(mm2+1)+"월 "+dd2+"일 "+lastday2+"일까지 있습니다.");
		
		
		
	}

}
