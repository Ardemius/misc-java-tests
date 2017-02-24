package tsc.draft.misc;

public class FlowControlTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FlowControlTest fct = new FlowControlTest();
		fct.testSomethingAfterReturn();
	}

	public String testSomethingAfterReturn() {
		String s = "toto";
		
		return s;
		
		// example of unreachable code
		System.out.println("You are after return !");
	}

}
