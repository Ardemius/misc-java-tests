package tsc.draft.misc;
public class ArithmeticTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
        ArithmeticTest arithmeticTest = new ArithmeticTest();
        // arithmeticTest.someTest();
        arithmeticTest.divAndMul();
        arithmeticTest.incrementOperatorTest();
    }

    private void someTest() {
        short x;
        short y = 1;
        short z = 2;
        x = (short) (y + z);

        float a = 1.6f;
        short b = 2;
        // int c = a + b; // Type mismatch: cannot convert from float to int

        int f = 1;
        int g = f++;

        System.out.println("f = " + f);
        System.out.println("g = " + g);
    }

    private void divAndMul() {
        int a = 7;
        int b = -3;
        int res = a / b;
        int modulo = a % b;
        System.out.println("a / b = " + res + " and modulo = " + modulo);
    }
    
    private void incrementOperatorTest() {
    	int x = 0;
    	int y = 0;
    	
    	x=y++;
    	System.out.println("x = " + x);
    	System.out.println("y = " + y);
	}

}
