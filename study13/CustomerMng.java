package study13;

class Customer1VO {
	private String name;
	private int age;
	//GET-SET
	
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
class Customer2VO extends Customer1VO{
	String phone;
	String address;
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String pone) {
		this.phone = pone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
	
public class CustomerMng {
	
	public static void main(String[] args) {
		Customer2VO c = new Customer2VO();
		c.setName("이방인");
		c.setPhone("010-1111-7777");
		c.setAge(30);
		c.setAddress("서울");
		System.out.println(c.getName());
	}
}


