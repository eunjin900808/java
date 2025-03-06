package lambda;

public class Test2 {

	public static void main(String[] args) {
		
		String str = "함수11함수22함수33함수";
		String[] ar = str.split("함수");	//{"","11","22","33"};
		System.out.println("개수:"+ar.length);	// 4개
		
		String str1 = "11함수22함수33함수";
		String[] ar1 = str1.split("함수");	//{"11","22","33"};
		System.out.println("개수:"+ar1.length);	// 3개
		
		String str2 = "11함수22함수33";
		String[] ar2 = str2.split("함수");	//{"11","22","33"};
		System.out.println("개수:"+ar2.length);	// 3개
		
		System.out.println("---------------------");
		
		String str3 = "함수11함수22함수33";
		String[] ar3 = str3.split("함수");	//{"","11","22","33"};
		System.out.println("개수:"+ar3.length);	// 4개
		
		//lastIndexOf -> 마지막 단어의 위치
		int last = str3.lastIndexOf("함수");
		System.out.println(last);
		int cnt = ar3.length;
		// 8+2 = 10
		if(str3.length() > last+2) {
			cnt= cnt -1;
		}
		System.out.println("함수 개수:"+cnt);	//3
		
		
		
//		for(String ss : ar) {
//			System.out.print(ss+",");
//		}
//		System.out.println();
//		for(String ss : ar1) {
//			System.out.print(ss+",");
//		}

	}

}
