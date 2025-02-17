package study4;

import java.awt.image.AreaAveragingScaleFilter;

public class Me {

	public static void main(String[] args) {
		
		byte t1 = 9;
		byte t2 = 34;
		String aa = "무효";
		
		if(t1 >= 6 && t1 <=8) {
			aa = "출석";
		}else if(t1 == 9) {
			if(t2 >= 0  && t2 <= 30) {
				aa = "출석";
			}else {
				aa = "지각";				
			}
		}else if(t1 >= 14 && t1 >= 17) {
			aa = "결석";
		}
		System.out.println(aa);
		

	}

}
