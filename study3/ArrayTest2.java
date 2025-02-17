package study3;

public class ArrayTest2 {

	public static void main(String[] args) {
		
		int[] scores1 = {90,100,98,46};
		
		int[] scores2 = new int[4];
		scores2[0] = 90;
		scores2[1] = 100;
		scores2[2] = 98;
		scores2[3] = 46;
		
		System.out.println(scores1[2]); //98
		System.out.println(scores2[2]); //98
		
		System.out.println(scores2.length); //98
		System.out.println(scores2.length); //98
		
		System.out.println("----------------------------------");
		
		//2차원 배열
		int[][] jumsu = {{60,90,80},{50,60,100},{90,70,78}};
		System.out.println(jumsu[0][0]);//60;첫번째 배열의 첫번째 값
		System.out.println(jumsu[0][1]);//90;첫밴째 배열의 두번째 값
		System.out.println(jumsu[0][2]);//60;첫번째 배열의 세번째 값
		
		System.out.println(jumsu[1][0]);//50;두번째 배열의 첫번째 값
		System.out.println(jumsu[1][1]);//60;두번째 배열의 두번째 값
		System.out.println(jumsu[1][2]);//100;두번째 배열의 세번째 값

		System.out.println(jumsu[2][0]);//90;세번째 배열의 첫번째 값
		System.out.println(jumsu[2][1]);//70;세번째 배열의 두번째 값
		System.out.println(jumsu[2][2]);//78;세번째 배열의 세번째 값
		
		//3차원 배열
		int[][][] school = {{{60,90,80},{50,60,100},{90,70,78}},{{100,98},{92,96}}};
		System.out.println(school[0][0][0]);//60
		System.out.println(school[0][1][1]);//60
		System.out.println(school[1][0][0]);//100
		System.out.println(school[1][1][1]);//96
		

	}

}
