package mytest;

public class MyPatternCheck {
	
	public static boolean method1(String str) {
	
		String pattern = "[0-9]{6}-[1-4]{1}[0-9]{6}";
		boolean result = str.matches(pattern);
		return result;
	}
	public static boolean method2(String str) {	
		//abc.jpg; bb.txt ; c123c.java; a.b.c.gif;
		//array[1]; array[3];
		String[] array = str.split("\\.");
		String ext = array[array.length-1];	//배열개수-1
		
		ext = ext.toLowerCase(); 	//대문자 -> 소문자
		
		boolean result = false;
		if(ext.equals("jpg") || ext.equals("gif") || ext.equals("png")) {
			result = true;
		}
		
		return result;
	}

	public static void main(String[] args) {

		String num1 = "900808-1123456";
		String num2 = "abc.c.c.png";
		System.out.println(method1(num1));
		System.out.println(method2(num2));

	}

}
