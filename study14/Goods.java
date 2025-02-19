package study14;

abstract class GoodsInfo {

	public int quantity; //상품수량;
	abstract public void quantityUp(int n);
	abstract public void quantityDown(int n);
	public void quantityZero() {
		quantity = 0;
	}
}

public class Goods extends GoodsInfo{

	public void quantityUp(int n) {
		quantity+= n;
	}
	public void quantityDown(int n) {
		// 20 < 30
		if(quantity < n) {
//			quantity = 0;
			quantityZero();
		}else {
			quantity-= n;			
		}
	}
	
	public static void main(String[] args) {
		Goods goods = new Goods();
		
		System.out.println(goods.quantity); //100
		goods.quantityUp(100);
		System.out.println(goods.quantity); //50
		goods.quantityDown(50);
		System.out.println(goods.quantity); //0
		goods.quantityZero();
		System.out.println(goods.quantity); //-5
		goods.quantityDown(5);
		System.out.println(goods.quantity); //-5
	}
}

