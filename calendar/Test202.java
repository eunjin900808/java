package calendar;

import java.util.ArrayList;
import java.util.List;

public class Test202 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("aa");
		list.add("bb");
		list.add("cc");
		
		for(String str : list  ) {
		//	System.out.println(str);
		}
		
		list.stream().forEach( str -> System.out.println(str) );

	}

}
