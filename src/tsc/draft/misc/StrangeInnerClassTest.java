package tsc.draft.misc;

public final class StrangeInnerClassTest {

	class Inner {
		void test() {
			if (StrangeInnerClassTest.this.bool)
				;
			{
				myMethod();
			}
		}
	}

	private boolean bool = false;

	public void myMethod() {
		System.out.println("myMethod");
	}

	public StrangeInnerClassTest() {
		(new Inner()).test();
	}

	public static void main(String[] args) {
		new StrangeInnerClassTest();
	}
}
