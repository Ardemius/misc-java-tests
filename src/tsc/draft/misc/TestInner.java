package tsc.draft.misc;

public class TestInner {
	
	static int i = 10;
	
	TestInner(){
		System.out.println("Outer");
	}
	
	static class MyInner {

		MyInner() {
			// compiler error here if "i" is not a static member
			System.out.println(i);
		}
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new TestInner.MyInner();
	}

}
