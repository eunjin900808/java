package study12;

public class MyCar {

	int maxSpeed;
	String carName;
	String carColor;
	MyCar(){ }
	
	public MyCar(String carName, int maxSpeed) {
		this.carName = carName;
		this.maxSpeed = maxSpeed;
	}
	public MyCar(String carName, int maxSpeed, String carColor) {
		this.carName = carName;
		this.maxSpeed = maxSpeed;
		this.carColor = carColor;
	}
	
	public void maxSpeedUpdate(int speed) {
		this.maxSpeed += speed;
	}
	
	public static void main(String[] args) {
		
		MyCar mycar = new MyCar();
		mycar.carName = "벤츠";
		mycar.maxSpeed = 350;
		mycar.carColor = "red";
		
		MyCar car1 = new MyCar("소나타", 230);
		MyCar car2 = new MyCar("그렌저", 300, "white");
		System.out.println(car1.carName + ", " + car1.maxSpeed);
		System.out.println(car2.carName + ", " + car2.maxSpeed);
		car1.maxSpeedUpdate(-20); //최고 속도의 가감
		System.out.println(car1.carName+", "+car1.maxSpeed);

	}

}
