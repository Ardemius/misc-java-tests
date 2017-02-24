package tsc.draft.misc;

public class VarArgsTest {
	
//	static void doStuff(int x, int... doArgs) {
//		System.out.println("je suis doStuff 2 paramètres !!!!");
//	}
	
	static void doStuff(int... doArgs) {
		System.out.println("je suis doStuff potentiellement 0 paramètre !!!!");
	}
	
	static void doStuff(int x) {
		System.out.println("je suis doStuff 1 paramètre !!!!");
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
