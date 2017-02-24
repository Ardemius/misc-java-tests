package tsc.draft.misc;

public class ConversionTest {

	private void test1() {
		char c1 = 65;
		System.out.println("c1 = " + c1);

		float f = 100000000;
		char c2 = (char) f;
		System.out.println("c2 = " + c2);
		
		f = 63999;
		char c3 = (char) f;
		System.out.println("c3 = " + c3);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ConversionTest ct = new ConversionTest();
		ct.test1();
	}

}
