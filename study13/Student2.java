package study13;

class person2{
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}

public class Student2 extends person2{

	public void allSet() {
//		name = "이상엽";
//		age = 42;
		setName("이상엽");
		setAge(42);
	}
	
	public static void main(String[] args) {
		
		Student2 s2 = new Student2();
		s2.allSet();
		
//		s2.setName("홍길동");
//		s2.setAge(22);
		
		String name = s2.getName();
		int age = s2.getAge();
		
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);

	}

}
