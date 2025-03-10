package mytest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class TestArrayList {

	public static void main(String[] args) throws Exception{
		
		//파일경로설정
		String filePath = "c:/mytemp/post.txt";
		//파일을 읽어들이기 위한 작업(1)
		FileReader fr = new FileReader(filePath);	//경로인식
		BufferedReader buffer = new BufferedReader(fr);	//읽어들이는 메소드
		
		List<String> list = new ArrayList<String>();
		
		long s1 = System.nanoTime();
		long u1 = System.currentTimeMillis();
		while(true) {
			String str = buffer.readLine();	//한줄씩 읽어들임
			if(str == null) break;
			String[] datas = str.split(",");
			
			int cnt = 0;
			
			int z = 0;
			while(z < list.size()) {
				if(list.get(z).equals(datas[0])) cnt = 1;
				z++;
			}
//			for(String data : list) {
//				if(data.equals(datas[0])) cnt = 1;
//			}
			if(cnt == 0) {
				list.add(datas[0]);
				//list.get(1);				
			}
			
		}
		
		for(int post = 0; post<list.size(); post++) {
			System.out.println(list.get(post) + " " +(post+1));
		}
		long s2 = System.nanoTime();
		long u2 = System.currentTimeMillis();
		
		System.out.println("---------------------------");
		System.out.println(u2-u1);
		System.out.println(s2-s1);
		//배열
		//(	출력변수 : 배열변수 )
//		for(String post : list) {
//			System.out.println(post);
//		}
	}

}
