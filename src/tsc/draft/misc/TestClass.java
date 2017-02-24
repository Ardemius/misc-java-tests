/**
 * 
 */
package tsc.draft.misc;

import java.io.FileNotFoundException;

/**
 * @author Administrateur
 * 
 */
public class TestClass {
	
	static boolean bool;
	
	final Integer integerTest;
	
	static char defaultUnicodeInstance;

	private class X {
		void do1() {
		}
	}

	private class Y extends X {
		void do2() {
		}
	}

	private int toto;

	/**
	 * 
	 */
	public TestClass() {
		super();

		arithmeticTest();
		castingTest();
		
		integerTest = new Integer(5);
	}

	private void castingTest() {
		X x1 = new X();
		X x2 = new Y();
		Y y1 = new Y();
		
		((Y)x2).do2();
	}

	public TestClass(int toto) {
		super();

		toto = 5;

		arithmeticTest();
		
		integerTest = new Integer(6);
		
		final Boolean booleanLocalTest;
		booleanLocalTest = new Boolean(true);
	}

	private void arithmeticTest() {
		int x = 7;
		int y = 0 / x;
		System.out.println("valeur de y : " + y);
		
		byte a = 127;
		byte b = (byte) 1;
		byte c = (byte) (a + b);
		System.out.println("c : " + c);
		
		byte d = (byte) 401;
		System.out.println("d : " + d);
		
		//byte tooMuch = 70000;
		float f = (float) 40000000000000.0;
		System.out.println("float f : " + f);
		
		byte i = 7;
		i += (i + 7);
		
		float d1 = Float.parseFloat("3.14d");
		System.out.println("d1 = " + d1);
		
		float f2 = 3.14f;
		
		byte b10 = 15;
		
		double x1 = 2.5;
		double y1 = 4.5;
		double z1 = 2;
		x1 = y1++ + ++x1/z1;
		System.out.println("x1 = " + x1);
		System.out.println("y1 = " + y1);
		
		float f11 = 1.6f;
		Long l1 = 40l;
		if (l1 == f11) {
			
		}
		
		float[][] fTab = {{40.0f}, {16f, 17f}};
		if (l1 == fTab[0][0]) {
			Boolean b1 = true;
		}
		System.out.println(" " + true);
		
		int a1 = 2, b1 = 2, c1 = 2;
		if (a1 > 3 && b1 > 3 | c1 == 2 ) {
			System.out.println("Good !");
		} else {
			System.out.println("Bad !");
		}
		
	}

	private final void clipper() {
		System.out.println("clipper !!!!");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new TestClass();
		AnimalWith4Legs a = new Horse();
		
		System.out.println("bool value is : " + bool);
		try {
			a.eat();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		char defaultUnicode = '\u0000';
		System.out.println("unicode default : " + defaultUnicode);
		System.out.println("unicode default instance : " + defaultUnicodeInstance);
		
		String x  = "Java";
		String y = x;
		System.out.println("x : " + x);
		System.out.println("y : " + y);
		
		x = x + " Bean";
		System.out.println("x après changement : " + x);
		System.out.println("y après changement: " + y);
		
		int key[] = new int[5];
		int key1 [] = new int[5];
		int[] key2 = new int[5];
		
		int[][] doubleKey = new int[5][];
		
	}

}

class AnimalWith4Legs {
	
	private int size;
	
	public void eat() throws Exception {
		System.out.println("Animal eats !");
	}

	public void printYourself() {

	}
	
	public void setSize(int size) {
		this.size = size;
	}
}

class Horse extends AnimalWith4Legs {
	public void printYourself() {
		super.printYourself();
	}

	public void eat() throws FileNotFoundException {
		System.out.println("Horse eats !");
	}
}
