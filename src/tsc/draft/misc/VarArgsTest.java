package tsc.draft.misc;

public class VarArgsTest {
	
//	static void doStuff(int x, int... doArgs) {
//		System.out.println("je suis doStuff 2 param�tres !!!!");
//	}
	
	static void doStuff(int... doArgs) {
		System.out.println("je suis doStuff potentiellement 0 param�tre !!!!");
	}
	
	static void doStuff(int x) {
		System.out.println("je suis doStuff 1 param�tre !!!!");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		doStuff(1);
		doStuff(1, 2);
		doStuff();

	}

}
