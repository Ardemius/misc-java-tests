package tsc.draft.misc;

public class StaticOverriddingTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// static method can not be overridden
		Base b = new Derived();
		b.f();
	}

}

class Base {
	static void f () {
		System.out.println("I am Base");
	}
}

class Derived extends Base {
	// if "static" keyword is omitted here, it is a compiler error
	static void f () {
		System.out.println("I am Derived");
	}
}
