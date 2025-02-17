package study4;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		String name = "이은진";
		System.out.print("성별입력(M or F)>> ");
		String gender = scn.next();
		String address = "구리시";
		String msg = "";
		
		if (gender.equals("M")) {	// >=, <=, !=, >, == :: 숫자전용
			msg = "남성";
		}else if(gender.equals("F")){
			msg = "여성";
		}else {
			msg = "설정안됨";
		}
		System.out.println(msg+"입니다.");


	}

}
