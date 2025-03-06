package lambda;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

interface Inter1{
	public void abc(String t);
}

public class ConsumerTest {

	public static void main(String[] args) {
		
		Inter1 it =(t)->{
			System.out.println(t);
		};
		it.abc("java1");
		
		Consumer<String> cons1 =(t)-> {
			System.out.println(t);
		};
		cons1.accept("java2");
		
		Consumer<Integer> cons2 = (t)->{
			System.out.println(t+100);
		};
		cons2.accept(22);
		
		BiConsumer<Integer, Integer> cons3 = (t1,t2) -> {
			System.out.println(t1+t2);
		};
		cons3.accept(100, 200);
		
		Consumer<String> strUp =(str)->{
			System.out.println(str.toUpperCase());
//			return str.toUpperCase();
		};
		strUp.accept("java");
		
	}

}
