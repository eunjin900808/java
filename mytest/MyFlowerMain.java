package mytest;

class MyFlowerInfo extends FlowerInfo{

//	String size;
//	int mon;
//	
//	public void size(String size){
//		this.size =size;
//
//		if(size == "소") {
//			mon = 10000;
//		}else if(size == "중") {
//			mon = 20000;
//		}else if(size == "대") {
//			mon = 30000;
//		}
//		System.out.println("꽃가격: "+ mon);
//		dis();
//		System.out.println("꽃크기:"+size+(", 꽃가격할인:")+mon+"원");
//	}
//	
//	public void dis() {
//		this.mon = mon/2;
//	}
//	
	private String size;
	private int mon;
	
	public void dis() {
	mon = (int)(mon*0.5);
}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public int getMon() {
		return mon;
	}

	public void setMon(int mon) {
		this.mon = mon;
	}

}

public class MyFlowerMain extends MyFlowerInfo{

	public static void main(String[] args) {
		
//		MyFlowerMain fw = new MyFlowerMain();
//		fw.setFlower("튤립");
//		fw.setColor("yellow");
//		MyFlowerInfo myfw = new MyFlowerInfo();
//		myfw.size("소");
//		System.out.println("꽃이름:"+fw.getFlower()+", 꽃색상: "+fw.getColor());

		MyFlowerMain my = new MyFlowerMain();
		my.setFlower("튤립");
		my.setColor("yellow");
		my.setMon(20000);
		my.setSize("대");
		System.out.println(my.getFlower());
		System.out.println(my.getColor());
		System.out.println(my.getSize());
		System.out.println(my.getMon());
		
		my.dis();	//가격 다운 실행
		System.out.println("---------");
		System.out.println(my.getMon());
		
	}

}
