package mytest;

class peopleInfo{
//	String name;
//	int a;
//	String b;
//	String c;
	
	peopleInfo(String name) {
//		this.name = name;
		System.out.println(name + "입니다.");
	}
	
	peopleInfo(String name,int a) {
//		this.name = name;
//		this.a = a;
		System.out.println(name+"의 나이는 "+a+"세 입니다.");
	}
	
	peopleInfo(int a,String b,String c) {
//		this.a = a;
//		this.b = b;
//		this.c = c;
		b = b.equals("F")?"여성":"남성";
		System.out.println(a+"세의 "+b+"은 "+c+"에 거주하고 있습니다.");
	}
}

public class PeopleMain {
	

	public static void main(String[] args) {
		
//		peopleInfo aa = new peopleInfo("홍길동");
//		System.out.println(aa.name+"입니다");
//		
//		peopleInfo bb =new peopleInfo("토마스", 25);
//		System.out.println(bb.name+"의 나이는 "+bb.a+"세 입니다.");
//		
//		peopleInfo cc = new peopleInfo(31, "여성", "서울");
//		System.out.println(cc.a+"세의 "+cc.b+"은 "+cc.c+"에 거주하고 있습니다.");
		
		//앞에 참조클래스 변수 없어도됨~
		new peopleInfo("홍길동");
		new peopleInfo("토마스", 25);
		new peopleInfo(31, "F", "서울");

	}

}
