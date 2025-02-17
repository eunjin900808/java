package study5;

public class Me1 {

	public static void main(String[] args) {
		
		int dan =3;
		for(int i = 1; i <=9; i++) {
			System.out.println(dan+"x"+i+"="+dan*i);
		}
		
		System.out.println("\n\n");
//		-------------------------------------------------------------
		
		int dan1 =2;
		for(int i=1;i <=5;i+=2) {
			System.out.println(dan1+"x"+i+"="+dan1*i);
		}

		System.out.println("\n\n");
//		-------------------------------------------------------------
		
		int star = 7;
		for(int i = 1; i <= star;i++) {
			System.out.print("*");
		}
		
		System.out.println("\n\n");
		
//		------------------------------------------------------------
		for(int j = 1; j <=5 ;j++) {
			
			for(int i = 1; i <= j ;i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("\n\n");
//		------------------------------------------------------------
		
		for(int a = 5;a >=1; a--) {
			for(int i = 1;i <= a; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
	

}
