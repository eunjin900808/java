package study9;

import java.awt.TextComponent;
import java.awt.desktop.ScreenSleepEvent;
import java.util.Scanner;

public class StringTest4 {

	public static void main(String[] args) {
		
		//풀어보기2)
		Scanner scn = new Scanner(System.in);
		
		String title = "자바프로그래밍 입문";
		String content = "자바를 이용하여 기초부터 중급까지 완성한다.";
		
		System.out.print("검색단어 입력>> ");
		String searchWord = scn.next();
		boolean tt = title.contains(searchWord); //true, false
		boolean ct = content.contains(searchWord); //true, false
		
		String str = "";
//		if(tt == true && ct == true) {
//			str = "제목과 내용에서 검색되었습니다.";
//		}else if(tt == true && ct == false) {
//			str = "제목에서 검색되었습니다.";
//		}else if(tt == false && ct == true) {
//			str = "내용에서 검색되었습니다.";
//		}else {
//			str = "제목과 내용에서 검색되지 않았습니다.";
//		}
		
		if(tt && ct) {
			str = "제목과 내용에서 검색되었습니다.";
		}else if(tt && !ct) {
			str = "제목에서 검색되었습니다.";
		}else if(!tt && ct) {
			str = "내용에서 검색되었습니다.";
		}else {
			str = "제목과 내용에서 검색되지 않았습니다.";
		}
		
		System.out.println("검색단어 "+searchWord+"는 "+str);
		
		System.out.println();
		
		//풀어보기3)
		String date = "2025-02-11";
		
		int aa = date.indexOf("2025");
		int bb = date.indexOf("02");
		int cc = date.indexOf("11");
		System.out.print(date.substring(aa,aa+4)+"년 ");
		System.out.print(date.substring(bb,bb+2)+"월 ");
		System.out.print(date.substring(cc,cc+2)+"일");
		
		System.out.println();
		
		String[] array = date.split("-");
		System.out.println(array[0]+"년 "+array[1]+"월 "+array[2]+"일 ");
		
		System.out.println();
		
//		---------------------------------------------------------------------
		//substring()
		String yy = date.substring(0,4); 	//0~3
		String mm = date.substring(5,7); 	//5~6
		String dd = date.substring(8,10); 	//11
		System.out.println(yy+"년 "+mm+"월 "+dd+"일 ");
		//split() :: 구분자를 통해 분리 -> 배열형식의 결과
		String[] str2 = date.split("-");
//		String[] str2 = {"2025","02","11"};
		yy = str2[0];
		mm = str2[1];
		dd = str2[2];
		System.out.println(yy+"년 "+mm+"월 "+dd+"일 ");
		
		System.out.println();
				
		//풀어보기4)
		
		String scores = "70,90,88";
		String[] ab =scores.split(",");
		for(int i =0; i<ab.length;i++) {
			
			System.out.println(ab[i]);
		}
		System.out.println();
//		---------------------------------------------------------------------
		String s1 = scores.substring(0,2);
		String s2 = scores.substring(3,5);
		String s3 = scores.substring(6,8);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		System.out.println();
		
		String[] datas = scores.split(",");
//		String[] datas = {"70","90","88"};
		for(int i = 0; i<datas.length;i++) {
			System.out.println(datas[i]);
		}
		System.out.println();
		
		//풀어보기5)
		String str5 = "오늘의 학습\n자바\n데이터베이스\n전자정부 프레임워크";
		String str6 = str5.replace("\n","<br>");
		System.out.println(str6);
		str6 = str6.replace(" ","&nbsp;");
		System.out.println(str6);

	}

}
