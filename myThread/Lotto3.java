package myThread;

import java.util.Random;

public class Lotto3 {

	public static void main(String[] args) {
		
		Random rn = new Random();
		// 32
		int[] lotto = new int[6];	//{null,null,null,null,null,null}
		String ss = "";
		
		int i = 0;	//배열 번호는 (무조건) 0번부터
		while(true) {
			int num = rn.nextInt(45)+1;
			
			//중복체크
			int cnt = 0;
			for(int a =0; a<lotto.length; a++){
				if(lotto[a] == num) {
					cnt = 1;
					ss += num+",";
				}
			}
			if(cnt == 0) {
				lotto[i] = num;
				i++;	// 0 -> 1 -> 2 -> 3 -> 4 -> 5 -> 6(들어가지 않음)
			}
			if(i == 6) {
				break;
			}
		}
		for(int j=0; j<6; j++) {
			System.out.print(lotto[j]+" ");			
		}
		System.out.println("\n"+ss);
			}


}
