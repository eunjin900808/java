package mytest;

class FlowerInfo{
	private String flower;
	private String color;
	
	public String getFlower() {
		return flower;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public void setFlower(String flower) {
		this.flower = flower;
	}
}

public class FlowerMain {

	public static void main(String[] args) {

		FlowerInfo fw = new FlowerInfo();
		fw.setColor("red");
		fw.setFlower("장미");
		System.out.println("꽃이름:"+fw.getFlower()+", 꽃색상:"+fw.getColor());

	}

}
