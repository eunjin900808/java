package arrayMap;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest1 {

	public static void main(String[] args) {
		
		int[] ar1 = new int[5];
		ar1[0] = 10;
		ar1[1] = 20;
		ar1[2] = 30;
		System.out.println(ar1[1]);
		System.out.println(ar1.length);
		//배열은 삭제 기능이 없음
		
		
		
		List<Integer> list1 = new ArrayList<Integer>();
		List<String> list2 = new ArrayList<String>();
		List<Double> list3 = new ArrayList<Double>();
		List list4 = new ArrayList();	//노란줄이 뜨면 가급적으로 이렇게 하지말라는 뜻
		
		//인덱스번호는 0번부터 자동부여
		//인덱스번호는 직접입력 시 반드시 0번부터 순차적 세팅 가능
		//데이터 삭제 시 위 번호에서 아래로 채움
		
		list1.add(50);
		list1.add(100);
		list1.add(300);
//		list1.add("1212"); (x)
//		list1.add(1.5); (x)
		
		System.out.println(list1.get(1));	//100
		list1.remove(1);	//삭제 (리스트는 삭제기능이 있지만 배열은 삭제없음)
		System.out.println(list1.get(1));	//300
		
		
		list2.add("java");
		list2.add("react");
//		list2.add(123);
		
		list3.add(1.5);
		list3.add(3.14);
		
		list4.add(11);
		list4.add("홍길동");
		list4.add(99.1);
		list4.add(true);

		
		for(int i = 0; i<list4.size(); i++) {
			System.out.println(list4.get(i));
		}
		
		List<Integer> list5 = new ArrayList<Integer>();
		list5.add(0,111);	//o
		list5.add(1,222);	//o
		list5.add(2,333);	//o
		System.out.println(list5.get(1));
		
		List<Integer> list6 = new ArrayList<Integer>();
//		list5.add(11,1212);	//x
		list6.add(0,3434);	//x
		list6.add(2,5656);	//x
		System.out.println(list6.get(2));

		/*
		 * System.out.println(list1.get(0));
		System.out.println(list1.get(1));
		System.out.println(list1.get(2));
		
		System.out.println(list4.get(0));
		System.out.println(list4.get(1));
		System.out.println(list4.get(2));
		System.out.println(list4.get(3));
		System.out.println(list4.get(4));
		 */
		
		

	}

}
