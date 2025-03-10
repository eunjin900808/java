package mytest;

public class ArrayTest {

	public static void main(String[] args) {
		String[] a = {"영어","수학","과학","체육","국어"};
		String[] b = {"90","88","75","55","95"};
		String str = ""; 
		
		
		for(int i = 0; i<b.length;i++) {
			String aa= a[i];
			int bb = Integer.parseInt(b[i]);
			if(bb <= 100 && bb >= 90) {
				str = "A";
			}else if(bb <90 && bb >= 80) {
				str = "B";
			}else if(bb < 80 && bb >= 70) {
				str = "C";
			}else if(bb < 70 && bb >= 60) {
				str = "D";
			}else if(bb < 60 && bb >=0){
				str = "F";
			}else {
				str = "잘못된 점수";
			}
			
			System.out.print("["+aa+":"+str+"]");
		}

	}

}
