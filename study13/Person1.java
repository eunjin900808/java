package study13;
/*
 * 캡슐화(접근지정자)
 * public > protected > (생략) > private
 */

public class Person1 {
	
	public int age;			//모든 패키지에서 접근 가능
	protected String name; 	//같은 패키지 안에서 클래스간의 접근 가능
	int height;				//같은 패키지 안에서 클래스간의 접근 가능
	private int weight; 	//클래스 내부에서의 활용 이외는 모두 접근 불가
	
	public Person1() {}
	
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setHeight(int height) {
		if(height > 250 || height < 100) {
			height = 100;
		}
		this.height = height;
	}
	
	public int getHeight() {
		return height;
	}
	
	public int getWeight() {
		
		return weight;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}

}
