package tsc.draft.misc;

public class PrivateTest {
	
	private void test() {
		System.out.println("c'est moi !");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new PrivateTest().test();
//		new OtherTest().test();

	}

}

class OtherTest {
	private void test() {
		System.out.println("c'est encore moi !");
	}
}
