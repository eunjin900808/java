package calendar;

public class Test7 {

	public static void main(String[] args) {
		
//		MyCalendar mc = new MyCalendar(); //dateDif2 에 static 이 빠지면 인스턴스처리해줘야됨
		String[] dates = {"2025-01-01","2025-01-05"};
		
		System.out.println(MyCalendar.dateDif2(dates[0], dates[1]));
		System.out.println("----------------------");
		
		long a1 = 123456789123L;
		long a2 = 100L;
		
		//정상
		int  a3 = (int)((a1-a2)/1000);	//계산이 완전이 되고 난 후에 형변환을 해야 원하는 답을 얻을 수 있다.
		
		//비정상
		int  a4 = (int)(a1-a2/1000);	//(int)(a1-0)
		
		//비정상
		//형변환을 우선처리하고 나누기처리를 행함
//		int  a5 = (int)(123456789023L)/1000;
		int  a5 = (int)(a1-a2)/1000;
		
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(a5);

	}

}
