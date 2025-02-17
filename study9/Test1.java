package study9;

public class Test1 {

	public static void main(String[] args) {
		
		RandomTest1.rotto1();
		
		String rotto = RandomTest1.rotto7();
		System.out.println(rotto);
		String[] array = rotto.split(" ");
//		String[] array = {" "," "," "," "," "," "};
		for(int i =0;i<array.length;i++) {
			System.out.println(array[i]); // 0 1 2 3 4 5
		}
		System.out.println("--------------------------");
		
		System.out.println(MaxTest1.myMax5(78, 100, 32, 50, 120));
	
	}
}
