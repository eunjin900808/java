package study2;

public class Test3 {

	public static void main(String[] args) {
		
		int number = 1; //1
		
		// 1증가
		number = number + 1;// 2
		number += 1;		// 3
		number++;			// 4
		++number;			// 5
		
		// 2증가
		number = number + 2;// 7
		number += 2;		// 9
//		number++2; 없음
		
		// 100증가
		number = number + 100; //109
		number += 100;		   //209
		System.out.println("number변수 값: " + number);
		
		int count = 100;
		// 1가감
		count = count -1; // 99
		count -= 1;		  // 98
		count--;		  // 97
		--count;		  // 96
		
		// 2가감
		count = count - 2;// 94
		count -=2;		  // 92
		System.out.println("count변수 값: " + count);
		
		
	}
}
