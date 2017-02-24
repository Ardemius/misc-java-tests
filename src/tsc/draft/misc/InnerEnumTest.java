package tsc.draft.misc;

class Coffee2 {
	
	public enum CoffeeSize {
		BIG, HUGE, OVERWHELMING;
	}
	
	CoffeeSize size;
}

public class InnerEnumTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Coffee2 drink = new Coffee2();
		drink.size = Coffee2.CoffeeSize.BIG;

	}

}
